package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria1 = new ContaBancaria();

        contaBancaria1.setNumero("1234");
        contaBancaria1.setTitular("Renan");
        
        contaBancaria1.depositar(100);
        contaBancaria1.sacar(100);
        contaBancaria1.depositar(-10);
        contaBancaria1.sacar(200);


    }
}
