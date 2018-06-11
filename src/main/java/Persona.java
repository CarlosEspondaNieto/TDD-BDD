import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    /**con estos dos métodos se permite que los objetos Persona con el mismo contenido (por ejemplo mismo nombre y apellido) sean considerados
     objetos iguales usando el método Equals, de otra forma, son considerados por java como dos objetos distintos
     porque están en una posición de la memoria diferente.
     Estos dos métodos se crean con botón derecho --> Generate --> equals() and hashCode()
   **/
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, apellido);
    }
}
