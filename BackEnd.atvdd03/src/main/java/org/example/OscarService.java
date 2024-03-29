package org.example;

import java.util.ArrayList;
import java.util.List;

public class OscarService {
    private List<Indicavel> indicados = new ArrayList<>();
    private int numeroDeIndicacoes = 0;

    public void adicionarIndicacao(Indicavel indicacao) {
        if (indicacao.isElegivel()) {
            indicados.add(indicacao);
            numeroDeIndicacoes++;
        }
    }

    public List<Indicavel> listarIndicados() {
        return indicados;
    }

    public int getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }
}
