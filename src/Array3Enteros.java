public class Array3Enteros{
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int acumulador = 0;
        int i = 0;

        for (i=0;i<a.length;i++){
            acumulador+=a[i];
        }
        System.out.println("La sumatoria del resultado es : " + acumulador);
    }
}