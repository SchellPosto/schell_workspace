import java.util.Scanner;
public class Atv3 
{
public static void main(String[] args) 
{
    Scanner entrada = new Scanner (System.in);
    String nome; int salario;

    System.out.println("Insira o nome do funcionário(a): ");
    nome = entrada.next();

    System.out.println("Insira o salário do funcionário(a):");
    salario = entrada.nextInt();

    System.out.println("Nome do Funcionário(a): " + nome);
    System.out.println("Salário: " + salario);
    System.out.println("O(a) funcionário(a) " + nome + "tem um salário de " + salario + " em Junho");

    entrada.close();
}
}