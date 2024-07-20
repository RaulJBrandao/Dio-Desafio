import models.*;

public class Main {
    public static void main(String[] args) {
        Conteudo mentoria = new Mentoria("Mentoria Java", "Descrição da mentoria");
        Conteudo curso = new Curso("Curso Java", "Descrição do curso", 80);
        Conteudo curso2 = new Curso("Curso Spring Boot", "Descrição de Spring Boot", 120);
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Descrição do bootcamp");
        bootcamp.getConteudo().add(mentoria);
        bootcamp.getConteudo().add(curso);
        bootcamp.getConteudo().add(curso2);

        mentoria.exibirConteudo();
        curso.exibirConteudo();
        curso2.exibirConteudo();
        System.out.println(bootcamp);

        Dev raul = new Dev("Raul Brandao", "12345678925");
        raul.inscreverBootcamp(bootcamp);
        System.out.println(raul);
        raul.exibirCursos();
        raul.progredir();
        raul.progredir();
        System.out.println(raul);
        System.out.println("Total XP: " + raul.totalXp());
        raul.exibirCursos();
    }
}