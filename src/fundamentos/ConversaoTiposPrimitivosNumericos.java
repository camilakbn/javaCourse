package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    public static void main(String[] args){

        //conversão implícita
        double a = 1;
        System.out.println(a);

        //conversão explícita
        //float b = 1.0F;
        float b = (float) 1.234567899999;
        System.out.println(b);

        int c = 13;
        byte d = (byte)c;
        System.out.println(d);

        double e = 1.999;
        int f = (int)e;
        System.out.println(f);
    }
}
