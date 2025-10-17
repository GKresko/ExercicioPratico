package core;

import java.time.LocalDateTime;

public class Conteudo {
    private String titulo, corpo;
    private LocalDateTime agendamento;

    public Conteudo(String titulo, String corpo, LocalDateTime agendamento) {
        this.titulo = titulo; this.corpo = corpo; this.agendamento = agendamento;
    }
    public String getTitulo() { return titulo; }
    public String getCorpo() { return corpo; }
    public LocalDateTime getAgendamento() { return agendamento; }
}
