public class PlanoTreino {
    Aluno aluno;
    Instrutor instrutor;
    int quantDiasSemanais;
    String exerciciosPeito;
    String exerciciosCostas;
    String exerciciosBraco;
    String exerciciosOmbro;
    String exerciciosPerna;
    String cardio;
    String abdominal;

    public PlanoTreino() {
    }

    public PlanoTreino(Aluno aluno, Instrutor instrutor, int quantDiasSemanais, String exerciciosPeito, String exerciciosCostas, String exerciciosBraco, String exerciciosOmbro, String exerciciosPerna, String cardio, String abdominal) {
        this.aluno = aluno;
        this.instrutor = instrutor;
        this.quantDiasSemanais = quantDiasSemanais;
        this.exerciciosPeito = exerciciosPeito;
        this.exerciciosCostas = exerciciosCostas;
        this.exerciciosBraco = exerciciosBraco;
        this.exerciciosOmbro = exerciciosOmbro;
        this.exerciciosPerna = exerciciosPerna;
        this.cardio = cardio;
        this.abdominal = abdominal;
    }
}
