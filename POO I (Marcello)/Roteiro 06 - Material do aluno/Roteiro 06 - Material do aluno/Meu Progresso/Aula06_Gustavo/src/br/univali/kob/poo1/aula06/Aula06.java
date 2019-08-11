/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula06;
import static br.univali.kob.poo1.aula06.Professor.AcademicDegree.BACHELOR;
import static br.univali.kob.poo1.aula06.Professor.AcademicDegree.MASTER;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.math.BigDecimal;

/**
 *
 * @author Gustavo
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate myDate = LocalDate.parse("01/01/2017", dateFormat);
        LocalDate minDate = LocalDate.parse("01/01/2014", dateFormat);
        LocalDate maxDate = LocalDate.parse("01/01/2018", dateFormat);
        new ComparableValidator<LocalDate>().range(myDate, "My Date", minDate, maxDate);
        
        BigDecimal myNumber = new BigDecimal("100.45");
        BigDecimal minNumber = new BigDecimal("100.43");
        BigDecimal maxNumber = new BigDecimal("100.47");
        new ComparableValidator<BigDecimal>().range(myNumber, "my Number", minNumber, maxNumber);
        
        Integer myInt = 10;
        Integer minInt = 1;
        Integer maxInt = 10;
        new ComparableValidator<Integer>().range(myInt, "My Int", minInt, maxInt);
        
        String myStr  = "DDDD";
        String minStr = "CCCC";
        String maxStr = "EEEE";
        new ComparableValidator<String>().range(myStr, "My Integer", minStr, maxStr);
        
        System.out.println("Validações feitas com sucesso! Todo mundo passou!");
    }
}
