package meu.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    /*  Atributos da classe Dev (do aluno) */
    private String nomeDev;
    /*  Um ano pode se inscrever em diversos (utilização de uma lista) cursos e mentorias (conteúdos), mas eles
     *  precisam ser diferentes, ou seja, não podem se inscrever duas vezes no mesmo conteúdo;
     */
    private Set<Conteudo> conteudosInicializados = new LinkedHashSet<Conteudo>();
    private Set<Conteudo> conteudosFinalizados = new LinkedHashSet<Conteudo>(); 

    /*
     * Pontos de experiência do Dev:
     */
    private double pontosExperiência = 0;

    /* Construtor para o Dev */
    public Dev(String nomeDev) {
        this.nomeDev = nomeDev;
    }


    /*  O aluno precisa se inscrever no bootcamp, ou seja, preciso passar um objeto bootcamp para o dev*/
    public void inscreverBootcamp (Bootcamp bootcamp) {
        /* Daqui de detro, será possível manipular os atributos de bootcamp */
        /*
         * Para adicionar este Dev ao bootcamp usa-se this, adicionando o objeto diremanete ao bootcamp.
         */
        bootcamp.setDev(this);
        /*
        * Ao adicionar um dev à um bootcamp, este deve precisa "adquirir todos os conteúdos do bootcamp,
        * ou seja, adicionar os elementos de conteudo do bootcamp aos conteudos inicializados do aluno:
        */
        conteudosInicializados.addAll(bootcamp.getConteudos());

    }

    /*Após o set de contudos inicializados estar devidamente abstacido, o método progredir irá
     * remover o primeiro elemento do set (linkedhashset) e irá passá-lo para o set de conteúdos finalizados
     */
    public void progredir(){
        /* Usando a Stream API para navegar pelo Collection (depois de passar o método stream na collection, 
            esta deixa de ser uma collection e passa a ser uma stream, possibilidando a utilização de outros
            métodos que ajudam a navegar e executar opações nos elementos da coleção;
        */
        //Pega o primeiro elemento da stream de contudos e atribui a variável conteudoDummy:
        Conteudo conteudoDummy = conteudosInicializados.stream().findFirst().get();
        //Adiciona o conteudoDummy ao set de conteudosFinalizados:
        conteudosFinalizados.add(conteudoDummy);
        //Remove o contudoDummy de conteudosInicializados:
        conteudosInicializados.remove(conteudoDummy);
        //Adiciona o ponto de experiência para o aluno dev;
        pontosExperiência+=conteudoDummy.calcularXP();
    }

    public void exibirConteudos() {
        System.out.println("Conteúdos: " + conteudosInicializados);
        System.out.println("Conteúdos Finalizados: " + conteudosFinalizados);
    }

    public void exibirPontosExperiência(){
        System.out.println(pontosExperiência);
    }


    @Override
    public String toString() {
        return "Dev [nomeDev=" + nomeDev + ", conteudosInicializados=" + conteudosInicializados
                + ", conteudosFinalizados=" + conteudosFinalizados + ", pontosExperiência=" + pontosExperiência + "]";
    }

    

    
}
