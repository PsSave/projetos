package pedro;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1557, 13337);
        System.out.println(conta.getAgencia());
        conta.setAgencia(32265);

        Conta conta2 = new Conta(38945, 88845);
        Conta conta3 = new Conta(68445, 33222);

        System.out.println(Conta.getTotal());

    }
}
