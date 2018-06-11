import java.util.ArrayList;
import java.util.List;

public class UtilidadesNull {
    private List<Persona> personas;

    public UtilidadesNull(){
        personas=new ArrayList<Persona>();
        personas.add(new Persona("Carlos","Romero"));
        personas.add(new Persona("Juan","López"));
        personas.add(new Persona("Paco","Martínez"));

    }

    /**
     * Busca en el array personas un nombre, el cual se le pasa como parámetro,
     * si lo encuentra, returna not null y si no lo encuentra returna Null.
     * @param nombre
     * @return
     */

    public Persona damePersona(String nombre){
        Persona p = null;
        for(Persona persona : personas){
            if(persona.getNombre().equalsIgnoreCase(nombre)){
                p=persona;
            }
        }
        return p;
    }
}
