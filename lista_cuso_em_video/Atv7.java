import java.util.Scanner;
public class Atv7 {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
double num = teclado.nextDouble();

//Dobro
System.out.println("O dobro de " + num + " é igual a " + (num*2));

//Terça Parte
System.out.println("A terça parte de " + num + " é igual a " + (num/3));
teclado.close();
}    
}
