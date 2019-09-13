import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class Chipotle {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc =new Scanner(System.in);
        ArrayList<String>burritoOptions = new ArrayList<>();

        burritoOptions.add("Rice");
        burritoOptions.add("Meat");
        burritoOptions.add("Beans");
        burritoOptions.add("Salsa");
        burritoOptions.add("Veggies");


        int i = 1+rd.nextInt(25);
        for(i=0; i<burritoOptions.size(); i++){
            System.out.println(burritoOptions);



        }


    }
}
