package br.com.dio.desafio.dominio;

public class Curso {

    //os modificadores de acesso é private, ele so pode ter acesso/modificar através dos metodos getter and setters
  private   String titulo;
  private   String descricao;
  private   int cargaHoraria;


    public Curso() {
    }

    //encapsulamento//

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria( int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }
}
