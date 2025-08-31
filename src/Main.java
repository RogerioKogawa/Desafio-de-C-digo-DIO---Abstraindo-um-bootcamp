import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Testando as funcionalidades, código gerado por IA.
        // Criando um bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp de Java");

        // Criando conteúdos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java POO");
        curso1.setDescricao("Descrição do curso de Programação Orientada a Objetos em Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Boas Práticas em Java");
        mentoria1.setDescricao("Descrição da mentoria sobre boas práticas de código");
        mentoria1.setData(LocalDate.now());

        // Adicionando conteúdos ao bootcamp
        bootcamp.addConteudosBootcamp(curso1);
        bootcamp.addConteudosBootcamp(mentoria1);

        // Criando um dev
        Dev dev1 = new Dev();
        dev1.setNome("Rogério");

        System.out.println("Dev " + dev1.getNome() + " inscrito no bootcamp: " + bootcamp.getNome());
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + " ANTES da inscrição: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + " ANTES da inscrição: " + dev1.getConteudosConcluidos());
        System.out.println("--------------------");

        // Inscrevendo o dev no bootcamp
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos de " + dev1.getNome() + " APÓS a inscrição: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + " APÓS a inscrição: " + dev1.getConteudosConcluidos());
        System.out.println("XP Total: " + dev1.calcularTotalXP());
        System.out.println("--------------------");

        // Progredindo no bootcamp (concluindo o primeiro conteúdo)
        System.out.println("Progredindo no bootcamp...");
        dev1.progredir();

        System.out.println("Conteúdos inscritos de " + dev1.getNome() + " APÓS progredir: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + " APÓS progredir: " + dev1.getConteudosConcluidos());
        System.out.println("XP Total: " + dev1.calcularTotalXP());
        System.out.println("--------------------");

        // Progredindo novamente (concluindo o segundo conteúdo)
        System.out.println("Progredindo novamente no bootcamp...");
        dev1.progredir();

        System.out.println("Conteúdos inscritos de " + dev1.getNome() + " APÓS progredir novamente: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + " APÓS progredir novamente: " + dev1.getConteudosConcluidos());
        System.out.println("XP Total: " + dev1.calcularTotalXP());
        System.out.println("--------------------");
    }
}