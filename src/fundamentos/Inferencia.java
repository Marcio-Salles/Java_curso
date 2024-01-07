package fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a= 4.5;
        var b= 4.5; //  Declarando a váriavel desta forma o Java vai inferir ( interpletar ) que a váriavel é do tipo double
        var c= "Texto"; //  Declarando a váriavel desta forma o Java vai inferir ( interpletar ) que a váriavel é do String

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
