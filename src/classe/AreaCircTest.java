package classe;

public class AreaCircTest {

    public static void main(String[] args){

        AreaCirc a1 = new AreaCirc(10);

        AreaCirc a2 = new AreaCirc(5);

        //AreaCirc.pi = 3.1415; //se a variável for final não pode ser modificada

        System.out.println(a1.area());
        System.out.println(a2.area());
        System.out.println(AreaCirc.PI);
    }
}
