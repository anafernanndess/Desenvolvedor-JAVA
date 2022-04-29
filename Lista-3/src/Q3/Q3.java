package Q3;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {

        int numero []  = new int [20];
        int par [] = new int [20];
        int impar [] = new int [20];
        for(int i = 0; i < 20; i++) {
            numero [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            if(numero[i] % 2 == 0) {
                par[i] = numero[i];
            }else {
                impar[i] = numero[i];
            }
        }
        System.out.println("Números digitados:"+  Arrays.toString(numero));
        System.out.println("Números pares:"+  Arrays.toString(par));
        System.out.println("Números ímpares:"+  Arrays.toString(impar));
    }
}
