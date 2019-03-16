/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.catálogo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 6322875
 */
public abstract class Colecionaveis {
    /*
    Identificador do item
    */
    private int id;
    /*
    Nome do item
    */
    private String nome;
    /*
    Data de aquisição
    */
    private LocalDate dt_aquisicao;
    /*
    Lista de autores
    */
    private ArrayList<String> autores = new ArrayList();
    
    /*
    Construtor Default
    */
    public Colecionaveis(int id, String nome, LocalDate dt_aquisicao, ArrayList autores){
        this.id = id;
        this.nome = nome;
        this.dt_aquisicao = dt_aquisicao;
        autores.add(autores);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDt_aquisicao() {
        return dt_aquisicao;
    }

    public void setDt_aquisicao(LocalDate dt_aquisicao) {
        this.dt_aquisicao = dt_aquisicao;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList autores) {
        autores.add(autores);
    }
 
}
