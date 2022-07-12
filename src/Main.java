import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

            //instancia apartir da palavra new//

            Curso curso1 = new Curso();
            curso1.setTitulo("curso Java");
            curso1.setDescricao("descrição curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("curso Js");
            curso2.setDescricao("descrição curso js");
            curso2.setCargaHoraria(4);
//polimorfismo, tudo que tenho em conteudo tera em curso, porem oque tiver em curso nao tera em conteudo/
// Conteudo conteudo = new Curso();

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria Java");
            mentoria.setDescricao("descrição mentoria java");
            mentoria.setData(LocalDate.now());

            /*System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria);*/

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devViviane = new Dev();
            devViviane.setNome("Viviane");
            devViviane.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos inscritos Viviane" +devViviane.getConteudosInscritos());
            devViviane.progredir();
            devViviane.progredir();
            System.out.println("--");
            System.out.println("Conteudos inscritos Viviane" +devViviane.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos: " +devViviane.getConteudosConcluidos());
            System.out.println("XP: " + devViviane.calcularTotalXp());

            System.out.println("---------------------------------");

            Dev devWesley = new Dev();
            devWesley.setNome("Wesley");
            devWesley.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos inscritos Wesley: "+devWesley.getConteudosInscritos());
            devWesley.progredir();
            System.out.println("-");
            System.out.println("Conteudos inscritos Wesley" +devWesley.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos: " +devWesley.getConteudosConcluidos());
            System.out.println("XP: " + devWesley.calcularTotalXp());


    }
}

