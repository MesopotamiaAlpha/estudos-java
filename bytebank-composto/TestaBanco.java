public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "111.111.111-11";
        paulo.profissao = "Desenvolvedor";

        Conta contaDoPaulo = new Conta();
        //contaDoPaulo.deposita = (100);

        //associa o cliente paulo a conta contaDoPaulo
        contaDoPaulo.titular = paulo;

        System.out.println(contaDoPaulo.titular.nome);

    }
}
