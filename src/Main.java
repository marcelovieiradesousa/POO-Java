import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Dificuldade;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        curso1.setNivel(Dificuldade.DIFICIL);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("eventos html");
        curso2.setCargaHoraria(4);
        curso2.setNivel(Dificuldade.BASICO);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("programação básica java");
        mentoria.setData(LocalDate.now());
        mentoria.setNivel(Dificuldade.INTERMEDIARIO);

        System.out.println("Dificuldade de Cursos e Mentorias");
        System.out.println(curso1.getTitulo() + " é "+ curso1.getNivel().toString());
        System.out.println(curso2.getTitulo() + " é "+ curso2.getNivel().toString());
        System.out.println(mentoria.getTitulo() + " é "+ mentoria.getNivel().toString());
        

        System.out.println("Descrição Completa de Cursos e Mentorias");
        curso1.descricaoCursoCompleta();
        curso2.descricaoCursoCompleta();
        mentoria.descricaoMentoriaCompleta();

        System.out.println("===============");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
