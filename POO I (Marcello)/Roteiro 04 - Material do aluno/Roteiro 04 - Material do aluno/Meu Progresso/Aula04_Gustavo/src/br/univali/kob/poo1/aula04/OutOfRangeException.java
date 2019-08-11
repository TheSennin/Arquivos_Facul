/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula04;

/**
 *
 * @author Gustavo
 */
public class OutOfRangeException extends IllegalArgumentException{
    /** Valor avaliado que está fora da faixa esperada ...3 lines*/
    private final int value;
    /** Texto que descreve o valor ...3 lines */
    private final String valueLabel;
    /** Valor mínimo definido pela faixa ...3 lines */
    private final int min;
    /** Valor máximo definido pela faixa ...3 */
    private final int max;
    
    /**
     * A mensagem é montada com o rótulo passado no parametro
     * 
     * @param value o valor avaliado que está fora da faixa esperada
     * @param valueLabel o texto que descreve o valor
     * @param min o valor mínimo aceitavel para a faixa
     * @param max o valor máximo aceitavel para a faixa
     */
    public OutOfRangeException(int value, String valueLabel, int min, int max){
        super("Value " + value + " for " + valueLabel + " is out of range [" +
                min + ".." + max + "]");
        this.value = value;
        this.valueLabel = valueLabel;
        this.min = min;
        this.max = max;
    }
    
    /**
     * @return o valor avaliado que está fora da faixa esperada.
     */
    public int getValue(){
        return value;
    }
    
    /**
     * @return o valor máximo aceitável para a faixa
     */
    public String getValueLabel(){
        return valueLabel;
    }
    
    /**
     * @return o valor mínimo aceitável para a faixa
     */
    public int getMin(){
        return min;
    }
    
    /**
     * @return o valor máximo aceitável para a faixa
     */
    public int getMax(){
        return max;
    }
    
}
