/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula07;

import java.time.format.DateTimeFormatter;

/**
 * Classe genérica para validação de dados.
 * 
 * @author Gustavo
 * 
 * @param <Type> qualquer classe que implemente comparable
 */
public class ComparableValidator <Type extends Comparable> extends Validator{
    
    private static DateTimeFormatter dateFormat;
    
    public ComparableValidator(){
        dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
    
    public ComparableValidator(DateTimeFormatter format) {
        dateFormat = format;
    }
    
    /**
     * Verifica se um valor comparable está dentro de uma faixa específica
     * 
     * @param value o valor a ser validado
     * @param valueLabel o texto referente ao valor que será utilizado na exceção
     * @param min o valor mínimo para a faixa (inclusive)
     * @param max o valor máximo para a faixa (inclusive)
     * 
     * @throws NullPointerException se o valor for null
     * @throws IllegalArgumentException se o valor estiver fora da faixa específica
     */
    public final void range(Type value, String valueLabel, Type min, Type max){
        notNull(value, valueLabel);
        if (value.compareTo(min) <= -1 || value.compareTo(max) >= 1){
            throw new OutOfRangeException(value.toString(),
                    value.getClass().getSimpleName() + "." + valueLabel, min.toString(), max.toString());
        }
    }
    
    /**
     * Verifica se um valor Comparable é menor ou igual ao outro valor
     * 
     * @param value o valor a ser validado
     * @param valueLabel o texto referente ao valor que será utilizado na exceção
     * @param otherValue o valor a ser comparado
     * 
     * @throws NullPointerException se um dos valores for null
     * @throws IllegalArgumentException se value não for menor ou igual ao outro valor
     */
    public final void lessOrEquals(Type value, String valueLabel, Type otherValue){
        notNull(value, valueLabel);
        notNull(otherValue, "Other Value");
        if (value.compareTo(otherValue) > 0){
            throw new IllegalArgumentException(valueLabel + " (" + value.toString()
            + ") must be less than or equals to " + otherValue);
        }
    }
}
