package adapters;

import core.Conteudo;

public class InstagramAdapter implements AdapterMidiaSocial {
    @Override
    public void publicar(Conteudo c) {
        System.out.println("[Instagram] Publicado: " + c.getTitulo());
    }
    @Override
    public String getNome() { return "Instagram"; }
}
