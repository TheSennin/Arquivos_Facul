package br.univali.kob.poo1.aula07;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/**
 * Class Employee
 */
public class Employee extends Person implements Serializable{

    /**
     * employee's hire date
     */
    private LocalDate hireDate;

    /**
     * employee's termination date
     */
    private LocalDate terminationDate;

    /**
     * employee's hours per work in the week
     */
    private int hoursPerWorkWeek;

    /**
     * valor per hour
     */
    private BigDecimal hourlyRate;
    
    /**
     * 
     * @param name
     * @param dateOfBirth
     * @param hireDate
     * @param hoursPerWorkWeek
     * @param hourlyRate 
     * @param terminationDate 
     */
    
    public Employee(String name, LocalDate dateOfBirth, String email, Address address, LocalDate hireDate, int hoursPerWorkWeek, BigDecimal hourlyRate, LocalDate terminationDate) {
        super(name, dateOfBirth, email, address);
        setHireDate(hireDate);
        setHoursPerWorkWeek(hoursPerWorkWeek);
        setHourlyRate(hourlyRate);
        setTerminationDate(terminationDate);
        validateState();
    }
    
     /**
     * @param name
     * @param dateOfBirth
     * @param hireDate
     * @param hoursPerWorkWeek
     * @param hourlyRate 
     * @param terminationDate 
     */
    public Employee(String name, String dateOfBirth, String email, Address address, String hireDate, int hoursPerWorkWeek, String hourlyRate, String terminationDate){
        super(name, dateOfBirth, email, address);
        setHireDate(LocalDate.parse(hireDate, AppConfig.DATE_FORMAT));
        setHoursPerWorkWeek(hoursPerWorkWeek);
        setHourlyRate(new BigDecimal(hourlyRate));
        if(terminationDate != null)
            setTerminationDate(LocalDate.parse(terminationDate, AppConfig.DATE_FORMAT));
        else
            this.terminationDate = null;
        validateState();
    }
    
     /**
     * @return the employee's hire date
     */
    public LocalDate getHireDate() {
        return this.hireDate;
    }
    
    /**
     * 
     * @return @return um conjunto de linhas atributo = valor que será incluído 
     * na implementação herdada de toString();
     */
    @Override
    protected String appendToString(){
        StringBuilder output = new StringBuilder();
        output.append("  // Employee " + AppConfig.NEW_LINE);
        output.append("hireDate = " + hireDate.format(AppConfig.DATE_FORMAT) + 
                AppConfig.NEW_LINE);
        output.append(((terminationDate==null)? null : terminationDate.format(
        AppConfig.DATE_FORMAT)) + AppConfig.NEW_LINE);
        output.append("hoursPerWorkWeek = " + hoursPerWorkWeek + 
                AppConfig.NEW_LINE);
        output.append("hourlyRate = " + hourlyRate.toPlainString() + 
                AppConfig.NEW_LINE);
        return output.toString();
    }
    
    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj))
            return false;
        Employee employee = (Employee)obj;
        return
            // testa primeiro com == para ser mais eficiente
            (hireDate == employee.hireDate || hireDate.equals(employee.hireDate)) &&
            Objects.equals(terminationDate, employee.terminationDate) &&
            hoursPerWorkWeek == employee.hoursPerWorkWeek &&
            (hourlyRate == employee.hourlyRate || hourlyRate.equals(employee.hourlyRate));
    }
    
    @Override
    public int hashCode(){
        return
            super.hashCode() ^
            hireDate.hashCode() ^
            (terminationDate == null ? 19 : terminationDate.hashCode()) ^
            hoursPerWorkWeek ^
            getHourlyRate().hashCode();
    }

    /**
     * @param hireDate
     */
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return the employee's termination date
     */
    public LocalDate getTerminationDate() {
        return this.terminationDate;
    }

    /**
     * @param terminationDate
     */
    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }

    /**
     * @return the employee's hours of work in the week
     */
    public int getHoursPerWorkWeek() {
        return this.hoursPerWorkWeek;
    }

    /**
     * @param hoursPerWorkWeek
     */
    public void setHoursPerWorkWeek(int hoursPerWorkWeek) {
        this.hoursPerWorkWeek = hoursPerWorkWeek;
    }

    /**
     * {@inheritDoc} ajusta o valor da hora do professor de acordo com o nivel
     * academico
     * @return the employee's hourly rate
     */
    public BigDecimal getHourlyRate() {
        return this.hourlyRate;
    }

    /**
     * @param hourlyRate
     */
    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * this operation tells if the employee is or not working yet
     * @return true or false
     */
    public boolean isEmployed(){
        if(getTerminationDate() == null){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @return years of service
     */
    public int getYearsOfService() {
        if(isEmployed()){
            Period period = Period.between(getHireDate(), LocalDate.now());
            return period.getYears();
        }
        else{
            Period period = Period.between(getHireDate(), getTerminationDate());
            return period.getYears();
            
        }
    }

    /**
     * Calcula o salário base do empregado em R$, multiplicando a 
     * quantidade de horas contratadas por semana pelo valor contratado
     * da hora. O salário base é fixo, não sendo afetado por faltas do empregado.
     * 
     * @return o valor do salário base semanal
     */
    public BigDecimal getRegularWeekSalary() {
        BigDecimal value = new BigDecimal(hoursPerWorkWeek);
        value = value.multiply(getHourlyRate());
        return value.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }
    /**
     * This method will return the weekly payment, with the discounts
     * of the missing days
     * @param absentHours
     * @return the net week payment
     */
    public BigDecimal getWeekPayment(int absentHours){
        int workhours = getHoursPerWorkWeek() - absentHours;
        BigDecimal weekpayment = new BigDecimal(workhours);
        weekpayment =  weekpayment.multiply(getHourlyRate());
        return weekpayment.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }
    private void validateHoursPerWorkWeek() {
        if(hoursPerWorkWeek < 1 || hoursPerWorkWeek > 40){
            throw new IllegalArgumentException("Hours Per Work Week (" + 
                    ") is out of range [1..40]");
        }
    }
    private void validateHireDate(){
        if(hireDate == null || hireDate.isAfter(LocalDate.now()))
                throw new IllegalArgumentException("Inválid Hire Date!");
    }
    private void validateHourlyRate(){
        if(hourlyRate.equals(BigDecimal.ZERO))
            throw new IllegalArgumentException("Inválid Hourly Rate!");
    }
    private void validateTerminationDate(){
        if(terminationDate != null && terminationDate.isBefore(hireDate))
            throw new IllegalArgumentException("Inválid termination date!");
    }
    private void validateIsEmployed(){
        if(isEmployed() && terminationDate != null)
            throw new IllegalArgumentException("Inválid state: an employed" + 
                    " employee cannot have a termination date!");
    }
      
    private void validateState(){
          validateHoursPerWorkWeek();
          validateHireDate();
          validateHourlyRate();
          validateTerminationDate();
          validateIsEmployed();
    }
}