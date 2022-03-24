import java.util.Scanner;
public class Atv6 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num = teclado.nextInt();
    System.out.println("O número é " + num);
    System.out.println("Seu antecessor é: " + (num-1));
    System.out.println("Seu sucessor é: " + (num+1));
    teclado.close();
    }
}
