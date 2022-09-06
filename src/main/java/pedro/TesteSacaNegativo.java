package pedro;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta(32595, 25888);
        conta.deposita(100);
        conta.saca(101);  
        System.out.println(conta.getSaldo());

        //isso deve ser proibido: conta.saldo = conta.saldo -101;
        System.out.println(conta.getSaldo());


    }
}
