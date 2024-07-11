import java.util.ArrayList;

public class Instrutor extends Usuario{
    double salario;

    public Instrutor(String nome, String telefone, String cpf, String email, String senha, double salario) {
        super(nome, telefone, cpf, email, senha);
        this.salario = salario;
    }

    public void monitorarAlunos(ArrayList<Aluno> alunos){
    }

    public PlanoTreino criarPlano(){
        return new PlanoTreino();
    }
}
