package Q1;
import java.util.Scanner;
import java.util.Locale;
public class Q1 {
    public static class Array {
        public static void main(String[] args) {


            Scanner leia = new Scanner(System.in);
            final var ponto = new Locale("en", "us");
            int [] numeros = new int[5];
            int [] numero = {1,4,6,8,10};
            System.out.println("numero do meu indice 2:" + numero[2]);
            for(int i = 0; i < numero.length; i++) {
                System.out.println("numero do indice" + i + ";" + numero [i]);
                leia.close();
            }
        }
    }
}



