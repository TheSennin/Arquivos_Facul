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
public class ItemPedido implements Serializable{
    
    /**
     * Atributos
     */
    private float preco;
    private int quantidade;
    private Livro livro;
    
    /**
     * Construtor Default
     * @param livro objeto da classe livro
     * @param preco
     * @param quantidade 
     */
    public ItemPedido(Livro livro, int quantidade){
        setLivro(livro);
        setQuantidade(quantidade);
        setPreco(this.livro.getPrecoUnitario());
    }
    
    public ItemPedido(Livro livro, int quantidade, float precoUnitario){
        setLivro(livro);
        setPreco(preco);
        setQuantidade(quantidade);
    }
    /**
     * metodos
     */

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco*quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setLivro(Livro livro){
        this.livro = livro;
    }
    
    public Livro getLivro(){
        return this.livro;
    }
    
    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append(getLivro());
        output.append("\r\nQuantidade: " + getQuantidade());
        output.append("\r\nSubTotal: " + getPreco());
        output.append("\r\n------------------------");
        return output.toString();
    }
}
