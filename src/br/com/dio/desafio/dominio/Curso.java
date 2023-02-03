package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;
    private Dificuldade nivel;

    public Dificuldade getNivel() {
        return nivel;
    }

    public void setNivel(Dificuldade nivel) {
        this.nivel = nivel;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void descricaoCursoCompleta(){
        System.out.println(String.format("O curso %s, tem por %s horas de duração e você encontrará aulas como %s. Para mais informações acesse: www.dio.me . Divirta-se!", getTitulo(), getCargaHoraria(), getDescricao()));
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
