package app;

import service.RegistroService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RegistroService registro = new RegistroService("src/resources/registro.txt");

        int opcion = 0;

        do {

            System.out.println("\n=== LLANQUIHUE TOUR ===");
            System.out.println("1. Mostrar todos los registros");
            System.out.println("2. Mostrar proveedores de transporte");
            System.out.println("3. Mostrar proveedores de alojamiento");
            System.out.println("4. Buscar por nombre");
            System.out.println("5. Buscar por RUT");
            System.out.println("6. Agregar proveedor");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            try {

                opcion = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Debe ingresar un numero.");
                opcion = 0;
            }

            switch (opcion) {

                case 1:
                    registro.mostrarRegistros();
                    break;

                case 2:
                    registro.mostrarProveedoresTransporte();
                    break;

                case 3:
                    registro.mostrarProveedoresAlojamiento();
                    break;

                case 4:
                    System.out.print("Ingrese nombre: ");
                    registro.buscarPorNombre(scanner.nextLine());
                    break;

                case 5:
                    System.out.print("Ingrese RUT: ");
                    registro.buscarPorRut(scanner.nextLine());
                    break;

                case 6:
                    registro.agregarProveedorAlArchivo(scanner);
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}