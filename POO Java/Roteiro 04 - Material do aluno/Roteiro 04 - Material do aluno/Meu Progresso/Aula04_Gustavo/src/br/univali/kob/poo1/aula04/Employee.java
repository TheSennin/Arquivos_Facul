package br.univali.kob.poo1.aula04;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Class Employee
 */
public class Employee extends Person {
    
    /**
     * Telescoping pattern
     * @param id 
     * @param name 
     * @param dateOfBirth
     */
    public Employee(int id, String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
        setId(id);
        //foi considerado que nunca instanciaremos um estudante já desligado
        setTerminationDate(null);
    }

    /**
     * Telescoping pattern
     * @param id 
     * @param name 
     * @param dateOfBirth 
     * @param hireDate
     */
    public Employee(int id, String name, LocalDate dateOfBirth, LocalDate hireDate) {
        this(id, name, dateOfBirth);
        setHireDate(hireDate);
    }

    /**
     * Telescoping pattern
     * @param id 
     * @param name 
     * @param dateOfBirth 
     * @param hireDate 
     * @param hoursPerWorkWeek
     */
    public Employee(int id, String name, LocalDate dateOfBirth, LocalDate hireDate, int hoursPerWorkWeek) {
        this(id, name, dateOfBirth, hireDate);
        setHoursPerWorkWeek(hoursPerWorkWeek);
    }

    /**
     * Telescoping pattern
     * @param id 
     * @param name 
     * @param dateOfBirth 
     * @param hireDate 
     * @param hoursPerWorkWeek 
     * @param hourlyRate
     */
    public Employee(int id, String name, LocalDate dateOfBirth, LocalDate hireDate, int hoursPerWorkWeek, BigDecimal hourlyRate) {
        this(id, name, dateOfBirth, hireDate, hoursPerWorkWeek);
        setHourlyRate(hourlyRate);
    }

    /**
     * employee's indentifier
     */
    private int id;

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
     * @return the employee's id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the employee's hire date
     */
    public LocalDate getHireDate() {
        return this.hireDate;
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
}