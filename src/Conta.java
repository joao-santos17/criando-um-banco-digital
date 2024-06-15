public abstract class Conta implements IConta{

        protected static final int AGENCIA_PADRAO = 0; 

        private static int SEQUENCIAL = 1;

    protected int agenca;
    protected int numero;
    protected double saldo;
    private Cliente cliente;
    public Object agencia;


    
    public Conta(Cliente cliente) {
        this.agenca = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

        public void sacar(double valor) {
            saldo -= valor;

        }
        public void depositar(double valor) {
            saldo += valor;

        }
        public void transferir(double valor, Conta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);

        }

        public int getAgenca() {
            return agenca;
        }
        public int getNumero() {
            return numero;
        }
        public double getSaldo() {
            return saldo;
        }

        protected void imprimirInfosComuns() {
            System.out.println(String.format("Titular: %s", this.cliente.getNome()));
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));
        }

        public abstract void imprimirExtrato();
        

}


