public class Gerente extends Funcionario implements Autenticable{

    @Override
    public double getBonificacion() {
        return 2000;
    }

    @Override
    public void setContrasenia(String contrasenia) {

    }

    @Override
    public boolean iniciarSesion(String contrasenia) {
        return false;
    }
}
