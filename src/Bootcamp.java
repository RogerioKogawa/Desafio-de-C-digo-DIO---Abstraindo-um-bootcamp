import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private final LocalDate dataFim;
    private Set<Conteudo> conteudosBootcamp = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = LocalDate.now();
        dataFim = dataInicio.plus(45, ChronoUnit.DAYS);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void adicionarDev(Dev dev){
        devsInscritos.add(dev);
    }

    public Set<Conteudo> getConteudosBootcamp() {
        return conteudosBootcamp;
    }

    public String addConteudosBootcamp(Conteudo conteudo) {
        return conteudosBootcamp.add(conteudo)? "Conteudo adicionado": "Conteudo inválido";
    }
}
