public class TesteSacaNegativo {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta(0, 0);
        conta.deposita(100);
        conta.saca(200);

        //Neste comando a baixo ele nao pode acessar um atributo privado, assim ele da erro
        //System.out.println(conta.saldo);
        System.out.println(conta.saca(101));

    }
}
