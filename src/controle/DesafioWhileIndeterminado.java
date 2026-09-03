package controle;

import java.util.Scanner;

public class DesafioWhileIndeterminado {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String mensagem = "";
        while(!mensagem.equalsIgnoreCase("sair")){
            System.out.println("Digite qualquer coisa: ");
            mensagem = entrada.nextLine();
        }

        System.out.println("Você saiu do programa!");
    }
}
