import java.util.Scanner;
public class proyecto{
    public static void main(String[] args){
        int op;
        String usu;
        String contra;//
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("1.INICIAR SESION");
        System.out.println("2.REGISTRARSE");
        System.out.println("3.SALIR");
        System.out.println("");
        op = leer.nextInt();

        do{
        switch (op) {
            case 1:
                System.out.println("Digite su usuario");
                usu = leer.next();
                System.out.println("Digite su contraceña");
                contra = leer.next();

                break;
        
            default:
                break;
        }
    }while (op <= 3); 
        
    
    }
}