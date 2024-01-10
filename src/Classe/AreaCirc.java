package Classe;

public class AreaCirc {

    double raio;
    static double pi;

    AreaCirc(double raioInicial) {
        pi = 3.14;
        raio = raioInicial;

    }
        double area() {
            return pi * raio * raio;
        }
    }

