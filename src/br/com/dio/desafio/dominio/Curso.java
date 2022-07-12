package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    // ao conclui o curso multiplica o xp com a carga horaria do curso
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
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

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }

}
