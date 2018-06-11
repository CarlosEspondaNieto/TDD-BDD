import java.util.ArrayList;
import java.util.List;

public class UtilidadesSame {
    private List<Persona> personas; //List es una interface. Se declara una variable de tipo List con objeto Persona.

    public UtilidadesSame(){
        personas=new ArrayList<Persona>(); //ArraryList implementa List interface. Se instancia a ArrayList con el objeto Persona.
        Persona personaA = new Persona("Carlos", "Esponda");
        Persona personaB = new Persona("Salma", "Hayek");
        personas.add(personaA);
        personas.add(personaB);
    }

    public Persona devuelveObjeto(Persona persona){
        if(personas.contains(persona)){
            return persona;
        } else{
            return new Persona("Patti", "Smith");
        }
    }
}
