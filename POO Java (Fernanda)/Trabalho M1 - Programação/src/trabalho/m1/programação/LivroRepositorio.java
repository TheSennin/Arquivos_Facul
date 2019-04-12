/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.m1.programação;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class LivroRepositorio { 
    public static void Write(String caminho, ArrayList l){
        try{
            FileOutputStream arq = new FileOutputStream(caminho);
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(l);
            obj.flush();
            obj.close();
            System.out.println("Sucesso ao gravar livro no arquivo!");
        }catch(IOException e){
            e.getMessage();
        }
    }
    public static ArrayList Read(String caminho) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList l = new ArrayList();
        FileInputStream arq = new FileInputStream(caminho);
        ObjectInputStream obj = new ObjectInputStream(arq);
        try{
            if((ArrayList)obj.readObject() == null){
                System.out.println("Banco de livros nulo!\r\n");
            }else{
                l = (ArrayList)obj.readObject();
                obj.close();
                System.out.println("Arquivo lido com sucesso!\r\n");
            } 
        }catch(FileNotFoundException e){
            System.out.println("Banco de livros não encontrado!");
        }
        return l;
    } 
}
