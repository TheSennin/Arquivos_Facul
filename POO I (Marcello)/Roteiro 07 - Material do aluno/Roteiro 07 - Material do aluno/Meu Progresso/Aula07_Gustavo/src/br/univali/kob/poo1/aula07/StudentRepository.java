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
public abstract class StudentRepository<T extends Person> extends Repository<Person> {

    /**
     * @param fileName o nome do arquivo, no qual os elementos gerenciados pelo 
     *                  repositório serão persistidos (inclui o caminho)
     * 
     * @throws FileNotFoundException se o nome do arquivo não existir
     * @throws IOException se houver algum erro de leitura
     * @throws ClassNotFoundException se os objetos armazenados não forem Person
     */
    public StudentRepository(String fileName) throws IOException, ClassNotFoundException {
        super(fileName);
    }

    /**
     * Procura uma pessoa pelo seu ID.
     * 
     * @param id o id da pessoa procurada
     * @return a pessoa que tem o ID fornecido, null se não encontrada
     */
    public T findById(int id) {
        for (Person person : findAll()) {
            if (person.getId() == id) {
                return (T)person;
            }
        }
        return null;
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
        List<T> people = new ArrayList<>();
        for (Person person : findAll()) {
            if (name.equals(person.getName())) {
                people.add((T)person);
            }
        }
        return people;
    }
    
    public List<T> findByEmail(String email){
        List<T> people = new ArrayList<>();
        for(Person person : findAll()){
            if (email.equals(person.getEmail())){
                people.add((T)person);
            }
        }
        return people;
    }
    
    public List<T> findByAddress(String address){
        List<T> people = new ArrayList<>();
        for(Person person : findAll()){
            if (address.equals(person.getAddress())){
                people.add((T)person);
            }
        }
        return people;
    }

}