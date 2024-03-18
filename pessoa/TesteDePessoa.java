package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("333.222.111-00");
        professor.setNome("Yoko");
        professor.setIdade(28);
        professor.setSalario(50000);
        System.out.println(professor.imprimirDadosDaPessoa());
    }
}
