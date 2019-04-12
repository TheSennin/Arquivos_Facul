/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.m1.programação;

import java.io.Serializable;

/**
 *
 * @author Gustavo
 */
public class Livro implements Serializable{
    
    private String ISBN;
    private String titulo;
    private String autor;
    private float precoUnitario;
    
    /**
     * Construtor default
     * @param ISBN
     * @param titulo
     * @param autor
     * @param precoUnitario 
     */
    public Livro(String ISBN, String titulo, String autor, float precoUnitario){
        setISBN(ISBN);
        setTitulo(titulo);
        setAutor(autor);
        setPrecoUnitario(precoUnitario);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("\r\nISBN: " + getISBN());
        output.append("\r\nTitulo: " + getTitulo());
        output.append("\r\nAutor: " + getAutor());
        output.append("\r\nPreço Unitário: " + getPrecoUnitario());
        return output.toString();
    }
    
    
}
