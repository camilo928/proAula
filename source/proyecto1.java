import java.util.Scanner;

public class Menu_Principal {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion = leer.nextInt();

        String usuario[][] = new String[1000][4];
        int numUsuarios = 0;

        String[][] usuarisosGuardados = new String[1000][2];
        int usuarisosRegistrados = 0;
        String contraseña = "";
        String user = "";

        int opcioninicial;
        do {
            System.out.println("||           MAIN          ||    ");
            System.out.println("||         OPCIONES        ||     ");
            System.out.println("1.       Registrarse         ");
            System.out.println("2.      Iniciar sesion       ");
            System.out.println("3.  Salir de la aplicacion   ");
            System.out.println("Digite una opcion");
            opcioninicial = leer.nextInt();

            switch (opcioninicial) {
                case 1:
                    
                    break;
                    case 2:
                    System.out.println("Ingrese su usuario:");
                    String users = leer.nextLine();
                    System.out.println("Digite su contraseña");
                    String passaword = leer.nextLine();

                    if (users.equals(user) && passaword.equals(contraseña)) {
                        int opcionUser;
                        do {
                            System.out.println("Welcome");
                            System.out.println("1.calcular el consumo");
                            System.out.println("2. Historial de consumo");
                            System.out.println("3.salir ");

                            System.out.println("Digite una opcion");
                            opcion = leer.nextInt();

                            switch (opcion) {
                                case 1:
                                System.out.println("Digite el codigo del electrodomestico");
                                String codigo = leer.nextLine();
                                System.out.println("Digite el nombre del electrodomestico");
                                String nombre = leer.nextLine();
                                System.out.println("Digite el tipo de electrodomestico");
                                String tipo = leer.nextLine();
                                System.out.println("Digite el consumo de fabrica del electrodomestico");
                                String consumo_aparato = leer.nextLine();
                                System.out.println("Digite la eficiencia energetica del electrodomestico");
                                String eficiencia = leer.nextLine();

                                    
                                    break;
                            
                                default:
                                    break;
                            }

                        } while (opcion != 4);

                    } else {
                        System.out.println("Algo salio mal");
                    }

                default:
                    break;
            }

        } while (opcioninicial < 3);
    }
}
