package factories;

import adapters.*;

public class SocialMediaFactory {
    public static AdapterMidiaSocial criar(String plataforma) {
        switch(plataforma.toLowerCase()) {
            case "twitter": return new TwitterAdapter();
            case "instagram": return new InstagramAdapter();
            default: throw new IllegalArgumentException("Plataforma desconhecida: " + plataforma);
        }
    }
}
