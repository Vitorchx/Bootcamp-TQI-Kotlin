package mudancaIrland;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioBruto = scanner.nextDouble();
        double beneficios = scanner.nextDouble();

        double imposto = 0;

        if (salarioBruto <= 1100) {
            imposto = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            imposto = salarioBruto * 0.1;
        } else {
            imposto = salarioBruto * 0.15;
        }

        double salarioLiquido = salarioBruto - imposto + beneficios;

        System.out.printf("%.2f", salarioLiquido);


    }
}
