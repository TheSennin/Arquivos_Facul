package br.univali.kob.poo1.aula04;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 */
public abstract class Person {

    /**
     * Default constructor
     * @param name
     * @param dateOfBirth
     */
    public Person(String name, LocalDate dateOfBirth) {
        setName(name);
        setDateOfBirth(dateOfBirth);
    }

    /**
     * person's name
     */
    private String name;

    /**
     * Person's birthdate
     */
    private LocalDate dateOfBirth;

    /**
     * @return person's name
     */
    public String getName() {
        return name;
    }

    /**
     * @param value person's name
     */
    public void setName(String name) {
        this.name = name;
        //validadeState();
    }

    /**
     * @return person's date of birth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param value person's date of birth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        validadeState();
    }

    public int getAge() {
        Period period = null;
        period = period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }
    private void validadeState(){
        if(name.length() < 2 || name.length() > 40){
            throw new IllegalArgumentException("Name is out of range of " +
                    "[2..40] characters");
        }
        else
            if(dateOfBirth.equals(null) || dateOfBirth.isAfter(LocalDate.now())){
                throw new IllegalArgumentException("Invalid date of birth!");
            }
    }
}
