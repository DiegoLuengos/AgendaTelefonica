import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    HashMap<String, String> agenda;
    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }

    /**
     * Introduce un número con un nombre asignado.
     */
    public void enterNumber(String nombre, String numero)
    {
        agenda.put(nombre, numero);
    }
    
    /**
     * Busca un número a partir de un nombre.
     */
    public String lookupNumber(String nombre)
    {
       return agenda.get(nombre);
    }
}
