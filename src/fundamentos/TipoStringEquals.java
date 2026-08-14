package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args){

        System.out.println("2" == "2"); //verdadeiro

        String s = new String("2");

        System.out.println("2" == s); //falso
        System.out.println("2".equals(s)); //verdadeiro

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número: ");
        String s2 = entrada.nextLine();
        System.out.println(s2);
        System.out.println("2" == s2.trim()); //falso
        System.out.println("2".equals(s2.trim())); //verdadeiro

        entrada.close();
    }
}
