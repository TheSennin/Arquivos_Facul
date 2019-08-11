/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.m1.programação;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Gustavo
 */
public class Pedido implements Serializable{
    
    /**
     * Atributos
     */
    private int numero;
    private String data;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();
    
    public Pedido(){
    }
    
    public Pedido(Cliente cliente){
        setCliente(cliente);
        
        Random gerador = new Random();
        this.numero = gerador.nextInt(9999);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
	Date date = new Date(); 
	this.data = dateFormat.format(date); 
    }
    
    public Pedido(Cliente cliente, ItemPedido item){
        addItens(item);
        setCliente(cliente);
        
        Random gerador = new Random();
        this.numero = gerador.nextInt(9999);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
	Date date = new Date(); 
	this.data = dateFormat.format(date); 
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero() {
        this.numero = numero;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) { 
        this.data = data;
    }
    
    public Cliente getCliente() {
        if(this.cliente == null){
            System.out.println("pedido: cliente nulo");
            return new Cliente();
        }else
            return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addItens(ItemPedido item){
        this.itens.add(item);
    }
    
    public void removerItem(ItemPedido item){
        this.itens.remove(item);
    }
    
    public String getItens(){
        if(itens.isEmpty()){
            return "Nenhum item adicionado!\r\n";
        }else{
            StringBuilder output = new StringBuilder();
            for(int i=0;i<itens.size();i++){
                output.append(itens.get(i));
            }
            return output.toString();
        }
    }
    
    public float getTotal(){
        float total = 0;
        for(int i=0;i<itens.size();i++){
            total+= itens.get(i).getPreco();
        }
        return total;
    }
    
    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("Pedido Numero: " + getNumero());
        output.append("\r\nCliente: " + cliente.getNome());
        output.append("\r\nData: " + getData());
        output.append("\r\r\n\nItens do pedido: " + getItens());
        output.append("\r\nTotal: " + getTotal());
        output.append("\r\n------------------------");
        output.append("\r\n");
        return output.toString();
    }
}
