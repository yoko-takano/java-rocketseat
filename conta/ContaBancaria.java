package conta;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;

    // método constructor
    public ContaBancaria() {
        this.saldo = 0;
    } 


    // métodos getters
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }

    // métodos setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // depositar
    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito: R$ " + valor);
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }


    // sacar
    void sacar (double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque: R$ " + valor);
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

}
