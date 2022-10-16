import java.util.Scanner;
import java.text.DecimalFormat;
public class Questao05 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do jantar: ");
        double vlrJantar = ler.nextDouble();

        System.out.println("A Taxa de Serviços do Garçom é 10%");
        double taxaGarçom = 10.00/100.00;

        double vlrTotal = vlrJantar+(taxaGarçom * vlrJantar);

        DecimalFormat vlrFormatado = new DecimalFormat("#.00");
        System.out.println("O Valor do Jantar é com a taxa de Serviços é R$ " + vlrFormatado.format(vlrTotal));
               
                 
        ler.close();
    }
}
