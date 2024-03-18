package primeirasAulas;
import java.util.HashSet;

public class ExHashSet {
    public static void main(String[] args) {

        // Não tem como pegar o valor pela posição
        // A ordenação não importa para o HashSet
        // Apenas aceita dados únicos, sem duplicatas
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);

        System.out.println(numeros.size());
        numeros.remove(11);

        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        System.out.println(numeros.contains(11));
    }
}
