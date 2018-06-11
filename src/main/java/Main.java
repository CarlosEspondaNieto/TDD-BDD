public class Main {
    public static void main(String[] args){

        //Primitivos
        int a = 5;
        int b =20;
        System.out.println("Primitivos -> " + (a==b)); // Esto da false

        //Objects
        Persona personaA = new Persona("Paco", "Pérez");
        Persona personaB = new Persona("Paco", "Pérez");

        System.out.println("Objetos -> " + (personaA==personaB)); // Esto da False
        System.out.println("Objetos -> " + (personaA.equals(personaB))); // Esto da True


    }
}
