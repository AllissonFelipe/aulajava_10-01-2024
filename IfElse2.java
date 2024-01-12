import java.util.*;
public class IfElse2 {
    public static void main(String[] args) {
        String username = "ABCD";
        String password = "1234";
        Scanner teclado = new Scanner(System.in);
        boolean log = false;
        boolean pass = false;
        
        while (log == false) {
            System.out.println("Digite seu Login:");
            String login = teclado.nextLine();
            if (!login.equals(username)) {
                System.out.println("Login Inválido.");
            } else {
                System.out.println("Login Aceito");
                log = true;
            }
        }
        while (pass == false) {
            System.out.println("Digite sua Senha:");
            String senha = teclado.nextLine();
            if (!senha.equals(password)) {
                System.out.println("Senha Inválida");
            } else {
                System.out.println("Senha Aceita");
                pass = true;
            }
        }
        teclado.close();
    }
}
