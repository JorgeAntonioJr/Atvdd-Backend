public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = JogadorGerador.gerarJogador();
        Jogador jogador2 = JogadorGerador.gerarJogador();

        System.out.println("Dados do jogador 1:");
        System.out.println("Nome: " + jogador1.getNome());
        System.out.println("Sobrenome: " + jogador1.getSobrenome());
        System.out.println("Idade: " + jogador1.getIdade());
        System.out.println("Posição: " + jogador1.getPosicao());
        System.out.println("Clube: " + jogador1.getClube());
        System.out.println("Descrição: " + jogador1.getDescricao());

        System.out.println();

        System.out.println("Dados do jogador 2:");
        System.out.println("Nome: " + jogador2.getNome());
        System.out.println("Sobrenome: " + jogador2.getSobrenome());
        System.out.println("Idade: " + jogador2.getIdade());
        System.out.println("Posição: " + jogador2.getPosicao());
        System.out.println("Clube: " + jogador2.getClube());
        System.out.println("Descrição: " + jogador2.getDescricao());
    }
}
