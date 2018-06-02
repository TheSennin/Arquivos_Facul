/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula07;
import static br.univali.kob.poo1.aula07.Professor.AcademicDegree.BACHELOR;
import static br.univali.kob.poo1.aula07.Professor.AcademicDegree.MASTER;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.math.BigDecimal;

/**
 *
 * @author Gustavo
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       State s1 = new State("Santa Catarina", "SC");
       City c1 = new City("Florianópolis", s1);
       Address a1 = new Address("Rua Floriano, 2012", null, c1, "88015200");
       System.out.println(a1.toString());
    }
}
