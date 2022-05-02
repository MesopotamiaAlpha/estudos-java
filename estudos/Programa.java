public class Programa{
    public static void main(String[] args){
        //o processo a baixo é chamado de casting, ele molda o tipo para entrar dentro do outro
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        System.out.println("Testando condicionais");

        int idade = 15;
        int quantidadePessoas = 15;


        //teste para estrutura de decisão usando if
        //operador ou ||
        //operador E &&
        if (idade >= 18 || quantidadePessoas >= 17){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

    }
}