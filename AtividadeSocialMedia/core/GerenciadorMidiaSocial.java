package core;

import adapters.AdapterMidiaSocial;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GerenciadorMidiaSocial {
    private final List<AdapterMidiaSocial> plataformas = new CopyOnWriteArrayList<>();

    public void registrarPlataforma(AdapterMidiaSocial adapter) {
        plataformas.add(adapter);
    }

    public void publicarConteudo(Conteudo conteudo) {
        for (AdapterMidiaSocial plataforma : plataformas) {
            try {
                plataforma.publicar(conteudo);
            } catch (Exception e) {
                System.err.println("Erro ao publicar em " + plataforma.getNome() + ": " + e.getMessage());
            }
        }
    }
}
