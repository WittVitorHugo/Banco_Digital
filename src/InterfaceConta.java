public interface InterfaceConta {

    void saca(double valorDeSaque);

    void deposita(double valorDeDeposito);

    void transfere(Conta contaDestino, double valorDeTransferencia);
}
