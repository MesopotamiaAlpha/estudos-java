public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1234, 5678);
        System.out.println(conta.getAgencia());

        conta.setAgencia();

        Conta conta2 = new Conta(1234, 5678);
        Conta conta3 = new Conta(1234, 5678);
        
    }
    
}
