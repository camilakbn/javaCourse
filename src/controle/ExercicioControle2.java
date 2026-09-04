package controle;

import java.util.Scanner;

public class ExercicioControle2 {

    public static void main(String[] args){

        /*2. Criar um programa informa se o ano atual é um ano bissexto;*/
        //OK

        int anoAtual = 2026;

        if(anoAtual % 4 == 0){
            System.out.println("O ano é bissexto!");
        }
        else{
            System.out.println("O ano não é bissexto!");
        }
    }
}
