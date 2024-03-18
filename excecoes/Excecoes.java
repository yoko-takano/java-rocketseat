package excecoes;

import pessoa.Pessoa;

public class Excecoes {
    // Checked exceptions
    // Unchecked exception
    // Try Catch

    public static void main(String[] args) throws Exception {
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
        Pessoa p = null;
        p.getCpf();


    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O número é menor que 100.");
        }
    }
}
