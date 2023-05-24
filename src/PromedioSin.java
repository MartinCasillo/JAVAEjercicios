public class PromedioSin{
    public static void main(String args[]){
        int num1 = 5;
        int num2 = 2;
        int num3 = 7;

        double  promedio;

        promedio = (num1+num2+num3)/3;

        if(promedio >= 4){
            System.out.println("El alumno aprobo: " + promedio);
        }else{
            System.out.println("El alumtno reprobo: " + promedio);
        }
    }
}