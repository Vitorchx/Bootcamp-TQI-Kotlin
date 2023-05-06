package comprasLivraria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine();
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

        double total = (livro1.preco * livro1.quantidade) + (livro2.preco* livro2.quantidade);

        System.out.printf("Valor total da compra: %.2f %n", total );
        System.out.println("Numero de livros comprados: " + (livro1.quantidade + livro2.quantidade) );
        System.out.println("Obrigado por comprar na nossa livraria!");

    }

    static class Livro {
        String nome;
        double preco;
        int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }


    }


}
