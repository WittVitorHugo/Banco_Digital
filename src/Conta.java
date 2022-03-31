public abstract class Conta implements InterfaceConta{

    private int agencia;
    private int numeroConta;
    private double saldo = 0;
    private Cliente titular;

    public Conta(int agencia, int numeroConta, Cliente titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void saca(double valorDeSaque) {
        this.saldo = saldo - valorDeSaque;
    }

    public void deposita(double valorDeDeposito) {
        this.saldo = saldo + valorDeDeposito;
    }

    public void transfere(Conta contaDestino, double valorDeTransferencia) {
        this.saca(valorDeTransferencia);
        contaDestino.deposita(valorDeTransferencia);
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

}
