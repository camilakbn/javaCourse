package fundamentos;

public class Inferencia {
    public static void main(String[] args){
        double a = 4.5;
        System.out.println(a);

        a = 12;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c ="Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        /*se definir a var de um tipo, não pode receber outro tipo
        exemplo: a = 4.5, se for dar outro valor para a, tem que ser float*/

        double d; //declaração da variável
        d = 123.65; //inicialização da variável
        System.out.println(d); //impressão da variável

        /*não pode declarar a variável var em uma linha e
        * inicializar ela em outra, porque precisa definir o tipo dela*/
    }
}