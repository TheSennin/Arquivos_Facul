/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 *
 * @author Gustavo
 */
public class Sequence {
    
    /**
     * o nome do arquivo de persistência
     */
    private final String FILENAME;
    /**
     * nome do id corrente
     */
    private Integer current;
    
    /**
     * default constructor
     * @param fileName nome do arquivo
     */
    public Sequence(String fileName){
        FILENAME = fileName;
    }
    
    /**
     * Carrega o valor corrente da sequencia do arquivo para a memória
     * 
     * @throws InvalidSequenceException se houver algum problemacom o arquivo
     */
    private void load(){
        //não precisa usar um buffer
        try(ObjectInput input = new ObjectInputStream(new FileInputStream(FILENAME));){
            current = (Integer)input.readObject();
        }catch (FileNotFoundException ex){
            //se caminho/arquivo ainda não existe
            current = 0;
        } catch (Exception ex){
            //qualquer outra exceção será encapsulada
            throw new InvalidSequenceException(FILENAME, ex);
        }
    }
    
}
