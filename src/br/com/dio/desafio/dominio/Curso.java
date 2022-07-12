package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo {

    private double nota1 = 0d;
    private double notaFinal;

    // ao conclui o curso multiplica o xp com a carga horaria do curso
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public double calcularNota( ) {

        if (notaFinal > 70) {
            System.out.println("Parabéns você concluiu o Curso!");
        } else {
            System.out.println("Infelizmente, você não atingiu a nota necessária!");
        }
        return notaFinal = nota1 / NOTAS;
    }
    private   int cargaHoraria;

    public Curso() {
    }
    //encapsulamento//

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria( int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;

        return Double.compare(curso.nota1, nota1)
                == 0 && Double.compare(curso.notaFinal, notaFinal)
                == 0 && cargaHoraria == curso.cargaHoraria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota1, notaFinal, cargaHoraria);
    }

    @Override
    public String toString() {
        return " \n** Curso : **" +
                "\n - Titulo: " + getTitulo()  +
                " - Descrição: " + getDescricao() +
                " - Carga Horaria:" + cargaHoraria  + "Hr";




    }

}
