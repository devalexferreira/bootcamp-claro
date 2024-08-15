package consumo_desconto;

import java.util.Scanner;

public class CalculadoraCredito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Processa múltiplos casos de teste
        while (scanner.hasNextLine()) {
            // Lê o número de ligações
            int n = Integer.parseInt(scanner.nextLine().trim());
            double totalCredito = 0.0;

            // Processa cada ligação
            for (int i = 0; i < n; i++) {
                String[] dadosLigacao = scanner.nextLine().trim().split(",");
                int duracao = Integer.parseInt(dadosLigacao[0].trim());
                String tipoLigacao = dadosLigacao[1].trim();
                double valorPorMinuto = Double.parseDouble(dadosLigacao[2].trim());

                // TODO: Calcule o custo da ligação
                totalCredito += duracao * valorPorMinuto;
            }

            // Formata o resultado com duas casas decimais e imprime
            System.out.printf("%.2f%n", totalCredito);

        }
        scanner.close();
        System.exit(0);
    }
}
