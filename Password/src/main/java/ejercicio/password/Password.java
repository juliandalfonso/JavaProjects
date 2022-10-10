package ejercicio.password;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        
        //declaramos las variables necesarias
        scanPassword();
    }

    private static void scanPassword() {
        String password;
        Scanner in = new Scanner(System.in);
        System.out.print("INGRESE LA CONTRASEÑA: ");
        password = in.next();

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "/*!@#$%^&*(){}_[]|?/<>,.";

            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLetter(x)) {

                    hasLetter = true;
                }

                else if (Character.isDigit(x)) {

                    hasDigit = true;
                }
                else if (specialChars.contains(password.substring(i, i+1))) {
                    hasSpecial=true;
                }

                // no need to check further, break the loop
                if(hasLetter && hasDigit && hasSpecial){

                    break;
                }

            }
            if (hasLetter && hasDigit && hasSpecial) {
                System.out.println("CONTRASEÑA FUERTE");
            } else {
                System.out.println("CONTRASEÑA DÉBIL");
            }

        in.close();
    }
}
