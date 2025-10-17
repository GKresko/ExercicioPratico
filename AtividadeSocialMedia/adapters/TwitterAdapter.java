package adapters;

import core.Conteudo;

public class TwitterAdapter implements AdapterMidiaSocial {
    @Override
    public void publicar(Conteudo c) {
        System.out.println("[Twitter] Publicado: " + c.getTitulo());
    }
    @Override
    public String getNome() { return "Twitter"; }
}
