import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temperatura;
        int vezes = 0;
        float soma = 0;
        float media;

        System.out.println("Programa de registro de temperatura da água e sua média: ");
        for (int i = 0; i < 12; i++) {
            vezes++;
            do {
                System.out.println("Digite a temperatura " + vezes + " entre 4°C e 10°C");
                temperatura = scanner.nextFloat();
                if (temperatura < 4 || temperatura > 10) {
                    System.out.println("Temperatura incorreta, tente novamente...");
                }
            } while (temperatura < 4 || temperatura > 10);
            soma += temperatura;
        }
        media = soma / 12;
        System.out.println("A média das temperaturas aferidas é: " + media);
        scanner.close();
    }
}
