public class TestaGeteSet {
    public static void main(String[] args) {
        Conta conta = new Conta(0, 0);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());


        Funcionario paulo = new Funcionario();
        conta.setTitular(paulo);
        

    }
}
