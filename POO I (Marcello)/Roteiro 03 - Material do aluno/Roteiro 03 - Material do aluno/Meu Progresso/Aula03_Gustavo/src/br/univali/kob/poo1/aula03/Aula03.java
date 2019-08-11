/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula03;
import static br.univali.kob.poo1.aula03.Professor.AcademicDegree.BACHELOR;
import static br.univali.kob.poo1.aula03.Professor.AcademicDegree.MASTER;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.math.BigDecimal;

/**
 *
 * @author Gustavo
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Professor professor = new Professor(1, "Gustavo", LocalDate.parse("08/03/1998", format), LocalDate.parse("03/04/2018",format), 40, new BigDecimal("8.2"), BACHELOR);
        System.out.println(professor.getAcademicDegreeDescription());
        System.out.println(professor.getAcademicBonus());
    }
}
