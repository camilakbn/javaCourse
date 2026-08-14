package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args){

        /*criar um scanner e pegar o valor de 3 strings
        * as strings são os últimos três salários do funcionário
        * calcular a média dos últimos três salários
        * o funcionário tem que ter a opção de separar as casas
        * decimais por vírgula ou ponto*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu primeiro salário: ");
        String primeiro = entrada.nextLine().replace(",", ".");

        System.out.println("Digite o seu segundo salário: ");
        String segundo = entrada.nextLine().replace(",", ".");

        System.out.println("Digite o seu terceiro salário: ");
        String terceiro = entrada.nextLine().replace(",", ".");

        double primeiroS = Double.parseDouble(primeiro);
        double segundoS = Double.parseDouble(segundo);
        double terceiroS = Double.parseDouble(terceiro);

        double soma = primeiroS + segundoS + terceiroS;

        double media = soma / 3;

        System.out.printf("A média dos salários é de %.2f", media);

        entrada.close();
    }
}
