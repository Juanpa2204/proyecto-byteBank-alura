public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total = 0;

    public Cuenta(){
    }

    public Cuenta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo=saldo;
        total++;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia >0){
            this.agencia = agencia;
        } else {
            System.out.println("no esta permitidos los valores negativos");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    public abstract void depositar(double valor);
    public boolean retirar(double valor){
        if (this.saldo >=valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean trasferir(double valor, Cuenta destino){
        if (this.saldo >= valor){
            this.retirar(valor);
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
