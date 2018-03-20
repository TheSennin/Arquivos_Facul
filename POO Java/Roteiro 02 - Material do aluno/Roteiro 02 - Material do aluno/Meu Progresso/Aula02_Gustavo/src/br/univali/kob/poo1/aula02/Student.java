package br.univali.kob.poo1.aula02;

import java.util.*;
import java.time.LocalDate;
/**
 * 
 */
public class Student extends Person {

    /**
     * Default constructor
     */
    public Student() {
    }

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
     * simula um getter que informa se o aluno está ou não matriculado a partir da data de desligamento.
     */
    public boolean isEnrolled() {
        Object dropdate = null;
        return dropdate == null;
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

}