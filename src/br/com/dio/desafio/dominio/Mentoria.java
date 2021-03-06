package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo {

  private LocalDate data;

  // o metodo calcular Xp e feito quando tem uma nova mentoria//
  @Override
  public double calcularXp() {
    return XP_PADRAO + 20d;
  }


  public Mentoria() {
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "\n ** Mentoria :" +
            "\n - Titulo :" + getTitulo() +
            " - Descrição: " + getDescricao()  +
            " - Data: " + data +
            '}';
  }
}
