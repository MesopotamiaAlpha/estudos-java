//este arquivo ele vai ser o "modelo", ou schema para que o objeto seja criado


public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    //por convenção o método deve ser tudo em minusculo
    void deposita(double valor) {
        saldo = saldo + valor;
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

}