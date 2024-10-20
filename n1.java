package provadepoo;

class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void getNome() {
        System.out.println("Nome: " + nome);
    }

    void getIdade() {
        System.out.println("Idade: " + idade);
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
    public void exibirInfo(){
        getNome();
        getIdade();
    }
}

class Aluno extends Pessoa{
    String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    void getMatricula() {
        System.out.println("Matricula: " + matricula);
    }
    void setMatricula(String matricula) {
        this.matricula = matricula;
    }

@Override
    public void exibirInfo(){
         getNome();
        getIdade();
       getMatricula();
    }

}

class Professor extends Pessoa{
    double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }
    void getSalario() {
        System.out.println("Salario: " + salario);
    }
    void setSalario(double salario) {
        this.salario = salario;
    }
@Override
public void exibirInfo(){
          getNome();
          getIdade();
        getSalario();
    }
}

public class N1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("vitoria", 30);
        p1.exibirInfo();
        Aluno a2 = new Aluno("ana", 19, "23100484");
        a2.exibirInfo();
        Professor p3 = new Professor("jofanio", 47, 4.000);
        p3.exibirInfo();

    }
}
