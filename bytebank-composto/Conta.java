//este arquivo ele vai ser o "modelo", ou schema para que o objeto seja criado


public class Conta {
    //no atributo privado o saldo nao pode ser lido e nem modificado em nenhum lugar, mais para baixo criamos um metodo para retornar o saldo em outro lugar.
    private double saldo;
    private int agencia;
    private int numero;

    //este atributo static ele separa o total de todos os objetos fazendo que ele fique somente pertencendo a classe.
    private static int total;

    //aqui é feito uma associação entre o objeto conta e o objeto cliente
    Cliente titular;

    //por convenção o método deve ser tudo em minusculo
    void deposita(double valor) {
        saldo = saldo + valor;
    }


    public Conta (int agencia, int numero) {
        //aqui ele esta acessando o total da classe separado do objeto
        total++;
        System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta " + this.agencia + " " + this.numero);
    }

    //este método ele vai fazer o saque e retornar booleano com a mensagem de positivo ou negativo
    public boolean saca(double valor) {

        //o this mostra que você quer se referir ao próprio objeto

        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }else {
            return false;
        }

    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;   
    }else {
        return false;
    }
    }

    //como o saldo esta privado, precisamos criar um metodo para retornar o saldo para outro lugar, somente assim pode jogar estes dados para outo  lugar
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }


    public void setTitular (Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int setAgencia() {
        return this.agencia;
    }

}