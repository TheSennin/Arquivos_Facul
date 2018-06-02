package br.univali.kob.poo1.aula07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

/**
 * Implementação de finders para repositórios de pessoas.
 *
 * @author Marcello Thiry
 * 
 * @param <T> alguma subclasse de Person
 */
public abstract class CompanyRepository<T extends Company> extends Repository<Company> {

    /**
     * @param fileName o nome do arquivo, no qual os elementos gerenciados pelo 
     *                  repositório serão persistidos (inclui o caminho)
     * 
     * @throws FileNotFoundException se o nome do arquivo não existir
     * @throws IOException se houver algum erro de leitura
     * @throws ClassNotFoundException se os objetos armazenados não forem Person
     */
    public CompanyRepository(String fileName) throws IOException, ClassNotFoundException {
        super(fileName);
    }

    /**
     * Procura todas as pessoas que tenham um determinado nome.
     * 
     * @param name o nome da(s) pessoa(s) procurada(s)
     * @return todas as pessoas com o mesmo nome fornecido
     * 
     * @throws NullPointerException se nome for null
     * @throws IllegalArgumentException se não houver, pelo menos, uma palavra no nome
     */
    public List<T> findByName(String name) {
        List<T> company = new ArrayList<>();
        for (Company companies : findAll()) {
            if (name.equals(companies.getName())) {
                company.add((T)company);
            }
        }
        return company;
    }
    
    public List<T> findByEmail(String email){
        List<T> company = new ArrayList<>();
        for(Company companies : findAll()){
            if (email.equals(companies.getEmail())){
                company.add((T)company);
            }
        }
        return company;
    }
    
    
    //company necessita de address
    /*public List<T> findByAddress(String address){
        List<T> company = new ArrayList<>();
        for(Company companies : findAll()){
            if (address.equals(companies.getAddress())){
                company.add((T)company);
            }
        }
        return company;
    }*/

}