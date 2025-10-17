package adapters;

import core.Conteudo;

public interface AdapterMidiaSocial {
    void publicar(Conteudo c) throws Exception;
    String getNome();
}
