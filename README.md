# Atividade Social Media

Este projeto em Java permite gerenciar e publicar conteúdos em múltiplas redes sociais de forma unificada. Ele possui uma estrutura enxuta com uma camada central que gerencia conteúdos (Conteudo.java) e plataformas (GerenciadorMidiaSocial.java), adaptadores para cada rede social (TwitterAdapter.java, InstagramAdapter.java) e uma fábrica (SocialMediaFactory.java) para criar esses adaptadores dinamicamente. Há também um utilitário simples de logging (Logger.java).

No Main.java é possível ver um exemplo de uso: cria-se um gerente de mídias sociais, registram-se as plataformas e publica-se um conteúdo com título, corpo e data de agendamento. Por enquanto, a publicação é simulada no console, mas a estrutura permite fácil expansão para integrar APIs reais de redes sociais.
