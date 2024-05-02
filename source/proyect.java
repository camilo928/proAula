import java.util.Scanner;

public class crud_menu {

    static Scanner leer = new Scanner(System.in);
    static final int elementos = 5;
    static Equipo[] aparatos = new Equipo[elementos];
    static Equipo aparato = new Equipo();
    static int op, op_crud, num_aparato = 1, pos;
    static String id_aparato;

    public static void main(String[] args) {
        aparato.codigo = "";
        aparato.nombre = "";
        aparato.consumo = "";
        aparato.eficiencia = "";
        aparato.tipo = "";
        aparatos[0] = aparato;

        do {
            limpiar_Pantalla();
            Menu_Principal();
            System.out.println("Digite la opción: ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("---Accediste al programa---");
                    gestionarEquipos();
                    break;
                case 2:
                    System.out.println("---Accediste al programa---");
                    pausa();

                    break;
                case 3:
                    System.out.println("Accediste al programa");
                    pausa();

                    break;

            }
        } while (op >= 1 && op < 4);
        System.out.println("Gracias por usar el software");

    }

    static void Menu_Principal() {
        System.out.println("------------------------------------------");
        System.out.println("----------------Menu Principal------------");
        System.out.println("------------------------------------------");
        System.out.println("1.||||||||       Equipo           ||||||||");
        System.out.println("2.||||||        Consumo             ||||||");
        System.out.println("3.||||    Historial de consumo        ||||");
        System.out.println("4.||     salir de la aplicacion         ||");

        /**
         * 
         */
    }

    /**
     * 
     */
    public static void gestionarEquipos() {
        do {
            limpiar_Pantalla();
            System.out.println("Gestion de equipos");
            menu_crud();
            System.out.println("Digite la opción: ");
            op_crud = leer.nextInt();
            switch (op_crud) {
                case 1:
                    if (num_aparato < elementos) {
                        System.out.println("Digite la identificación del equipo(código)");
                        id_aparato = leer.next();
                        pos = consultarEquipo(id_aparato);

                        if (pos == -1) {
                            aparato = new Equipo();
                            aparato.codigo = id_aparato;
                            System.out.println("Digite el nombre del equipo");
                            aparato.nombre = leer.next();
                            System.out.println("Digite el tipo de equipo");
                            aparato.tipo = leer.next();
                            System.out.println("Digite el consumo de fabrica del equipo");
                            aparato.consumo = leer.next();
                            System.out.println("Digite la eficienia del equipo");
                            aparato.eficiencia = leer.next();

                            aparatos[num_aparato] = aparato;
                            System.out.println("Los datos fueron registrados con exito!");
                            pausa();
                        } else {
                            System.out.println("\nEl aparato se encuentra registrado!");
                            mostarEquipo(pos);
                            pausa();
                        }

                    } else {
                        System.out.println("No es posible agregar otro equipo, no hay espacio.");
                        pausa();
                    }
                    break;

                case 2:
                    System.out.println("--listar equipos--");
                    pausa();
                    break;
                case 3:
                    System.out.println("--Modificar equipos--");
                    pausa();
                    break;
                case 4:
                    System.out.println("--Eliminar equipos--");
                    pausa();
                    break;
            }
        } while (op_crud != 5);
    }

    public static int consultarEquipo(String id_aparato) {
        int posicion = -1;
        for (int i = 0; i < num_aparato; i++) {
            if (aparatos[i].codigo.equals(id_aparato)) {
                posicion = i;

            }
        }
        return posicion;
    }

    public static void mostarEquipo(int posicion_equipo) {
        System.out.println("\n--------------------------------------");
        System.out.println("        Informacion del equipo");
        System.out.println("----------------------------------------");
        System.out.println("Código del equipo   : " + aparatos[posicion_equipo].codigo);
        System.out.println("Nombre del equipo : " + aparatos[posicion_equipo].nombre);
        System.out.println("Tipo de equipo : " + aparatos[posicion_equipo].tipo);
        System.out.println("Eficiencia del equipo : " + aparatos[posicion_equipo].eficiencia);
        System.out.println("Consumo de fabrica " + aparatos[posicion_equipo].consumo);
    }

    static void menu_crud() {
        System.out.println("1. Registrar");
        System.out.println("2. Listar");
        System.out.println("3. Modificar");
        System.out.println("4. Eliminar");
        System.out.println("5. Regresar al menú principal");

    }

    public static void limpiar_Pantalla() {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            Process startProcess = pb.inheritIO().start();
            startProcess.waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void pausa() {
        leer.nextLine();
        System.out.println("\t\nPresione enter para continuar...");
        leer.nextLine();

    }

}
