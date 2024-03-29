package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OscarService oscarService = new OscarService();

        Filme filme1 = new Filme("Titanic", true);
        Filme filme2 = new Filme("A Chave Mestra", false); // Não elegível
        Ator ator1 = new Ator("Henry Cavill", true);
        Ator ator2 = new Ator("Chris Hemsworth", true);

        oscarService.adicionarIndicacao(filme1);
        oscarService.adicionarIndicacao(filme2); // Não será adicionado
        oscarService.adicionarIndicacao(ator1);
        oscarService.adicionarIndicacao(ator2);

        System.out.println("Lista de Indicados:");
        for (Indicavel indicavel : oscarService.listarIndicados()) {
            System.out.println("- " + indicavel.getNome() + ", Categoria: " + indicavel.getCategoria());
        }
    }
}
