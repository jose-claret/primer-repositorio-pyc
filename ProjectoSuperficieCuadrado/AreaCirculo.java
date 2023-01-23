import java.util.Scanner;

public class AreaCirculo {
	@SuppressWarnings("resource")
	public static void main (String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int lado;
        int area;
        System.out.print("Ingrese el valor del lado del cuadrado:");
        lado=teclado.nextInt();
        area=lado * lado;
        System.out.print("La superficie del cuadrado es:");
        System.out.print(area);
	}
}
