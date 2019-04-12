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

       /*Cliente c1 = new Cliente(01,"Gustavo", "998039392", "gus@hotmail");
       Cliente c2 = new Cliente(02,"Gabriela", "000048980", "gab@hotmail");
       Livro l1 = new Livro("13246","Alice no país das maravilhas","Lewis Carroll", (float)59.90);
       ItemPedido ip = new ItemPedido(l1,2);
       Pedido p1 = new Pedido(01, "01/02/19",c1,ip);
       c1.addPedidos(p1);
       
       Livro l2 = new Livro("13246","O Hobbit","Unknown", (float)109.90);
       ItemPedido ip2 = new ItemPedido(l2,4);
       p1.addItens(ip2);
       
       
       Pedido p2 = new Pedido(02, "01/02/19",c1,ip);
       c1.addPedidos(p2);
       
       
       String arq = c1.getNome() + ".dat";
       ClienteRepositorio.Write(arq, c1);
       
       
       Cliente c = (Cliente)ClienteRepositorio.Read("Gustavo.dat");
       c.pedidosEfetuados();
       */
       Menu.carregarArquivos();
       Menu.menuPrincipal();
       
       
       
       
    }
    
}
