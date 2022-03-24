import java.util.Scanner;
public class Atv4 {
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        int numA, numB;

        System.out.println("Digite um valor inteiro: ");
        numA = entrada.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        numB = entrada.nextInt();
        
        System.out.println("A soma entre " + numA + " e " + numB + " é igual a " + (numA+numB));

        entrada.close();
    }
}
