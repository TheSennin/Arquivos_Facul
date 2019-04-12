/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.m1.programação;

import java.io.EOFException;
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
public class ClienteRepositorio implements Serializable {
    
    public static void Write(String caminho, ArrayList c){
        try{
            FileOutputStream arq = new FileOutputStream(caminho);
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(c);
            obj.flush();
            obj.close();
            System.out.println("Sucesso ao gravar cliente no arquivo!");
        }catch(IOException e){
            e.getMessage();
        }
    }
    
    public static ArrayList Read(String caminho) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Cliente> a = new ArrayList();
        try{
            FileInputStream arq = new FileInputStream(caminho);
            ObjectInputStream obj = new ObjectInputStream(arq);

            a = (ArrayList)obj.readObject();
            obj.close();
            System.out.println("Arquivo lido com sucesso!");
        }catch(FileNotFoundException e){
            System.out.println("Banco de clientes não encontrado!");
        }
        return a;   
    }
}
