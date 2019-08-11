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
public class Revistas extends Livros{
    /**
     * Principais assuntos
     */
    ArrayList<String> assuntos = new ArrayList();
    /**
     * Construtor default
    */ 
    public Revistas(int id, String nome, LocalDate dt_aquisicao, ArrayList autores, String nome_editora, LocalDate ano_publicacao, ArrayList assuntos) {
        super(id, nome, dt_aquisicao, autores, nome_editora, ano_publicacao);
        assuntos.add(assuntos);
    }

    public ArrayList<String> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(ArrayList<String> assuntos) {
        this.assuntos = assuntos;
    }
    
}
