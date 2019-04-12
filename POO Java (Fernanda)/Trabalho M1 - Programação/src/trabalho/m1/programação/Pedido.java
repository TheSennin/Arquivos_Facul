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
public class Pedido implements Serializable{
    
    /**
     * Atributos
     */
    private int numero;
    private String data;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();
    
    public Pedido(){
        this(0,null,null);
    }
    
    public Pedido(int numero, String data, Cliente cliente){
        setNumero(numero);
        setData(data);
        setCliente(cliente);
    }
    
    public Pedido(int numero, String data, Cliente cliente, ItemPedido item){
        setNumero(numero);
        setData(data);
        this.itens.add(item);
        setCliente(cliente);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addItens(ItemPedido item){
        itens.add(item);
    }
    
    public void removerItem(ItemPedido item){
        itens.remove(item);
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
