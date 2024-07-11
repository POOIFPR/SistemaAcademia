public class Aula {
    int horas;
    int minutos;
    int segundos;
    String dataAula;
    Aluno aluno;
    Instrutor instrutor;

    public Aula() {
    }

    public Aula(int horas, int minutos, int segundos, String dataAula, Aluno aluno, Instrutor instrutor) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.dataAula = dataAula;
        this.aluno = aluno;
        this.instrutor = instrutor;
    }
}
