public class Aluno extends Usuario{
    double mensalidade;

    public Aluno(String nome, String telefone, String cpf, String email, String senha, double mensalidade) {
        super(nome, telefone, cpf, email, senha);
        this.mensalidade = mensalidade;
    }

    public void acessarReservasdeAulas(){}

    public void acompanharProgressoFisico(){}

    public Aula agendarAula(){
        return new Aula();
    }
}
