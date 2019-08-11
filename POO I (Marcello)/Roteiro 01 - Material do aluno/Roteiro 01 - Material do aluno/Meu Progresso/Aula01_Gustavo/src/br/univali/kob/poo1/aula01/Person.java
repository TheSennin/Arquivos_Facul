package br.univali.kob.poo1.aula01;

import java.time.LocalDate;

/**
 *
 */
public class Person {

    /**
     * Default constructor
     */
    public Person() {
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

}
