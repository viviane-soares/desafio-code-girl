import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner ler = new Scanner(System.in);
             String forum;

            //instancia apartir da palavra new//

            Curso curso1 = new Curso();
            curso1.setTitulo("Curso 1, aprendendo Java\n");
            curso1.setDescricao(" Curso java\n");
            curso1.setCargaHoraria(8);
            curso1.setNotaFinal(10);

            Curso curso2 = new Curso();
            curso2.setTitulo("Curso 2, aprendendo Java Script\n");
            curso2.setDescricao("Aprendendo Java Script Básico\n");
            curso2.setCargaHoraria(4);
            curso2.setNotaFinal(8);

//polimorfismo, tudo que tenho em conteudo tera em curso, porem oque tiver em curso nao tera em conteudo/
// Conteudo conteudo = new Curso();

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo(" Mentoria sobre Java\n");
            mentoria.setDescricao("Tudo sobre Java básico\n");
            mentoria.setData(LocalDate.now());


            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("\n Bootcamp Java Developer\n");
            bootcamp.setDescricao("\n Bootcamp desiganado para Java Developer básico\n");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devViviane = new Dev();
            Curso devViviane1 = new Curso();
            devViviane.setNome(" \n Viviane\n");
            devViviane.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos inscritos da Aluna Viviane \n" +devViviane.getConteudosInscritos());
            devViviane.progredir();
            devViviane.progredir();
            devViviane1.calcularNota();
            System.out.println();




            System.out.println("Conteudos inscritos da Aluna Viviane\n" +devViviane.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos: \n" +devViviane.getConteudosConcluidos());
            System.out.println("XP: " + devViviane.calcularTotalXp());

            System.out.println("- Parabéns você finalizou mais uma Bootcamp! \n");
            System.out.println("___________________________________________");

            Dev devWesley = new Dev();
            devWesley.setNome("Wesley\n");
            devWesley.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos inscritos do Aluno Wesley: \n"+devWesley.getConteudosInscritos());
            devWesley.progredir();

            System.out.println("Conteudos inscritos do Aluno Wesley\n" +devWesley.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos:\n" +devWesley.getConteudosConcluidos());
            System.out.println("XP: " + devWesley.calcularTotalXp());
            System.out.println("- Parabéns você finalizou mais uma etapa! \n");
            System.out.println( "Qualquer duvida deixe sua mensagem no Forum: ");
            forum = ler.nextLine();

            System.out.println("Obrigado, iremos responder o quanto antes! Até mais!");



    }
}

