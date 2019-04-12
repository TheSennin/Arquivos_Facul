/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.m1.programação;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Menu {
    
    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Cliente> clientes;
    private static ArrayList<Livro> livros;
    private static String nome, telefone, email, ISBN, titulo, autor, data;
    private static int numero,codigo, opcao,i=0;
    private static float preco;
    
    
    public static void menuPrincipal() throws IOException, FileNotFoundException, ClassNotFoundException{
       do{
            System.out.println("### Sistema de Livraria ###");
	    System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Livro");
	    System.out.println("3 - Novo Pedido");
            System.out.println("4 - Adicionar Itens ao Pedido");
            System.out.println("5 - Relatório Clientes");
       	    System.out.println("6 - Relatório de Livros");
            System.out.println("7 - Pesquisar Pedidos Por Cliente");
            System.out.println("8 - Salvar Tudo");
            System.out.println("0 - Sair");
                
            System.out.println("Opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                cadastrarCliente();
                break;
            case 2:
                cadastrarLivro();
                break;
            case 3:
                novoPedido();
                break;
            case 4:
                addItem();
                break;
            case 5:
                relatorioClientes();
                break;
            case 6:
                relatorioLivros();
                break;
            case 7:
                pedidosPorCliente();
                break;
            case 8:
                salvarTudo();
                break;
            }
        } while(opcao != 0);
    }
    
    public static void cadastrarCliente(){
        System.out.println("Codigo: ");
        codigo = entrada.nextInt();
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("Telefone: ");
        telefone = entrada.next();
        System.out.println("Email: ");
        email = entrada.next();
        
        try{             
            Cliente c = new Cliente(codigo, nome, telefone, email);
            clientes.add(c);
            System.out.println("Sucesso ao cadastrar cliente!");
            
        }catch(IllegalArgumentException e){
            System.out.println("Erro ao cadastrar cliente!");
        }
    }
    
    public static void cadastrarLivro(){
        System.out.println("ISBN: ");
        ISBN = entrada.next();
        System.out.println("Titulo: ");
        titulo = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Autor: ");
        autor = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Preco: ");
        preco = Float.parseFloat(entrada.nextLine());
        
        try{
            Livro l = new Livro(ISBN, titulo, autor, preco);
            livros.add(l);
            System.out.println("Sucesso ao cadastrar Livro!");
            
        }catch(IllegalArgumentException e){
            System.out.println("Erro ao cadastrar Livro!");
        }
    }
    
    public static void novoPedido() throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean achou = false;
        do{
            System.out.println("\r\nNome do Cliente: ");
            nome = entrada.next();
            for(i=0;i<clientes.size();i++){
                if(clientes.get(i).getNome().equals(nome)){
                    achou = true;
                    break;
                }
            }
            if(achou == false)
                System.out.println("Cliente inválido, tente novamente.");
        }while(achou == false);
        
        try{
            System.out.println("\r\nNumero do pedido: ");
            numero = entrada.nextInt();
            System.out.println("\r\nData: ");
            data = entrada.next();
            Pedido p = new Pedido(numero,data,clientes.get(i));
            clientes.get(i).addPedidos(p);
            System.out.println("Sucesso ao cadastrar o pedido!");
        }catch(IllegalArgumentException e){
            System.out.println("Erro! Não foi possivel cadastrar o pedido!\r\n");
        }
    }
    
    public static void addItem(){
        String item,nome;
        int qtd, num;
        Cliente c = new Cliente();

        System.out.println("\r\nNumero do Pedido: ");
        num = entrada.nextInt();

        if(c.pesquisaPedido(num) == null){
            System.out.println("Pedido Inválido!");
        }else{
            System.out.println("\r\nNome do item: ");
            item = entrada.next();
            for(i=0;i<livros.size();i++){
                if(livros.get(i).getTitulo().equals(item)){
                    System.out.println("\r\nQuantidade: ");
                    qtd = entrada.nextInt();
                    ItemPedido ip = new ItemPedido(livros.get(i),qtd);
                    Pedido p = c.pesquisaPedido(num);
                    p.addItens(ip);
                }
            }
        }
    }
    
    public static void relatorioClientes(){
        String opc;
        if(clientes == null){
            System.out.println("Não há clientes cadastrados!");
        }else{
            for(i=0;i<clientes.size();i++){
                System.out.println(clientes.get(i).toString());
            }
        }
        System.out.println("\r\nPressione qualquer tecla para voltar ao menu...");
        opc = entrada.next();
    }
    
    public static void relatorioLivros(){
        String opc;
        if(livros == null){
            System.out.println("Não há livros cadastrados!");
        }else{
            for(i=0;i<livros.size();i++){
            System.out.println(livros.get(i).toString());
            }
        }
        System.out.println("\r\nPressione qualquer tecla e aperte enter para voltar ao menu...");
        opc = entrada.next();
    }
    
    public static void pedidosPorCliente(){
        boolean achou = false;
        String opc;
        do{
            System.out.println("\r\nNome do Cliente: ");
            nome = entrada.next();
            for(i=0;i<clientes.size();i++){
                if(clientes.get(i).getNome().equals(nome)){
                    achou = true;
                    break;
                }
            }
            if(achou == false)
                System.out.println("Cliente inválido, tente novamente.");
        }while(achou == false);
        clientes.get(i).pedidosEfetuados();
        System.out.println("\r\nPressione qualquer tecla e aperte enter para voltar ao menu...");
        opc = entrada.next();
    }
    
    public static void salvarTudo(){    
        String arq = "RepositorioClientes.dat";
        ClienteRepositorio.Write(arq, clientes);
        
        arq = "RepositorioLivros.dat";
        LivroRepositorio.Write(arq, livros); 
    }
    
    public static void carregarArquivos() throws IOException, FileNotFoundException, ClassNotFoundException{
        clientes = ClienteRepositorio.Read("RepositorioClientes.dat");
        livros = LivroRepositorio.Read("RepositorioLivros.dat");
    }
}
