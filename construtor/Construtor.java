package construtor;

public class Construtor {

    private int numero;
    
    // Podem ser criados diversos construtores
    // Se não tiver criado nenhum construtor, o JAVA irá utilizar
    // um construtor padrão
    public Construtor(int numero) {
        this.numero = numero;
        System.out.println("Construtor com 1 parâmetro criado!");
    }

    // Pode ser tanto publico quanto privado
    // Onde privado poderia ser usado somente dentro do escopo da classe

    public Construtor(int numero, String texto) {
        // Construtor não tem retorno, será sempre void
        // Tem que ter o nome da classe
        // Pode ser vazio, ou pode ter parâmetros
        this.numero = numero;
        System.out.println("Construtor com 2 parâmetros criado!");
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

}
