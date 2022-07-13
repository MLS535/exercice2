import java.util.Scanner;

public class Main {


    public static double ivaPriceOfTheProduct(double priceProduct){
        return priceProduct * 1.20;
    }
    public static void main(String[] args) {
       System.out.println(ivaPriceOfTheProduct(555));

        String[] nombres = new String[]{"Paco", "Maria", "Juan", "Maite"};

        for (int i = 0; i < nombres.length; i++) {
        System.out.println(nombres[i]);
        }
    }
}
