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
        try{
                FileInputStream arq = new FileInputStream(caminho);
                ObjectInputStream obj = new ObjectInputStream(arq);
                l = (ArrayList)obj.readObject();
                obj.close();
                System.out.println("Banco de Livros lido com sucesso!\r\n");
        }catch(FileNotFoundException e){
            System.out.println("Banco de livros não encontrado!");
        }
        return l;
    } 
}
