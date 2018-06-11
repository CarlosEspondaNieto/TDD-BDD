public class UtilidadesPersonas {
        private Persona carlos; //se crea una variable tipo Persona
        private Persona juan;

        public UtilidadesPersonas(){ //constructor con variables instanciadas.
            carlos = new Persona("Carlos", "Romero");
            juan = new Persona("Juan", "López");
        }

    public Persona getCarlos() {
        return carlos;
    }

    public Persona getJuan() {
        return juan;
    }

    /**Assert Array Equals*/
    /*public Persona[] getArrayPersonas(){
        Persona[] personas = {carlos, juan};
        return personas;
    }*/
}

