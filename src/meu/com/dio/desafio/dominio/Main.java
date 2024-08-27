package meu.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        //Instanciando um novo bootcamp:
    
        Bootcamp bootcampJava = new Bootcamp("Java e Spring API", 
        "Bootcamp de Java com Spring API patrocinado pela Claro",
        LocalDate.now(), //LocalDate.now() retorna a data de hoje
        LocalDate.now().plusDays(60)); //plusDays(60) adiciona 60 dias à data de hoje e retornando uma nova data;
        
        //Exibindo o bootcamp, após criado:
        System.out.println(bootcampJava);
        System.out.println("****");

        //Criando conteudos para o bootcamp:
        Conteudo cursoBasicoJava = new Curso("Java Basico", "Primeiros passos com java", 5);
        Conteudo sintaxeJava = new Curso("Sintaxe Básica em Java", "Aprendendo a escrever codigos em java", 10);
        Conteudo orientacaoAObjetosJava = new Curso("Java Orientado a Objetos", "O que é a orientação a objetos, seus principais pilares e aplicações.", 35);
        Conteudo mentoriaDesafioJavaOOP = new Mentoria("Desafio Java OOP", "Resolvendo exercícios de OOP em Java e Tirando Dúvidas", LocalDate.now());
        
        //Adicionando conteudos no bootcamp:
            //Criando uma collection com os conteudos acima:
            Set<Conteudo> conteudo = new LinkedHashSet<Conteudo>();
            conteudo.add(cursoBasicoJava);
            conteudo.add(sintaxeJava);
            conteudo.add(orientacaoAObjetosJava);
            conteudo.add(mentoriaDesafioJavaOOP);
                //Usando o método para adicionar os conteudos ao bootcamp de java:
                bootcampJava.setConteudo(conteudo);
        
        System.out.println(bootcampJava);
        System.out.println("****");

        //Criando os devs:
        Dev gustavo = new Dev("Gustavo");
        Dev jonn = new Dev("Jonn");
        Dev leo = new Dev("Leo");

        //Matriculando os Devs no bootcamp
        gustavo.inscreverBootcamp(bootcampJava);
        jonn.inscreverBootcamp(bootcampJava);
        leo.inscreverBootcamp(bootcampJava);
        
        System.out.println(bootcampJava);
        System.out.println("****");

        gustavo.progredir();

        System.out.println(gustavo);



    }
    
}
