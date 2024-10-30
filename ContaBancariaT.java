package POO;

public class ContaBancariaT {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(0.0, "Mario", "12345");

        System.out.println("Titular: " + cb.getTitular());
        System.out.println("Número da Conta: " + cb.getNumeroDaConta());
        System.out.println("Saldo inicial: R$" + cb.consultarSaldo());

        cb.depositar(300.0);
        System.out.println("Saldo após depósito: R$" + cb.consultarSaldo());

        cb.sacar(200.0);
        System.out.println("Saldo após saque: R$" + cb.consultarSaldo());

        cb.sacar(900.0);
        System.out.println("Saldo final: R$" + cb.consultarSaldo());
    }
}
