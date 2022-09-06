package pedro;

public class TestaGeteSet {
    public static void main(String[] args) {
        Conta conta = new Conta(1557, 13337);
        conta.setNumero(13337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = wesley;
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        System.out.println(conta.getTitular().getProfissao());
    }
}
