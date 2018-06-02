/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula07;

/**
 *
 * @author Gustavo
 */
public class InvalidSequenceException extends IllegalStateException {
    
    /**
     * Caminho completo para o arquivo de sequencia
     */
    private final String fileName;
    /**
     * Exceção checada encapsulada
     */
    private final Exception ex;
    
    /**
     * Encapsula exceção checada na leitura/escrita de um arquivo de sequencia
     * 
     * @param fileName o caminho completo para o arquivo de sequencia
     * @param ex a exceção checada encapsulada
     */
    public InvalidSequenceException(String fileName, Exception ex){
        super(ex.getMessage() + " - Filename: \"" + fileName + "\".", ex);
        this.fileName = fileName;
        this.ex = ex;
    }
    
    /**
     * @return o caminho completo para o arquivo de sequencia
     */
    public String getFileName(){
        return fileName;
    }
    
    /**
     * @return a exceção checada encapsulada
     */
    public Exception getException(){
        return ex;
    }
}
