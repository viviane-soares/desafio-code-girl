package br.com.dio.desafio.dominio;
// classe mae, praticando Herança//

public abstract class Conteudo {

    //static permite  acessar o xp_padrão fora da classe conteudo.

    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
    //classe abstrata,
    public abstract double calcularXp();


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
}
