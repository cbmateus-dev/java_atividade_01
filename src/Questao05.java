import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do jantar: ");
        double vlrJantar = ler.nextDouble();
        System.out.println("A Taxa de Serviços do Garçom é 10%");
        double taxaGarçom = 10.0/100.0;
        double vlrTotal = vlrJantar+(taxaGarçom * vlrJantar);
        System.out.println("Valor do jantar com taxa do garçom é R$ " + vlrTotal);
                 
        ler.close();
    }
}
