import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arreglo arreglo = new Arreglo();
        int opcion = -1;

        do {
            System.out.println("ARREGLOS");
            System.out.println("1. Inicializar / Borrar arreglo");
            System.out.println("2. Mostrar arreglo");
            System.out.println("3. Buscar caracter");
            System.out.println("4. Insertar caracter");
            System.out.println("5. Eliminar caracter");
            System.out.println("6. Modificar caracter");
            System.out.println("7. Creditos");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        arreglo.iniciador_Borrar();
                        System.out.println("Se inicializo/borro el arreglo");
                        break;

                    case 2:
                        System.out.println("ARREGLO");
                        arreglo.Mostrar();
                        break;

                    case 3:
                        System.out.print("Buscar caracter: ");
                        char buscar = sc.nextLine().charAt(0);

                        System.out.println("Elige el tipo de búsqueda:");
                        System.out.println("1. Búsqueda Lineal Optimizada");
                        System.out.println("2. Búsqueda Binaria");
                        System.out.print("Opción: ");

                        int tipo = 1;
                        if (sc.hasNextInt()) {
                            tipo = sc.nextInt();
                            sc.nextLine();
                        } else {
                            sc.nextLine();
                        }

                        int[] res;
                        if (tipo == 1) {
                            res = arreglo.buscarLinealOptimizada(buscar);
                        } else {
                            res = arreglo.BuscarBinario(buscar);
                        }

                        if (res[0] != -1) {
                            System.out.println("Se encontro el caracter en la posicion: " + res[0]);
                        } else {
                            System.out.println("El carácter no existe en el arreglo.");
                        }
                        System.out.println("Número de ciclos tomados: " + res[1]);
                        break;

                    case 4:
                        System.out.print("Pon el caracter que quieras insertar: ");
                        char ins = sc.nextLine().charAt(0);
                        arreglo.Insertar(ins);
                        break;

                    case 5:
                        System.out.print("Ingresa el carácter a eliminar: ");
                        char elim = sc.nextLine().charAt(0);
                        int posElim = arreglo.Eliminar(elim);
                        if (posElim != -1) {
                            System.out.println("Caracter eliminado de la posición: " + posElim);
                        } else {
                            System.out.println("No se pudo encontrar el caracter");
                        }
                        break;

                    case 6:
                        System.out.print("Ingresa el caracter a modificar: ");
                        char mod = sc.nextLine().charAt(0);
                        int posMod = arreglo.Modificar(mod);
                        if (posMod != -1) {
                            System.out.println("Operación de modificación completada.");
                        } else {
                            System.out.println("No se pudo localizar el carácter y por lo tanto no procede la operación.");
                        }
                        break;

                    case 7:
                        System.out.println("CREDITOS");
                        System.out.println("Materia: Estructura de Datos");
                        System.out.println("Integrantes:");
                        System.out.println("LUIS ALEJRANDRO GALVAN GONZALEZ   |25420040");
                        System.out.println("MARIO ALBERTO AGUERO MENDOZA   |25420129");
                        System.out.println("ERNESTO MONTALVO MARTINEZ   |25420032");
                        break;

                    case 0:
                        System.out.println("BAI");
                        break;

                    default:
                        System.out.println("SYNTAX ERROR");
                        break;
                }
            } else {
                System.out.println("Pon la opcion correcta");
                sc.nextLine();
            }
        } while (opcion != 0);
        sc.close();
    }
}