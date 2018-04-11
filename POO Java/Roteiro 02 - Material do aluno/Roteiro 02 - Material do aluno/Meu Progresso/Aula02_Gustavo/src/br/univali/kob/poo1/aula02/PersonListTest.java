/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula02;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Rafaela
 */
public class PersonListTest {
    private Person[] personList = new Person[9];
    private Student createStudent(int rollNumber, String name,
            String dateOfBirth, String enrollmentDate){
        System.out.println("test case: createStudent");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Student student = new Student(rollNumber, name, LocalDate.parse(dateOfBirth, format));
        student.setEnrollmentDate(LocalDate.parse(enrollmentDate, format));
        return student;
    }
    private Employee createEmployee(int id, String name, String dateOfBirth,
            String hireDate, String hourlyRate, int hoursPerWorkWeek){
        System.out.println("test case: createEmployee");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Employee employee = new Employee(id, name, LocalDate.parse(dateOfBirth, format));
        employee.setHireDate(LocalDate.parse(hireDate, format));
        employee.setHourlyRate(new BigDecimal(hourlyRate));
        employee.setHoursPerWorkWeek(hoursPerWorkWeek);
        return employee;
    }
    private void createPersonList(){
        System.out.println("test case: createPersonList");
        //criando empregados...
        personList[0] = createEmployee(1, "Orin Curry", "15/01/1976", "01/03/2000", "22.80", 40);
        personList[1] = createEmployee(2, "Susan Kent-Barr", "06/10/1969", "09/08/1995", "25.23", 40);
        //criando estudantes...
        personList[2] = createStudent(100, "Bruce Wayne", "02/05/1996", "01/03/2017");
        personList[3] = createStudent(100, "Emma Grace Frost", "23/09/1994", "31/07/2016");
        //agora percorrendo a lista (note que foram preenchidos apenas
        //4 elementos de um vetor de 9 posições
        for(int i = 0; i < 4; i++){
            System.out.printf("%s, %d years old\n", personList[i].getName(), personList[i].getAge());
        }
        System.out.println();
    }
    
    /** Carga de teste: executa todos os casos de teste ...3 lines */
    public void run() {
        System.out.printf("\n\n\n******* aula02: PersonListTest ********\n\n");
        createPersonList();
    }
}
