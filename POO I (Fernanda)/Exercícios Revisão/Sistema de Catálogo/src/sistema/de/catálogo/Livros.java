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
public class Livros extends Colecionaveis{
    /*
    Nome da editora
    */
    private String nome_editora;
    /*
    Ano de publicacao
    */
    private LocalDate ano_publicacao;
    /**
    * Construtor default.
    * @param id
    * @param nome
    * @param dt_aquisicao
    * @param autores
    * todos pegos da superclasse Colecionaveis
    */
    
    public Livros(int id, String nome, LocalDate dt_aquisicao, ArrayList autores, String nome_editora, LocalDate ano_publicacao) {
        super(id, nome, dt_aquisicao, autores);
        this.nome_editora = nome_editora;
        this.ano_publicacao = ano_publicacao;
    }

    public String getNome_editora() {
        return nome_editora;
    }

    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
    }

    public LocalDate getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(LocalDate ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }
    
    
    
}
