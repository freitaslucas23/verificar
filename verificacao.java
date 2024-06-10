import java.util.Scanner;

public class verificacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//verifica se o numero digitado é um numero valido para acessar uma conta 
        try {
            System.out.println("Digite o numero da sua conta: ");
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);

            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8 || !numeroConta.matches("\\d{8}")) {
            // Lançar uma IllegalArgumentException com a mensagem apropriada
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
