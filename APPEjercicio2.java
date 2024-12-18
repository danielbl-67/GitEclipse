package Prueba5_Burdallo_Daniel;
import java.util.*;
import Boletin9.Incidencias;
public class APPEjercicio2 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int opcion;

        do {
            // Mostrar menú
            System.out.println("Menú:");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarEntradasLibres();
                    break;
                case 2:
                    venderEntradas();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 3.");
            }
        } while (opcion != 3);

        sc.close();
    }

    // Método para mostrar el número de entradas libres
    private static void mostrarEntradasLibres() {
        System.out.println("Entradas libres:");
        System.out.println("Zona Principal: " + entradaPricipal);
        System.out.println("Zona Platea: " + entradaPlatea);
        System.out.println("Zona VIP: " + entradaVip);
    }

    // Método para vender entradas
    private static void venderEntradas(Scanner scanner) {
        System.out.println("Zonas disponibles:");
        System.out.println("1. Zona Principal");
        System.out.println("2. Zona Platea");
        System.out.println("3. Zona VIP");
        System.out.print("Elige una zona: ");
        int zona = scanner.nextInt();

        System.out.print("¿Cuántas entradas quieres? ");
        int cantidad = scanner.nextInt();

        switch (zona) {
            case 1:
                venderEntradasZona("Principal", cantidad, entradasPrincipal, CAPACIDAD_PRINCIPAL);
                break;
            case 2:
                venderEntradasZona("Platea", cantidad, entradasPlatea, CAPACIDAD_PLATEA);
                break;
            case 3:
                venderEntradasZona("VIP", cantidad, entradasVip, CAPACIDAD_VIP);
                break;
            default:
                System.out.println("Zona no válida. Por favor, elige una zona del 1 al 3.");
        }
    }

    // Método auxiliar para vender entradas en una zona específica
    private static void venderEntradasZona(String nombreZona, int cantidad, int entradasDisponibles, int capacidadMaxima) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de entradas debe ser mayor que cero.");
            return;
        }

        if (cantidad > entradasDisponibles) {
            System.out.println("No hay suficientes entradas disponibles en la zona " + nombreZona + ". Entradas disponibles: " + entradasDisponibles);
        } else {
            System.out.println("Vendidas " + cantidad + " entradas en la zona " + nombreZona + ".");
            switch (nombreZona) {
                case "Principal":
                    entradasPrincipal -= cantidad;
                    break;
                case "Platea":
                    entradasPlatea -= cantidad;
                    break;
                case "VIP":
                    entradasVip -= cantidad;
                    break;
            }
        }
}
