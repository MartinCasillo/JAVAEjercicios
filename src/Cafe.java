import java.util.*;

public class Cafe{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int gustoCafe;
        System.out.print("Menu: \n" +
                "1 Cafe Cortado\n" +
                "2 Cafe con Leche\n" +
                "3 Lagrima\n" +
                "Que gusto de cafe queres ?");
        gustoCafe = sc.nextInt();

        if( gustoCafe == 1){
            System.out.println("Aqui tenes tu Cafe Cortado");
        }else if(gustoCafe == 2){
            System.out.println("Aqui tenes tu Cafe con Leche");
        }else if(gustoCafe == 3){
            System.out.println("Aqui tenes tu Lagrima");
        }else{
            System.out.println("No tenemos ese gusto");
        }
    }
}