package pessoa;

public class Pessoa {
        // nome, idade, cpf
        // tipo, nomeDaVariavel

        private String nome;
        private int idade;
        private String cpf;

        public String getCpf() {
            return cpf;
        }
        public int getIdade() {
            return idade;
        }
        public String getNome() {
            return nome;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        String imprimirDadosDaPessoa() {
            return "Nome da pessoa é " + nome;
        }


}
