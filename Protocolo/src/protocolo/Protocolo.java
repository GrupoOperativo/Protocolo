package protocolo;


public class Protocolo {
    public static void main(String[] args) {
        String cifrada;
        String descifrada;
        int opc = 0;
        Proceso objeto = new Proceso();
        while(true){
            opc = objeto.menu();
            if(opc == 1){
                cifrada  = objeto.cifrado();
                System.out.println(cifrada);
            }
            else if(opc == 2){
                descifrada = objeto.descifrado();
                System.out.println(descifrada);
            }
            else if(opc == 3){
                System.out.println("Hasta luego");
                break;
            }
            else
                System.out.println("Ingrese una opción válida");
        }
    }
}
