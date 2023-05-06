package idadePlanetaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();

        double idadePlaneta = 0.0;
        String nomePlaneta = "";

        if (planeta.equalsIgnoreCase("Marte")) {
            idadePlaneta = idadeTerrestre / 1.88;
            nomePlaneta = "Marte";
        } else if (planeta.equalsIgnoreCase("Venus")) {
            idadePlaneta = idadeTerrestre / 0.62;
            nomePlaneta = "Venus";
        } else if (planeta.equalsIgnoreCase("Jupiter")) {
            idadePlaneta = idadeTerrestre / 11.86;
            nomePlaneta = "Jupiter";
        } else {
            System.out.println("Planeta invalido.");
            System.exit(0);

        }
        System.out.printf("Idade equivalente em %s: %.2f anos", nomePlaneta, idadePlaneta);

        scanner.close();

    }
}

