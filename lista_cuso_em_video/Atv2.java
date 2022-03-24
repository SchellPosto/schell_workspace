import java.util.Scanner;
public class Atv2 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    String nome;
    System.out.println("Qual é o seu nome?");
    nome = teclado.next();
    System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    teclado.close();
} 
}
