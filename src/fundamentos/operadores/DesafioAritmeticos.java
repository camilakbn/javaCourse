package fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args){

        /*int a = 3 * 4 -10;
        int b = (int) Math.pow(a, 3);
        double c = Math.pow(a , 3);

        System.out.println(b);
        System.out.println(c);*/

        int a = 6*(3+2);
        int b = (int) Math.pow(a, 2);
        int c = 3*2;
        int d = b / c;

        int e = (1-5)*(2-7)/2;
        int f = (int) Math.pow(e, 2);

        int g = d - f;
        int h = (int) Math.pow(g, 3);

        int i = (int) Math.pow(10, 3);

        int j = h / i;

        //pode fazer tudo com double também

        System.out.println(j);

    }
}
