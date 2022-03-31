public class TesteConta {


    public static void Extrato(Conta conta) {
        System.out.println("Dados da conta");
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("");
    }

    public static void Saca(Conta conta, double valor) {
        System.out.println("Sacando...");
        conta.saca(valor);
        System.out.println("Valor sacado: " + valor);
        System.out.println("");
    }

    public static void Transfere(Conta contaRemetente, Conta contaDestinatario, double valor) {
        System.out.println("Transferindo...");
        contaRemetente.transfere(contaDestinatario, valor);
        System.out.println("Valor de R$" + valor + ", tranferido para: " + contaDestinatario.getTitular().getNome());
        System.out.println("");
    }

    public static void Deposita(Conta conta, double valor) {
        System.out.println("Depositando...");
        conta.deposita(valor);
        System.out.println("Depositado valor de R$" + valor);
        System.out.println("");
    }

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Carlos", "111.111.111-11");
        Cliente cliente2 = new Cliente("Maria", "333.333.333-33");

        Conta cc1 = new ContaCorrente(111, 1111, cliente1);
        Conta cc2 = new ContaCorrente(222, 2222, cliente2);

        Extrato(cc1);

        Deposita(cc1, 1000.0);

        Extrato(cc1);
        Transfere(cc1, cc2, 300.0);
        Extrato(cc1);
        Extrato(cc2);
        Saca(cc2, 300);
        Extrato(cc2);

    }
}
