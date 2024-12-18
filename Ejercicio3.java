
public class Ejercicio3 {
	class Producto {
	    String nombre;
	    int stock;
	    double precio;

	    Producto(String nombre, int stock, double precio) {
	        this.nombre = nombre;
	        this.stock = stock;
	        this.precio = precio;
	    }

	    public String toString() {
	        return nombre + ", " + stock + ", " + precio;
	    }
	}

	public class Inventario {
	    private static final int MAX_PRODUCTOS = 100;
	    private static final int STOCK_SEGURIDAD = 50;
	    private static Producto[] inventario = new Producto[MAX_PRODUCTOS];
	    private static int numProductos = 0;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int opcion;

	        do {
	            mostrarMenu();
	            opcion = sc.nextInt();
	            sc.nextLine(); // Limpiar el buffer

	            switch (opcion) {
	                case 1:
	                    introducirDatosInventario();
	                    break;
	                case 2:
	                    nuevoProducto();
	                    break;
	                case 3:
	                    buscarModificarProducto();
	                    break;
	                case 4:
	                    eliminarProducto();
	                    break;
	                case 5:
	                    mostrarValorTotalInventario();
	                    break;
	                case 6:
	                    informeRoturaStock();
	                    break;
	                case 7:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 7.");
	            }
	        } while (opcion != 7);

	        sc.close();
	    }

	    private static void mostrarMenu() {
	        System.out.println("Menú:");
	        System.out.println("1. Introducir datos nuevo inventario");
	        System.out.println("2. Nuevo producto");
	        System.out.println("3. Buscar producto y modificar información");
	        System.out.println("4. Eliminar producto");
	        System.out.println("5. Mostrar valor total del inventario");
	        System.out.println("6. Informe rotura de stock");
	        System.out.println("7. Salir");
	        System.out.print("Elige una opción: ");
	    }

	    private static void introducirDatosInventario(Scanner scanner) {
	        System.out.print("¿Cuántos productos desea introducir? ");
	        int cantidad = sc.nextInt();
	        sc.nextLine(); // Limpiar el buffer

	        for (int i = 0; i < cantidad; i++) {
	            System.out.println("Introduciendo datos para el producto " + (i + 1) + ":");
	            nuevoProducto();
	        }
	    }

	    private static void nuevoProducto(Scanner scanner) {
	        if (numProductos >= MAX_PRODUCTOS) {
	            System.out.println("El inventario está lleno. No se pueden añadir más productos.");
	            return;
	        }

	        System.out.print("Nombre del producto: ");
	        String nombre = scanner.nextLine();
	        System.out.print("Cantidad en stock: ");
	        int stock = scanner.nextInt();
	        System.out.print("Precio del producto: ");
	        double precio = scanner.nextDouble();
	        scanner.nextLine(); // Limpiar el buffer

	        inventario[numProductos++] = new Producto(nombre, stock, precio);
	        System.out.println("Producto añadido correctamente.");
	    }

	    private static void buscarModificarProducto(Scanner scanner) {
	        System.out.print("Nombre del producto a buscar: ");
	        String nombre = scanner.nextLine();

	        for (int i = 0; i < numProductos; i++) {
	            if (inventario[i].nombre.equalsIgnoreCase(nombre)) {
	                System.out.print("Nueva cantidad en stock: ");
	                int nuevoStock = scanner.nextInt();
	                System.out.print("Nuevo precio del producto: ");
	                double nuevoPrecio = scanner.nextDouble();
	                scanner.nextLine(); // Limpiar el buffer

	                inventario[i].stock = nuevoStock;
	                inventario[i].precio = nuevoPrecio;
	                System.out.println("Producto actualizado correctamente.");
	                return;
	            }
	        }
	        System.out.println("Producto no encontrado.");
	    }

	    private static void eliminarProducto(Scanner scanner) {
	        System.out.print("Nombre del producto a eliminar: ");
	        String nombre = scanner.nextLine();

	        for (int i = 0; i < numProductos; i++) {
	            if (inventario[i].nombre.equalsIgnoreCase(nombre)) {
	                for (int j = i; j < numProductos - 1; j++) {
	                    inventario[j] = inventario[j + 1];
	                }
	                inventario[--numProductos] = null;
	                System.out.println("Producto eliminado correctamente.");
	                return;
	            }
	        }
	        System.out.println("Producto no encontrado.");
	    }

	    private static void mostrarValorTotalInventario() {
	        double valorTotal = 0.0;

	        for (int i = 0; i < numProductos; i++) {
	            valorTotal += inventario[i].stock * inventario[i].precio;
	        }

	        System.out.println("El valor total del inventario es: " + valorTotal);
	    }

	    private static void informeRoturaStock() {
	        System.out.println("Productos con stock por debajo del stock de seguridad (" + STOCK_SEGURIDAD + "):");

	        for (int i = 0; i < numProductos; i++) {
	            if (inventario[i].stock < STOCK_SEGURIDAD) {
	                System.out.println(inventario[i].nombre + " - Stock: " + inventario[i].stock);
	            }
	        }
	    }
	}