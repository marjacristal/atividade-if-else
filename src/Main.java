import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Seja bem vinda(o)!");
        System.out.println("Diga o primeiro número, por favor:");

        int primeiroNumero = scanner.nextInt();

        System.out.println("Agora, o segundo número, por favor:");

        int segundoNumero = scanner.nextInt();

        System.out.println("Obrigada!");
        System.out.println("Calculando...");

        if (primeiroNumero < segundoNumero){
            System.out.println("O maior número é: " + segundoNumero + ".");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número é: " + primeiroNumero + ".");
        } else {
            System.out.println("Os números são iguais!");
        }

        System.out.println("Obrigada e até a próxima!");

        scanner.close();

    }
}
