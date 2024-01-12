import java.util.*;
public class IfElse1 {
    public static void main(String[] args) {
        boolean sair = false;
        String texto = "Faça o que for necessário para ser feliz. Mas não se esqueça que a felicidade é um sentimento simples, você pode encontrá-la e deixá-la ir embora por não perceber sua simplicidade.\n'Martha Medeiros'";
        Scanner scnPalavra = new Scanner(System.in);
        String palavra;
        int posicaoPalavra;
        
        while (sair == false) {
            System.out.println(texto);
            System.out.println("Digite uma palavra do texto acima para encontrar a sua posição.");
            palavra = scnPalavra.nextLine();
            posicaoPalavra = texto.indexOf(palavra);
                if (posicaoPalavra >= 0) {
                    System.out.println("A palavra '"+palavra+"' esta na posição "+posicaoPalavra+".");
                } else {
                    System.out.println("Palavra nao encontrada. Tente Novamente.");
                }
            System.out.println("Digite 'c' para continuar ou 's' para sair, depois tecle Enter");
            String resp = scnPalavra.nextLine();
                if (resp.equals("s") || resp.equals("S")) {
                sair = true;
                }
        }
        scnPalavra.close();
    }
}
