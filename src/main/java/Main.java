import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário inicial do funcionário: R$ ");
        double salarioInicial = scanner.nextDouble();

        int anoAtual = 2024;
        double aumentoPercentual = 0.015; // 1.5% em decimal

        for (int ano = 1996; ano <= anoAtual; ano++) {
            salarioInicial += salarioInicial * aumentoPercentual;
            aumentoPercentual *= 2; // Aumento dobro do percentual do ano anterior
        }

        System.out.println("Salário atual do funcionário em " + anoAtual + ": R$ " + salarioInicial);

        scanner.close();
    }
}
