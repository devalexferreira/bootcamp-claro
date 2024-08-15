package desafio1;

import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        boolean contratado = false;

        // TODO: Verifique se o serviço está na lista de serviços contratados

        for(String txt : partes) {
            if(txt.equals(servico)) {
                System.out.println("Sim");
                contratado = true;
            }
        }
        if(!contratado) {
            System.out.println("Nao");
        }

        scanner.close();
        System.exit(0);
    }
}
