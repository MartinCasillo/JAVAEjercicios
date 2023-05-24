public class Promedio{
    public static void main(String args[]){

        int num1 =1;
        int num2 = 3;
        int num3 = 7;
        int promedio = 0;

        promedio = (num1+num2+num3)/3;

        if(promedio >= 4){
            System.out.println("El alumno aprobo: " + promedio);
        }else{
            System.out.println("El alumno reprobo: " + promedio);
        }
    }
}