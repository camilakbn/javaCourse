package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args){

        /*usando apenas o que aprendeu no módulo
        * ler num1
        * ler num2
        * pedir pra o usuário escolher a operação (+ - / *)
        * mostrar o resultado da calculadora*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("Agora, digite o símbolo da operação que você quer realizar:\n" +
                "Digite:\n" +
                "+ = adição\n" +
                "- = subtração\n" +
                "* = multiplicação\n" +
                "/ = divisão");
        String operacao = entrada.next();

        //como eu fiz
        /*char operacao = entrada.next().charAt(0);
        *double resultado = (operacao == '+') ? num1+num2 : (operacao == '-') ? num1-num2 : (operacao == '*') ? num1*num2 : (operacao == '/') ? num1/num2 : 0.0;*/

        //como o prof fez
        double resultado = "+".equals(operacao) ? num1+num2 : 0;
        resultado = "-".equals(operacao) ? num1-num2 : resultado;
        resultado = "*".equals(operacao) ? num1*num2 : resultado;
        resultado = "/".equals(operacao) ? num1/num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);

        entrada.close();
    }
}
