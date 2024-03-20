import java.util.Random;

public class JogadorGerador {
    private static boolean requisicaoFeita = false;
    private static String[] nomes;
    private static String[] sobrenomes;
    private static String[] posicoes;
    private static String[] clubes;
    private static Random random = new Random();

    // Método para realizar a requisição HTTP apenas uma vez
    private static void fazerRequisicaoHTTP() {
        // Simulando a requisição HTTP
        nomes = new String[]{"Cassio", "Ronaldo", "Neymar", "Roberto", "Maria"};
        sobrenomes = new String[]{"Silva", "Ramos", "Santos", "Oliveira", "Ferreira"};
        posicoes = new String[]{"goleiro", "atacante", "zagueiro", "meia", "lateral"};
        clubes = new String[]{"Corinthians", "Flamengo", "São Paulo", "Palmeiras", "Grêmio"};
        requisicaoFeita = true;
    }

    // Método para gerar um jogador aleatório
    public static Jogador gerarJogador() {
        if (!requisicaoFeita) {
            fazerRequisicaoHTTP();
        }

        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        int idade = random.nextInt(24) + 17;
        String posicao = posicoes[random.nextInt(posicoes.length)];
        String clube = clubes[random.nextInt(clubes.length)];

        return new Jogador(nome, sobrenome, idade, posicao, clube);
    }
}
