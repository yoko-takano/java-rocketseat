package veiculo;

public class TesteVeiculo {
    public static void main(String[] args) {
        // Não pode instanciar um objeto que é uma interface
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();

    }
}
