package POO;

public class ContaBancaria {
    private double saldo;
    private String titular;
    private String numeroDaConta;

    public ContaBancaria(double saldoInicial, String titular, String numeroDaConta) {
        this.saldo = saldoInicial;
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Saque invalido");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }
}
