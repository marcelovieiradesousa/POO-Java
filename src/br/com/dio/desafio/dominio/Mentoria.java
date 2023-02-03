package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;
    private Dificuldade nivel;

    public Dificuldade getNivel() {
        return nivel;
    }

    public void setNivel(Dificuldade nivel) {
        this.nivel = nivel;
    }
    
    public Mentoria() {
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }
    public void descricaoMentoriaCompleta(){
        System.out.println(String.format("A mentoria %s, tem por início às %s horas e você encontrará conteúdo como %s. Para mais informações acesse: www.dio.me . Divirta-se!", getTitulo(), getData(), getDescricao()));
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
