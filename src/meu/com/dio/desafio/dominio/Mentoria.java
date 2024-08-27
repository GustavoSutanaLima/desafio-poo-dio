package meu.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    /*  Atributos de mentoria */
    private LocalDate dataMentoria; //Data que a mentoria acontecerá;

    /*  Implmentação do método abstrato sobrecarregado:   */
          /*Pontos de experiência adquirido ao concluir uma mentoria */
    @Override
    public double calcularXP() {
        return PONTO_EXPERIENCIA*14.5;
        //Não há necessidade de usar super.PONTO_EXPERIENCIA pois a variavel PONTO_EXPIENCIA é estática;
    }

    /*Construtor Mentoria:*/
    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        super.titulo = titulo; //atribuindo o titulo à classe-mãe;
        super.descricao = descricao; //item para descrição
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria: " + "[titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", dataMentoria=" + dataMentoria + "]";
    }

    
    
}
