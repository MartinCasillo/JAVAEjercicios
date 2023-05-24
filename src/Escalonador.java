public class Escalonador{
    public static void main(String args[]){
        int edad = 10;

        if(edad > 59){
            System.out.println("socio senior: " + edad);
        }else if (edad >20){
            System.out.println("socio activo: " + edad);
        }else if ( edad > 13){
            System.out.println("socio cadete: " + edad);
        }else{
            System.out.println("socio infantil: " + edad);
        }
    }
}