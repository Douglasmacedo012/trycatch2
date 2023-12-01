import java.util.*;
public class trycatch2 {
    public static void main(String[] args) {
        try {
            Scanner scnAltura = new Scanner(System.in);
            System.out.println("Digite a altura"); // digitar um número decimal com ponto "."
            double altura = scnAltura.nextDouble();

            Scanner scnLargura = new Scanner(System.in);
            System.out.println("Digite a largura");
            double largura = scnLargura.nextDouble();

            System.out.println("O metro quadrado é de " + (largura * altura));

            scnAltura.close();
            scnLargura.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}