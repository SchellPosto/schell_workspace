import java.util.Scanner;
public class Atv8 {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
System.out.println("Insira uma distância em metros: ");
double metros = teclado.nextDouble();

//KM
System.out.println(metros + " metros equivalem a " + (metros/1000) + "KM");

//HM
System.out.println(metros + " metros equivalem a " + (metros/100) + " hectômetros");

//dam
System.out.println(metros + " metros equivalem a " + (metros/10) + " decâmentros");

//dm
System.out.println(metros + " metros equivalem a " + (metros*10) + " decímetros");

//cm
System.out.println(metros + " metros equivalem a " + (metros*100) + " centímetros");

//mm
System.out.println(metros + " metros equivalem a " + (metros*1000) + " milímetros");

teclado.close();
}    
}
