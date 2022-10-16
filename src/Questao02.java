import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para exibir seu antecessor e sucessor:");
        int numInicial = ler.nextInt();
        int numAntecessor = numInicial -1;
        int numSucessor = numInicial +1;


        System.out.println("Numero antecessor do número " + numInicial+" é " +numAntecessor);
        System.out.println("Numero sucessor do número "+numInicial+" é " +numSucessor);
        ler.close();
        
    }
}
