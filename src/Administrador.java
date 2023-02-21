public class Administrador extends Funcionario implements Autenticable {

    @Override
    public double getBonificacion() {
        return 0;
    }

    @Override
    public void setContrasenia(String contrasenia) {

    }

    @Override
    public boolean iniciarSesion(String contrasenia) {
        return false;
    }
}
