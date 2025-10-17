import core.*;
import adapters.*;
import factories.SocialMediaFactory;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        GerenciadorMidiaSocial gerente = new GerenciadorMidiaSocial();
        gerente.registrarPlataforma(SocialMediaFactory.criar("Twitter"));
        gerente.registrarPlataforma(SocialMediaFactory.criar("Instagram"));

        Conteudo c = new Conteudo("Promoção", "Desconto de 20%!", LocalDateTime.now().plusMinutes(5));
        gerente.publicarConteudo(c);
    }
}
