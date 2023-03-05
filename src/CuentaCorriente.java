public class CuentaCorriente extends Cuenta implements Tributacion {

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public boolean retirar(double valor) {
        double comision=0.2;
        return super.retirar(valor + comision);
    }

    @Override
    public double getvalorImpuesto() {
        return super.saldo*0.01;
    }
}
