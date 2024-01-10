import java.util.*;
public class ifelse2b {
    public static void main(String[] args) {
        String username = "ABCD";
        String password = "1234";
        Scanner teclado = new Scanner(System.in);
        boolean log = false;
        
        while (log == false) {
            System.out.println("Digite seu Login:");
            String login = teclado.nextLine();
            System.out.println("Digite sua Senha:");
            String senha = teclado.nextLine();
            if (login.equals(username) && senha.equals(password)) {
                System.out.println("Login Aceito.");
                log = true;;
            } else {
                System.out.println("Login Inválido");
            }
        }
        teclado.close();
    }
}