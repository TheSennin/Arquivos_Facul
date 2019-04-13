/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.m1.programação;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class TrabalhoM1Programação {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        
              
       /*Cliente c1 = new Cliente(1,"Jeferson","65656","fdhufdghu");
       Livro l1 = new Livro("1515","O Hobbit","desconhecido", (float) 59.9);
       Pedido p1 = new Pedido(c1);
       ItemPedido ip = new ItemPedido(l1,2); 
       p1.addItens(ip);
       System.out.println(p1.toString());*/
       
       Menu.carregarArquivos();

       Menu.menuPrincipal();
       
    }
}
