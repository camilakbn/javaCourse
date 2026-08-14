package fundamentos;
/*desafio:
* converter a temperatura de fahrenheit para celsius*/

public class Temperatura {
    public static void main(String[] args){
        //(ºF - 32) x (5/9) = ºC

        final double X = 32;
        final double DIVISAO = 5.0/9.0;
        double fahrenheit = 90;
        double celsius = (fahrenheit - X) * DIVISAO;

        System.out.println("O resultado é " + celsius + "ºC.");

        fahrenheit = 120;
        celsius = (fahrenheit - X) * DIVISAO;

        System.out.println("O resultado é " + celsius + "ºC.");
    }
}