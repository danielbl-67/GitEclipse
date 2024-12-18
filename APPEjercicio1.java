package Prueba5_Burdallo_Daniel;
import java.util.*;
public class APPEjercicio1 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		
		  // Leer la frase del teclado
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        // Dividir la frase en palabras
        String[] palabras = frase.split("\\s+");

        // Contar el número de palabras
        int numeroPalabras = palabras.length;

        // Inicializar variables para la palabra más corta y más larga
        String palabraMasCorta = palabras[0];
        String palabraMasLarga = palabras[0];

        for (String palabra : palabras) {
            if (palabra.length() < palabraMasCorta.length()) {
                palabraMasCorta = palabra;
            }
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        // Imprimir los resultados
        System.out.println("Número de palabras: " + numeroPalabras);
        System.out.println("Palabra más corta: " + palabraMasCorta + " (" + palabraMasCorta.length() + " caracteres)");
        System.out.println("Palabra más larga: " + palabraMasLarga + " (" + palabraMasLarga.length() + " caracteres)");
    }
}
			 
			 
		 }
		
	}
	
	
	
}
