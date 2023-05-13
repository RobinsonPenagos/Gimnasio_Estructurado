
/**
 * Write a description of class GimnasioEstructurado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GimnasioEstructurado
{
   public static void main(String[] args) {
    int valor = 50000;
    int mes, descuento, total, edad;
    String nombre;
    Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenidos al GYM SPARTACO");
    System.out.println("***************************");
    System.out.println("Valor del mes 50.000");
    System.out.println("De 4 a 6 meses obtendras un 10% de descuento:");
    System.out.println("De 7 a 9 meses obtendras un 20% de descuento:");
    System.out.println("De 10 meses en adelante obtendras un 30% de descuento:\n");

    System.out.println("Ingrese el nombre del cliente:");
    nombre = sc.nextLine();
    System.out.println("Ingrese su edad:");
    edad = sc.nextInt();
    System.out.println("Por cuantos meses realizara la suscripcion?");
    mes = sc.nextInt();
    System.out.println("\nSu nombre es: " + nombre + ". Su edad es de: " + edad + " años.");
    total = mes * valor;
    System.out.println("Tu suscripcion es por " + mes + " meses. El costo total sin descuentos es de " + total + " pesos");

    if (mes <= 3) {
        System.out.println("total a pagar: " + total + " pesos");
    } else if (mes > 3 && mes <= 6) {
        descuento = (total * 10) / 100;
        descuento = total - descuento;
        System.out.println("total a pagar con el 10% de descuento: " + descuento + " pesos");
    } else if (mes > 6 && mes < 10) {
        descuento = (total * 20) / 100;
        descuento = total - descuento;
        System.out.println("total a pagar con el 20% de descuento: " + descuento + " pesos");
    } else if (mes >= 10) {
        descuento = (total * 30) / 100;
        descuento = total - descuento;
        System.out.println("total a pagar con el 30% de descuento: " + descuento + " pesos");
    }

    System.out.println("Bienvenidos");
    sc.close();
}

}
