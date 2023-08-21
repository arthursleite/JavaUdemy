package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = "";
        String npalavra = "";
        do {
            System.out.print("Digite uma palavra: ");
            palavra = sc.next();
            char ch;

            for (int i = 0; i < palavra.length(); i++) {
                ch = palavra.charAt(i);
                npalavra = ch + npalavra;
            }
            System.out.println("Palavra ao contrario: " + npalavra);
        } while (palavra != "stop");
        
    }

}
