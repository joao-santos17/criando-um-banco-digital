import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                //Criando uma Instância de BANCO
                Banco banco = new Banco();
                banco.setNome("Meu Banco");

                //Criando uma lista de Clients
                List<Cliente> clientes = new ArrayList<>();
                clientes.add(new Cliente("João", "123.456.789-00"));
                clientes.add(new Cliente("Maria", "987.654.321-00"));

                //Definindo a Lista de Clientes no Banco
                banco.setClientes(clientes);

                //Acessando e Imprimindo a Lista de Clientes no Banco
                List<Cliente> clientesDoBanco = banco.getClientes();
                for (Cliente cliente : clientesDoBanco){
                        System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
                }

        }
}
