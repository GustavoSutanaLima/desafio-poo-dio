package meu.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private double cargaHoraria;

    //Construtor Curso:
    public Curso(String titulo, String descricao, double cargaHoraria) {
        super.titulo = titulo; //atribuindo o titulo à classe-mãe;
        super.descricao = descricao; //item para descrição
        this.cargaHoraria = cargaHoraria;
    }

    /*Pontos de experiência adquirido ao concluir um curso */
    @Override
    public double calcularXP() {
        return PONTO_EXPERIENCIA*this.cargaHoraria*(5/3);
        
    }

    @Override
    public String toString() {
        return "Curso: " + "[titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    
}
