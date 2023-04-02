public class Test {

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        CuentaAhorro ca = new CuentaAhorro(123, 456);
        try {

            cc.depositar(500.0);
            cc.retirar(500);


            ca.depositar(500);
            ca.retirar(510);

        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }

    }
}