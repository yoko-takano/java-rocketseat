package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Yoko");
        nomes.add("Renan");
        nomes.add("Tatsuya");
        System.out.println(nomes.get(0));

        for( String nome : nomes ) {
            System.out.println("Nome: " + nome);
        }

        nomes.forEach(nome -> System.out.println("Nome: " + nome));
        nomes.forEach(System.out::println);

    }
}
