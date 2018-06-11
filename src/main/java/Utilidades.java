public class Utilidades {
    public String[] getArrayStrings(String ... strings){
        String[] array = new String[strings.length];

        for(int i = 0; i < strings.length; i++){
            array[i] = strings[i];
        }
        return array;
    }

    public boolean esMayorque10(int num){
        return num > 10;
    }
}
