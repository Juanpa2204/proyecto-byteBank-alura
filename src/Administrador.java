public class Administrador extends Funcionario implements Autenticable {

    private String clave;

    public Administrador() {
    }

    @Override
    public void setClave(String clave) {
        this.clave=clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.clave==clave;
        }

    @Override
    public double getBonificacion() {
        return this.salario;
    }
}
