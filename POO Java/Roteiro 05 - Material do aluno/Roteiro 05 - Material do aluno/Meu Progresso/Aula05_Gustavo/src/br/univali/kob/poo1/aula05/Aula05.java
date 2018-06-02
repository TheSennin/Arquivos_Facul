/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula05;
import static br.univali.kob.poo1.aula05.Professor.AcademicDegree.BACHELOR;
import static br.univali.kob.poo1.aula05.Professor.AcademicDegree.MASTER;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.math.BigDecimal;

/**
 *
 * @author Gustavo
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor professor = new Professor("Gustavo", "08/03/1998", "03/04/2018", 40, "8.2", BACHELOR, null);
        System.out.println(professor.getAcademicDegreeDescription());
        System.out.println(professor.getAcademicBonus());
        System.out.println(professor.getId());
        System.out.println("o estado de professor é: " + professor.toString());
    }
}
