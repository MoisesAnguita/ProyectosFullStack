package java1;

import java.util.Scanner;

public class HolaMundo {

private static void ejemplosConversiones() {
        Scanner sc = new Scanner(System.in);
		int prefijo = 34;

		int telefono = 666666666;

		System.out.println(prefijo + telefono); // 666666670

		//Conversiones

		System.out.println("" + prefijo + telefono); // 34666666666. Implícita

		System.out.println(String.valueOf(prefijo) + telefono); // 34666666666

		System.out.println(String.valueOf(prefijo) + String.valueOf(telefono)); // 34666666666

		System.out.println(Integer.toString(prefijo) + telefono); // 34666666666



		String valor1 = sc.nextLine();
		System.out.println(valor1);
		System.out.println((Integer.parseInt(valor1)) + 5);
		

	}
	private static void ejercicio1() {
		int numero1 = 36;
		int numero2 = 27;
		int numero3 = 15;
		int numero4 =4;
		System.out.println(numero1 + numero2);
		System.out.println(numero3 + numero4);
		System.out.println(numero3 - numero4);
		System.out.println(numero3 / numero4);
		System.out.println(numero3 * numero4);
		System.out.println(numero3 % numero4);
	}

	public static void main(String[] args) {
		ejemplosConversiones();
	}
}

