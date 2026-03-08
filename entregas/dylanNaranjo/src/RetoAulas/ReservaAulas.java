import java.util.Scanner;

public class ReservaAulas {

    private static final int OPCION_RESERVAR = 1;
    private static final int OPCION_LIBERAR = 2;
    private static final int OPCION_SALIR = 3;
    private static final int AULA_NO_DISPONIBLE = -1;
    private static final String PREFIJO_INFO = "[INFO]";
    private static final String PREFIJO_ACCION = "[ACCION]";

    public static void main(String[] args) {
        int opcion, aulaReservada, numeroAula;
        boolean[] aulas = { true, true, true };
        boolean aulaLiberada;

        Scanner scanner = new Scanner(System.in);

        do {
            mostrarEstadoAulas(aulas);

            System.out.println(PREFIJO_INFO + " ¿Qué desea hacer?");
            System.out.println("1. Reservar un aula");
            System.out.println("2. Liberar un aula");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case OPCION_RESERVAR:
                    System.out.println(PREFIJO_ACCION + " Ingrese el nombre del profesor para reservar un aula:");
                    String nombreProfesor = scanner.nextLine();
                    aulaReservada = reservarAula(aulas);
                    if (aulaReservada == AULA_NO_DISPONIBLE) {
                        System.out.println(PREFIJO_INFO + " No hay aulas disponibles. Por favor, inténtelo nuevamente más tarde.");
                    } else {
                        System.out.println(
                            String.format("%s El profesor %s ha reservado el Aula %d.", 
                                PREFIJO_INFO, nombreProfesor, (aulaReservada + 1))
                        );
                    }
                    break;
                case OPCION_LIBERAR:
                    System.out.println(PREFIJO_ACCION + " Ingrese el número de aula a liberar:");
                    numeroAula = scanner.nextInt();
                    scanner.nextLine();
                    aulaLiberada = liberarAula(aulas, numeroAula);
                    if (aulaLiberada) {
                        System.out.println(
                            String.format("%s El Aula %d ha sido liberada.", PREFIJO_INFO, numeroAula)
                        );
                    } else {
                        System.out.println(PREFIJO_INFO + " El número de aula ingresado es inválido o el aula ya estaba libre.");
                    }
                    break;
                case OPCION_SALIR:
                    System.out.println(PREFIJO_INFO + " Programa finalizado.");
                    break;
                default:
                    System.out.println(PREFIJO_INFO + " Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != OPCION_SALIR);
    }

    public static void mostrarEstadoAulas(boolean[] aulas) {
        System.out.println("Estado de las aulas:");
        for (int i = 0; i < aulas.length; i++) {
            String estado = aulas[i] ? "Libre" : "Ocupada";
            System.out.println(String.format("Aula %d: %s", (i + 1), estado));
        }
        System.out.println();
    }

    public static int reservarAula(boolean[] aulas) {
        for (int i = 0; i < aulas.length; i++) {
            if (aulas[i]) {
                aulas[i] = false;
                return i;
            }
        }
        return AULA_NO_DISPONIBLE;
    }

    public static boolean liberarAula(boolean[] aulas, int numeroAula) {
        if (numeroAula >= 1 && numeroAula <= aulas.length) {
            if (!aulas[numeroAula - 1]) {
                aulas[numeroAula - 1] = true;
                return true;
            }
        }
        return false;
    }
}