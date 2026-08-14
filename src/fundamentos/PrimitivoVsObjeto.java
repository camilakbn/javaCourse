package fundamentos;

public class PrimitivoVsObjeto {

    public static void main(String[] args){

        String s = new String("texto"); //o valor da string é um objeto
        //s.toUpperCase();; //é um comportamento do objeto

        //Wrappers são a versão objeto dos tipos primitivos
        int a = 123;
        System.out.println(a);

    }
}