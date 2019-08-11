/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.m1.programação;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Repositorio {
    
    /**
     * Método para gravação de dados no arquivo
     * @param caminho caminho onde ´arquivo será gravado no disco
     * @param ArrayList lista a ser inserido no arquivo
     * @return verdadeiro ou falso de acordo com o sucesso na gravação
     */
    public static boolean write(String caminho, ArrayList texto){
        try{
            FileWriter arq = new FileWriter(caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
        
    public static String read(String caminho){
        String conteudo = "";
        try{
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while(linha != null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
            
            }catch (IOException ex){
                System.out.println("Erro: não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex){
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
        if(conteudo.contains("Erro"))
            return "";
        else
            return conteudo;
    }
}
