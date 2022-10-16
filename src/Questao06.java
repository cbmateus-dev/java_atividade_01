import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao06 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da conta: ");
        float vlrConta = ler.nextFloat();
        System.out.println("Digie Quantas pessoas irá dividir a conta: ");
        int qtdPessoas = ler.nextInt();
        float vlrDividido = vlrConta/qtdPessoas;
        DecimalFormat vlrFormatado = new DecimalFormat("#.00");
        System.out.println("Valor que cada um irá pagar é R$ " + vlrFormatado.format(vlrDividido));
                 
        ler.close();
    }
}
