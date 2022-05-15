public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        //paulo.nome = "Paulo Silveira";
        paulo.setNome("Paulo Silveira");
        

        //paulo.cpf = "111.111.111-11";
        //paulo.profissao = "Desenvolvedor";

        Conta contaDoPaulo = new Conta(0, 0);
        //contaDoPaulo.deposita = (100);

        //associa o cliente paulo a conta contaDoPaulo
        contaDoPaulo.titular = paulo;

        //System.out.println(contaDoPaulo.titular.nome);

        //teste em pegar o saldo privado dentro do conta.java
        Conta conta = new Conta(0, 0);
        conta.deposita(100);
        System.out.println(conta.getSaldo());

        //setando a conta do paulo
        conta.setTitular(paulo);

    }
}
