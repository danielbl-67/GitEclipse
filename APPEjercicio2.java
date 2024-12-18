package Prueba6TRIM1;
import java.util.*;
import Boletin9.Incidencias;
public class APPEjercicio2 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		Ejercicio2[] ejer= new Ejercicio2[3];
		
		System.out.println("Introduzca acontinuacion su opcion");
		menu();
		System.out.println("------------");
		System.out.println();
		int opcion=sc.nextInt();
		switch(opcion){
		case 1:
			entradasLibre();break;
		case 2:
			venta();break;
		case 3: System.out.println("Saliendo del programa");break;
		}
		
	}

	//-----------------------------
	public static void menu() {
		System.out.println("1-Mostrar número de entradas libres");
		System.out.println("2-Vender entradas");
		System.out.println("3-Salir");
	}
	//----------------------------
	public static void entradasLibre() {
		String zona;
		var sc = new Scanner(System.in);
		System.out.println("Introduzca la zona deseada");
		System.out.println("1-Principal");
		System.out.println("2-Platea");
		System.out.println("3-VIP");
		System.out.println("4-Salir");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:System.out.println("La zona PRINCIPAL tiene "+"entradas libres");break;
		case 2:System.out.println("La zona PLATEA tiene "+"entradas libres");break;
		case 3:System.out.println("La zona VIP tiene "+"entradas libres");break;
		case 4:System.out.println("Saliendo del programa");break;
		
		}
	}
	//-------------------------------
		public static void zonas(String zona,int numeroEntrada) {
			if(zona.toLowerCase()=="principal") {
				numeroEntrada=1000;
			}else if(zona.toLowerCase()=="platea") {
				numeroEntrada=200;
			}else {
				numeroEntrada=25;
			}
		}
	//--------------------------------
	public static void venta() {
		var sc = new Scanner(System.in);
		System.out.println("Que zona comprar entrada");
		System.out.println("1-Principal");
		System.out.println("2-Platea");
		System.out.println("3-VIP");
		System.out.println("4-Salir");
		int opcion=sc.nextInt();
		System.out.println("Cuantas entradas quieres");
		int opcion2=sc.nextInt();
		switch(opcion) {
		case 1:System.out.println("Ahora quedan");break;
		case 2:System.out.println("Ahora quedan");break;
		case 3:System.out.println("Ahora quedan");break;
		case 4:System.out.println("Saliendo del programa");break;
		}
		
		
	}
}
