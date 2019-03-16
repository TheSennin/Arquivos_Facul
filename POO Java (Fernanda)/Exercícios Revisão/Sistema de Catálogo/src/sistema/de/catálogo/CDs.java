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
public class CDs extends Colecionaveis{
    
    /**
     * Gênero musical
    */
    private String genero;
    /**
     * Identificador das faixas
    */
    private ArrayList<String> faixas = new ArrayList();
    /**
    * Construtor default.
    * @param id
    * @param nome
    * @param dt_aquisicao
    * @param autores
    * todos pegos da superclasse Colecionaveis
    */
    public CDs(int id, String nome, LocalDate dt_aquisicao, ArrayList autores, String genero, ArrayList faixas) {
        super(id, nome, dt_aquisicao, autores);
        this.genero = genero;
        faixas.add(faixas);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList getId_faixas() {
        return faixas;
    }

    public void setId_faixas(ArrayList faixas) {
        faixas.add(faixas);
    }
    
}
