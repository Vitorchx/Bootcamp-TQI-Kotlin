package trafegoTransito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();


        if ( numero == 1){
            System.out.println("Pare! O sinal esta vermelho.");
        }else if (numero == 2){
            System.out.println( "Atencao! O sinal esta amarelo.");
        }else if(numero == 3){
            System.out.println("Siga em frente! O sinal esta verde.");
        }else{
            System.out.println( "Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");

        }


    }
}