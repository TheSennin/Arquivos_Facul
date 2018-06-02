/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula06;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;

/**
 * Configuração geral do sistema
 * 
 * @author Gustavo
 */
public class AppConfig {
    /**
     * Nome da Aplicação
     */
    public static final String APP_NAME;
    /**
     * Versão da aplicação
     */
    public static final String APP_VERSION;
    /**
     * Constante com formato brasileiro de data
     */
    public static final DateTimeFormatter DATE_FORMAT;
    /**
     * Constante com formato de quebra de linha, conforme o sistema operacional
     */
    public static final String NEW_LINE;
    /**
     * Armazenar as informações lidas de alguma fonte
     */
    private static final Object SETTINGS[] = new Object[10];
    
    /**
     * Um bloco static é um bloco normal de código cercado por chaves.
     * Uma classe pode ter vários blocos static, os quais podem aparecer em qualquer
     * local do corpo da classe. O sistema de execução JVM garante que a inicialização
     * feita nestes blocos seja feita na ordem em que eles apartecem no código.
     * os atributos static final devem ser inicializados aqui.
     */
    static {
        loadSettings();
        APP_NAME = (String)SETTINGS[0];
        APP_VERSION = (String)SETTINGS[1];
        DATE_FORMAT = (DateTimeFormatter)SETTINGS[2];
        NEW_LINE = (String)SETTINGS[3];
    }
    
    /**
     * Carrega as configurações de alguma fonte como, por exemplo, um
     * arquivo XML ou de propriedades do sistema.
     */
    private static void loadSettings() {
        // Inserir aqui o código para carregar preencher settings a
        //partir de alguma fonte
        SETTINGS[0] = "Sistema Acadêmico";
        SETTINGS[1] = "1.0";
        SETTINGS[2] = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        SETTINGS[3] = System.getProperty("line separator");
    }
}
