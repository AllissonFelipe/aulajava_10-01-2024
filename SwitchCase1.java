import java.util.*;
public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner scnTeste = new Scanner(System.in);
        String[] opcoes = {"Criar", "Fechar", "Editar", "Excluir"};
        
        for (int i = 0; i < opcoes.length; i++) {
        System.out.println(i + "[" +opcoes[i]+ "]");       
        }
        System.out.println("Digite a opção desejada.");
        int resp = scnTeste.nextInt();
        switch (resp) {
            case 0:
            System.out.println("Voce escolheu a opção '"+opcoes[0]+"'");
            break;
            case 1:
            System.out.println("Você escolhe a opção '"+opcoes[1]+"'");
            break;
            case 2:
            System.out.println("Voce escolheu a opção '"+opcoes[2]+"'");
            break;
            case 3:
            System.out.println("Você escolhe a opção '"+opcoes[3]+"'");
            break;
        }
        scnTeste.close();
    }
}
