/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 6322875
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Assegurado assegurado = new Assegurado("Gustavo", "Porto Seguro", 6322875);
       NaoAssegurado naoAssegurado = new NaoAssegurado("Andre", 50, 3455, 59988);
       assegurado.mostra();
       naoAssegurado.mostra();
    }
    
}
