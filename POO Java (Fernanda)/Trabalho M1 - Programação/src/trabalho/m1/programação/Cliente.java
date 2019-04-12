/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.m1.programação;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Cliente implements Serializable{
    
    private int codigo, numClientes;
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    
    public Cliente(){
        this(-1,null,null,null);
    }
    
    /**
     * Construtor default
     * @param codigo
     * @param nome
     * @param telefone
     * @param email 
     */
    public Cliente(int codigo, String nome, String telefone, String email){
        setCodigo(codigo);
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        numClientes++;
    }

    public void addPedidos(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    public String mostraPedidos(){
        StringBuilder output = new StringBuilder();
        for(int i=0;i<pedidos.size();i++){
            output.append(pedidos.get(i));
        }
        return output.toString();
    }
    
    public Pedido pesquisaPedido(int num){
        Pedido p = null;
        for(int i=0;i<pedidos.size();i++){
            if(pedidos.get(i).getNumero() == num){
                p = pedidos.get(i);
                return p;
            }
        }
        return p;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    
    public void setNumClientes(int numClientes){
        this.numClientes = numClientes;
    }
    
    public int getNumClientes(){
        return this.numClientes;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void pedidosEfetuados(){
        System.out.println("\r\nPedidos Efetuados: ");
        System.out.println(mostraPedidos());
    }
    
    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("\r\nCódigo Cliente: " + getCodigo());
        output.append("\r\nNome: " + getNome());
        output.append("\r\nTelefone: " + getTelefone());
        output.append("\r\nEmail: " + getEmail());
        output.append("\r\n----------------------");
        return output.toString();
    }
    
    
}
