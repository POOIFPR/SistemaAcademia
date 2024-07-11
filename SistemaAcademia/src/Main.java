public class Main {
    public static void main(String[] args){
        Admin admin = new Admin("Lucas",
                "(44) 2218-5754",
                "99084861957",
                "lucas@hotmail.com",
                "lukinhas1234");

        Aluno aluno = new Aluno("Ronaldo",
                "(44) 3629-4292",
                "76499368997",
                "fenomeno@gmail.com",
        "ehgalvao",
                115.00);

        Instrutor instrutor = new Instrutor("Otavio",
                "(42) 2598-2733",
                "64265138900",
                "taviin@gmail.com",
        "deltafoxtrot",
                3500.00);

        Aula aula = new Aula(14,
                30,
                00,
                "12/07/2024",
                aluno,
                instrutor);

        PlanoTreino planoTreino = new PlanoTreino(aluno,
                instrutor,
                4,
                "Supino e paralela",
                "Puxador pegada aberta e remada baixa",
                "Rosca unilateral com halter e triceps polia",
                "Desenvolvimento com halter e elevação lateral",
                "Cadeira Extensora e Flexora",
                "Bike 5 min",
                "Abdominal supra e infra");
    }
}