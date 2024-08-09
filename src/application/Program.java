package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.print("Base do retângulo: ");
        ret.base = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        ret.altura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", ret.area());
        System.out.printf("PERIMETRO = %.2f%n", ret.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());

        sc.close();
    }
}