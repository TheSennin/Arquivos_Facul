package br.univali.kob.poo1.aula03;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 
 */
public class Professor extends Employee {

    /**
     * academic titulation
     */
    public enum AcademicDegree{
        BACHELOR("Bachelor", "0.00"),
        MASTER("Master", "0.15"),
        DOCTORATE("Doctorate (PhD)", "0.30");
        
        /**
         * Texto que descreve cada item enum.
         */
        private String description;
        /**
         * Valor do bônus em formato string para ser utilizado em valores BigDecimal
         */
        private String bonus;
        
        public String getDescription() {
            return description;
        }
        
        public String getBonus(){
            return bonus;
        }
        
        private AcademicDegree(String description, String bonus){
            this.description = description;
            this.bonus = bonus;
        }
        
    }
    
    private AcademicDegree academicDegree;

    /**
     * professor's academic degree description
     */
    private static final String DEGREE_DESCRIPTION[] = {"Bachelor","Master","Doctorate"};

    /**
     * professor's termination date
     */
    private LocalDate terminationDate;
    
     /**
     * @param id 
     * @param name 
     * @param dateOfBirth 
     * @param hireDate 
     * @param hoursPerWorkWeek 
     * @param academicDegree
     * @param AcademicDegree
     * @param hourlyRate
     */
    public Professor(int id, String name, LocalDate dateOfBirth, LocalDate hireDate, int hoursPerWorkWeek, BigDecimal hourlyRate, AcademicDegree academicDegree) {
        super(id, name, dateOfBirth, hireDate, hoursPerWorkWeek, hourlyRate);
        setAcademicDegree(academicDegree);
        terminationDate = null;
    }
    public void setAcademicDegree(AcademicDegree academicDegree){
        this.academicDegree = academicDegree;
    }
    public AcademicDegree getAcademicDegree(){
        return this.academicDegree;
    }

    /**
     *
     * @return the professor's academic degree
     */
    public AcademicDegree getAcademicDegreeDescription(){
        return academicDegree;
    }
    public BigDecimal getAcademicBonus(){
        BigDecimal bonus = super.getHourlyRate().multiply(new BigDecimal(academicDegree.getBonus()));
        return bonus;
    }
    
}