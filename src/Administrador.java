public class Administrador extends Funcionario implements Autenticable {

    private String clave;
    private AutenticacionUtil autenticador;

    public Administrador(){
        this.autenticador = new AutenticacionUtil();
    }

    @Override
    public void setClave(int clave) {
        this.autenticador.setClave(clave);
    }

    @Override
    public boolean autenticar(int clave) {
        return this.autenticador.autenticar(clave);
        }

    @Override
    public double getBonificacion() {
        return this.salario;
    }
}
