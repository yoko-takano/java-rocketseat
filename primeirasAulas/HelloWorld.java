package primeirasAulas;
/*
 * HelloWorld = Nome da minha classe
 * public = Tipo de acesso da classe, método, variáveis...
 * class = Tipo da classe
 */
public class HelloWorld {
    // Todo conteúdo deverá ser inserido aqui dentro
    public static void main(String[] args) {
        // static = indica que o método main pertence a essa classe, em vez de pertencer a uma instância específica
        // void = tipo de retorno (no caso, retorno vazio)
        // main = é o nome do método, precisa ser esse nome
        /*
         * Numeros (int, double, float, long)]
         * Texto (String)
         * Booleanos (boolean)
         */

        int dadoDoTipoInt = 28;
        double dadoDoTipoDouble = 72.6;
        float dadoDoTipoFloat = 72.6f;
        long dadoDoTipoLong = 382039424239434123L;
        String dadoDoTipoString = "Colocar meu texto";
        boolean dadoDoTipoBoolean = true;
        
        // if - else
        if (dadoDoTipoInt == 10) {
            System.out.println("Entrou no if.");
        } else if (dadoDoTipoInt == 28) {
            System.out.println("Entrou no else if.");
        } else {
            System.out.println("Entrou no else.");
        }

        // while
        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que três.");
            valorInicial++;
            System.out.println(valorInicial);
        }

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }


    }
}

// Fora do escopo da classe
