package trabajoPracticoNro06;

import java.util.Scanner;

public class Principal {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scan = new Scanner (System.in);
        int  cantidad, longitud;
		
		System.out.println("cantidad de contraseņas:");
		cantidad = scan.nextInt();
        
        System.out.println("longitud de la/las contraseņa/as:");
        longitud = scan.nextInt();
        
        Passwords passwords = new Passwords(cantidad, longitud);

        System.out.println("CONTRASEŅAS");

        for (int i = 0; i < passwords.getPasswords().length; i++) {
        	
            System.out.print(passwords.getPasswords()[i]);
            System.out.print("--->");
            
            if(passwords.analizarSeguridad(passwords.getPasswords()[i])==1) {
            	System.out.print("FUERTE");
            }else {
            	System.out.print("DEBIL");
            }
            
            System.out.println("");
            
        }

	}

}
