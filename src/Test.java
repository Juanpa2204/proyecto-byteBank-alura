public class Test {

    public static void main(String[] args) {
                CuentaCorriente cc = new CuentaCorriente(222, 333);
                cc.depositar(500.0);

                SeguroDeVida seguro = new SeguroDeVida();

                CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();

                calc.registra(cc);
                calc.registra(seguro);

                System.out.println(calc.getTotalImpuesto());
            }

        }