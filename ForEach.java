public class ForEach {
    public static void main(String[] args) {
        String[] opcoes = {"Carne", "Vegetais", "Frutas", "Limpeza", "Roupas", "Móveis"};

        System.out.println("Nos temos "+opcoes.length+" categorias de vendas.");
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((i+1)+" "+ opcoes[i]);
        }
    }
}
