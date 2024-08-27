package meu.com.dio.desafio.dominio;

public abstract class Conteudo {
    /*  Atributos da Classe: */
    protected String titulo;
    protected String descricao;

    /*  Constante que determina o ponto de experiência adquirido após concluir cursos ou mentorias 
     *  Defini protected para ser acessado somente dentro da classe de origem e também as classes-filhas;
     *  Defini static para ser acessado sem a necessidade de instanciar a classe (além disso, esta, sendo
     *  uma classe abstrata não é possível criação de uma nova instância : new Conteudo() dará erro);
     */
    protected static final double PONTO_EXPERIENCIA = 18.9;
    
    /*  Método abstrato ou seja, sem corpo, apenas define um contatro (classes que extenderem esta classe
        precisarão implmentar este método, obrigatoriamente);
    */
    public abstract double calcularXP(); //retorna valor do xp;

    
    
    /*Metodos Getters */
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    

}
