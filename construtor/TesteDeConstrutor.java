package construtor;

public class TesteDeConstrutor {
    
    public static void main(String[] args) {
        // Importante seguir a sequência dos inputs do construtor
        // Quando se cria mais de um construtor, ele permite escolher
        // qual dos dois será escolhido.
        Construtor construtor1 = new Construtor(1, "Texto");
        Construtor construtor2 = new Construtor(3);

        // Se não tiver criado nenhum construtor, o JAVA irá utilizar
        // um construtor padrão
        // Construtor construtor = new Construtor();

    }
}
