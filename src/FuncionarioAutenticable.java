public class FuncionarioAutenticable {

    private String contrasenia;

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean iniciarSesion(String contrasenia){
        return contrasenia == "AluraCursosOnLine";
    }
}
