public class TesteFuncionario {
    
public static void main(String[] args){
    Funcionario nico = new Funcionario();
    nico.setNome("Nico Steppat");
    nico.setCpf("123.456.789-10");
    nico.setProfissao("Desenvolvedor");
    nico.setSalario(2600.00);


    System.out.println(nico.getBonificacao());
    System.out.println(nico.getNome());
}

}
