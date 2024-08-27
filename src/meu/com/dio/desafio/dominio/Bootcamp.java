package meu.com.dio.desafio.dominio;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    /*Atributos da Classe bootcamp */
    
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private String nomeBootcamp;
    private String descricao;
    /*  As Classes Dev, Mentoria e Curso precisarão ser implementadas; */    
    
    /* Um mesmo bootcamp pode ter MAIS DE UM ALUNO, MAIS UMA MENTORIA, MAIS DE UM CURSO, POR ISSO, PRECISAMOS
     * USAR COLEÇÕES (COLLECTIONS: LIST, SET), não faz sentido ter dois alunos iguais no mesmo bootcamp, 
     * por isso usa-se um set;
     */
    private Set<Dev> devs;
    /* Mentorias e Cursos são conteúdos, por isso, podemos criar um novo Set de contúdo e agrupar tudo lá dentro */
    private Set<Conteudo> conteudos;
    
    /*Construtor de um novo bootcamp */
    

    /* Criando um metodo Set, para alocar os conteudos desse bootcamp; */
    public Bootcamp(String nomeBootcamp, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.nomeBootcamp = nomeBootcamp;
        this.descricao = descricao;
        //Insancia um novo set de Conteudos - usando o LinkedHashSet para garanir a ordenação dos Conteudos:
        conteudos = new LinkedHashSet<Conteudo>();
        //Intancia de um novo set de Devs - usando o LinkedHashSet para garanir a ordenação dos Conteudos:
        devs = new LinkedHashSet<Dev>();
    }

    /*  Para adicionar um novo deve a um bootcamp, vou precisar usar um método, setar dev, que recebe um de
        dev como argumento.
    */
    public void setDev(Dev dev) {
        devs.add(dev);
    }
    /*
     *  E o mesmo para Conteudos (em dois metodos diferentes: polimorfismo de métodos):
     */

    public void setConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
    }

    public void setConteudo(Collection<Conteudo> conteudos){
        this.conteudos.addAll(conteudos);
    }

    public Set<Conteudo> getConteudos(){
        return conteudos;
    }



    /* Para evitar a criação de dois bootcamps iguais, segue abaixa o equals() e o hashCode():
     * não pode haver bootcamp com mesmo nome; (Código gerado automaticamente)
    */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeBootcamp == null) ? 0 : nomeBootcamp.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (nomeBootcamp == null) {
            if (other.nomeBootcamp != null)
                return false;
        } else if (!nomeBootcamp.equals(other.nomeBootcamp))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Bootcamp [dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", nomeBootcamp=" + nomeBootcamp
                + ", descricao=" + descricao + ", devs=" + devs + ", conteudos=" + conteudos + "]";
    }

    
    

}   
