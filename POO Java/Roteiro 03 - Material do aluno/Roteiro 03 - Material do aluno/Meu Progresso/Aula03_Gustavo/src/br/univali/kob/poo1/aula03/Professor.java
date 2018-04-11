package br.univali.kob.poo1.aula03;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 
 */
public class Professor extends Employee {

    /**
     * professor's academic degree: BACHELOR
     */
    public static final int BACHELOR = 0;

    /**
     * professor's academic degree: MASTER
     */
    public static final int MASTER = 1;

    /**
     * professor's academic degree: DOCTORATE
     */
    public static final int DOCTORATE = 2;

    /**
     * professor's academic degree description
     */
    private static final String DEGREE_DESCRIPTION[] = {"Bachelor","Master","Doctorate"};

    /**
     * professor's academic degree
     */
    private int academicDegree;

    /**
     * professor's termination date
     */
    private LocalDate terminationDate;
    
     /**
     * @param id 
     * @param name 
     * @param academicDegree
     * @param hourlyRate
     */
    public Professor(int id, String name, LocalDate dateOfBirth, LocalDate hireDate, int hoursPerWorkWeek, BigDecimal hourlyRate, int academicDegree) {
        super(id, name, dateOfBirth, hireDate, hoursPerWorkWeek, hourlyRate);
        setAcademicDegree(academicDegree);
        terminationDate = null;
    }
    public void setAcademicDegree(int academicDegree){
        this.academicDegree = academicDegree;
    }
    public int getAcademicDegree(){
        return this.academicDegree;
    }
    public String getAcademicDegreeDescription(){
        return DEGREE_DESCRIPTION[academicDegree];
    }
    public BigDecimal getAcademicBonus(){
        BigDecimal bonus = new BigDecimal("0.0").setScale(2, BigDecimal.ROUND_HALF_EVEN);
        if (academicDegree == MASTER){
            bonus = super.getHourlyRate().multiply(new BigDecimal("0.15"));
        } else if (academicDegree == DOCTORATE){
            bonus = super.getHourlyRate().multiply(new BigDecimal("0.30"));
        }
        return bonus;
    }
    
}