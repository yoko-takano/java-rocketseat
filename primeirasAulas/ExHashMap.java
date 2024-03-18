package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
    public static void main(String[] args) {
        // Trabalha com chave x valor
        // Map trabalha com chave única
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Renan", 8);
        notas.put("Yoko", 9); 
        notas.put("Tatsuya", 10);

        var nota = notas.get("Yoko");
        System.out.println(nota);

        for ( Map.Entry<String, Integer> entry : notas.entrySet() ) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
