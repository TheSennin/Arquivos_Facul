package br.univali.kob.poo1.aula07;

import java.io.Serializable;
import java.util.*;
import java.time.LocalDate;
/**
 * 
 */
public class Student extends Person implements Serializable{

    /**
     * Número de Matrícula do estudante.
     */
    private int rollNumber;

    /**
     * Data na qual o estudante foi admitido (primeira matrícula).
     */
    private LocalDate enrollmentDate;

    /**
     * Data na qual o estudante se desligou da instituição.
     */
    private LocalDate dropDate;
    
     /**
     * @param rollNumber 
     * @param name 
     * @param dateOfBirth 
     * @param enrollmentDate 
     * @param dropDate
     */
    public Student(int rollNumber, String name, LocalDate dateOfBirth, String email, Address address, LocalDate enrollmentDate, LocalDate dropDate) {
        super(name, dateOfBirth, email, address);
        setRollNumber(rollNumber);
        setEnrollmentDate(enrollmentDate);
        setDropDate(dropDate);
        validateState();
    }
    
    public Student(int rollNumber, String name, String dateOfBirth, String email, Address address, String enrollmentDate, String dropDate){
        super(name, dateOfBirth, email, address);
        setRollNumber(rollNumber);
        setEnrollmentDate(LocalDate.parse(enrollmentDate, AppConfig.DATE_FORMAT));
        setDropDate(LocalDate.parse(dropDate, AppConfig.DATE_FORMAT));
        validateState();
    }
    
    /**
     * 
     * @return @return um conjunto de linhas atributo = valor que será incluído 
     * na implementação herdada de toString();
     */
      protected String appendToString(){
      StringBuilder output = new StringBuilder();
      output.append(this.getClass().getName() + " {" + AppConfig.NEW_LINE);
      output.append("  // Student" + AppConfig.NEW_LINE);
      output.append("  roll number = " + rollNumber + AppConfig.NEW_LINE);
      output.append("  Enrollment Date = " + enrollmentDate + AppConfig.NEW_LINE);
      output.append(((dropDate==null)? null : dropDate.format(
      AppConfig.DATE_FORMAT)) + AppConfig.NEW_LINE);
      output.append("}" + AppConfig.NEW_LINE);
      return output.toString();     
    }
      
    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj))
            return false;
        Student student = (Student)obj;
        return
                (rollNumber == student.rollNumber) &&
                Objects.equals(dropDate, student.dropDate) &&
                enrollmentDate == student.enrollmentDate;
    }
    
    @Override
    public int hashCode(){
        return
            super.hashCode() ^
            rollNumber ^
            (dropDate == null ? 19 : dropDate.hashCode()) ^
            enrollmentDate.hashCode();
    }

    /**
     * simula um getter que informa se o aluno está ou não matriculado a partir da data de desligamento.
     * @return se o aluno está matriculado
     */
    public boolean isEnrolled() {
        return dropDate == null;
    }

    /**
	 * getter
     * @return a data na qual o estudante foi admitido (primeira matrícula).
     */
    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
	 * setter
     * @param enrollmentDate a data na qual o estudante foi admitido (primeira matrícula).
     */
    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    /**
     * @return a data na qual o estudante se desligou da instituição, null se ainda matriculado
     */
    public LocalDate getDropDate() {
        return this.dropDate;
    }

    /**
     * @param dropDate a data na qual o estudante se desligou da instituição
     */
    public void setDropDate(LocalDate dropDate) {
        this.dropDate = dropDate;
    }

    /**
     * @return o numero da matrícula do estudante
     */
    public int getRollNumber() {
        return this.rollNumber;
    }

    /**
     * @param rollNumber o numero da matrícula do estudante
     */
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    private void validateEnrollmentDate(){
        if(enrollmentDate.isAfter(LocalDate.now()))
                throw new IllegalArgumentException("Inválid Enrollment Date!");
    }
    
    private void validateDropDate(){
        if(dropDate!= null && dropDate.isBefore(enrollmentDate))
            throw new IllegalArgumentException("Inválid Drop Date!");
    }
    
    private void validateIsEnrolled(){
        if(isEnrolled() && dropDate != null)
            throw new IllegalArgumentException("Inválid Informations!");
    }
    /**
     * Validator for the informations sent to the program
     */
    private void validateState(){
        validateEnrollmentDate();
        validateDropDate();
        validateIsEnrolled();
    }
}