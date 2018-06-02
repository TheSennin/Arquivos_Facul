package br.univali.kob.poo1.aula06;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 *
 */
public abstract class Person implements Contactable {

    /**
     * person's name
     */
    private String name;

    /**
     * Person's birthdate
     */
    private LocalDate dateOfBirth;
    
    /**
     * Person's identifier
     */
    private int id;
    
     /**
     * Email
     */
    private String email;
    
    /**
     * Next ID to be used
     */
    
    private static int nextId = 1;
    
     /**
     * Default constructor
     * @param name
     * @param dateOfBirth
     */
    public Person(String name, LocalDate dateOfBirth, String email) {
        setName(name);
        setDateOfBirth(dateOfBirth);
        setEmail(email);
        validateState();
        id = nextId++;
    }
    
     /**
     * Overloaded Constructor 
     * @param name
     * @param dateOfBirth 
     */
    
    public Person(String name, String dateOfBirth, String email){
        this(name, LocalDate.parse(dateOfBirth, AppConfig.DATE_FORMAT), email);
    }
    
    /**
     * Monta uma String com todos os atributos e seus respectivos valores.
     * O formato retornado é:
     * 
     * <pre>
     * {@code 
     * Nome_da_Classe_Completo{
     *   Atributo = valor
     *   Atributo = valor
     *   ...
     * }}
     * </pre>
     *  
     * @return  o estado (atributos e respectivos valores) do objeto
     */
    @Override
    public String toString(){
      StringBuilder output = new StringBuilder();
      output.append(this.getClass().getName() + " {" + AppConfig.NEW_LINE);
      output.append("  // Person" + AppConfig.NEW_LINE);
      output.append("  id = " + id + AppConfig.NEW_LINE);
      output.append("  dateOfBirth = " +
              dateOfBirth.format(AppConfig.DATE_FORMAT) + AppConfig.NEW_LINE);
      output.append(appendToString());
      output.append("}" + AppConfig.NEW_LINE);
      return output.toString();      
    }
    
    @Override
    /**
     * @param obj o objeto a ser comparado
     * @return true quando os objetos tem o mesmo estado, false o contrário
     */
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person)obj;
        // considerado que dateOfBirth nunca poderá ser null (validações)
        // note que estamos na classe Person, logo temos acesso também aos
        //atributos do outro objeto
        return
             id == person.id &&
             (name == person.name || name.equals(person.name)) &&
             (dateOfBirth == person.dateOfBirth || dateOfBirth.equals(person.dateOfBirth));
    }
    
    @Override
    public int hashCode(){
        return id ^ (name.hashCode()) ^ (dateOfBirth.hashCode());
    }
    
    /**
     * 
     * @return um conjunto de linhas atributo = valor que será incluído 
     * na implementação herdada de toString();
     * @see #toString() para detalhes sobre o formato das linhas
     */
    protected abstract String appendToString();
    
    /**
     * 
     * @return id
     */
    public int getId(){
        return id;
    }
    /**
     * getter
     * @return the next id to be used 
     */
    public int getNextId(){
        return nextId;
    }

    /**
     * @return person's name
     */
    public String getName() {
        return name;
    }

    /**
     * @param value person's name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }

    /**
     * @return person's date of birth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param value person's date of birth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        Period period = null;
        period = period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }
    
    private void validateName(){
        if(name.length() < 2 || name.length() > 40)
            throw new IllegalArgumentException("Name is out of range of " +
                    "[2..40] characters");
    }
    
    private void validateDateOfBirth(){
        if(dateOfBirth.equals(null) || dateOfBirth.isAfter(LocalDate.now())){
                throw new IllegalArgumentException("Invalid date of birth!");
        }
    }
    private void validateState(){
        validateName();
        validateDateOfBirth();
    }
}
