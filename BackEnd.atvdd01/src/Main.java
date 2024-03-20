import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Arrays de nomes, sobrenomes, posições e clubes
        String[] nomes = {"Cassio", "Ronaldo", "Neymar", "Roberto", "Maria"};
        String[] sobrenomes = {"Silva", "Ramos", "Santos", "Oliveira", "Ferreira"};
        String[] posicoes = {"goleiro", "atacante", "zagueiro", "meia", "lateral"};
        String[] clubes = {"Corinthians", "Flamengo", "São Paulo", "Palmeiras", "Grêmio"};

        // Instância um objeto Random
        Random random = new Random();

        // Seleciona nomes aleatórios
        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];

        // Seleciona idade aleatória entre 17 e 40 anos
        int idade = random.nextInt(24) + 17;

        // Seleciona posição e clube aleatórios
        String posicao = posicoes[random.nextInt(posicoes.length)];
        String clube = clubes[random.nextInt(clubes.length)];

        // Exibe a mensagem no console
        System.out.println(nome + " " + sobrenome + " é um futebolista brasileiro de " + idade +
                " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".");
    }
}