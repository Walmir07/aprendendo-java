package secao17_poo;

public class POO2 {
    
    public static void main(String[] args) {
        
        // 1 - Modificadores de acesso (Níveis de acesso):

        Funcionario funcionario1 = new Funcionario("Matheus", 2000, "teste123");

        funcionario1.exibirDados();

        funcionario1.nome = "Teste";
        funcionario1.salario = 1500;
        // funcionario1.senha = "teste4321";

        funcionario1.exibirDados();

        funcionario1.aumentarSalario(10);

        // System.out.println(funcionario1.verificarSenha());

        if(funcionario1.autenticar("teste123")) {
            System.out.println("Usuário entrou no sistema");
        }

    }

}
