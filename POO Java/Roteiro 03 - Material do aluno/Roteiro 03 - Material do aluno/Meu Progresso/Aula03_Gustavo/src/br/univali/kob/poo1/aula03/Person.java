package br.univali.kob.poo1.aula03;

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
    }

    public int getAge() {
        Period period = null;
        period = period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }
}
