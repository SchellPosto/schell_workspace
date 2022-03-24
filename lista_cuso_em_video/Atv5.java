import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
    double notaA, notaB;
    Scanner teclado = new Scanner (System.in);
    System.out.println("Insira a primeira nota do(a) aluno(a): ");
    notaA = teclado.nextDouble();
    System.out.println("Insira a segunda nota do(aP aluno(a): ");
    notaB = teclado.nextDouble();
    System.out.println("A média entre " + notaA + " e " + notaB + " é igual a " + (notaA+notaB)/2);

    teclado.close();
    }
}
