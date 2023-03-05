public class AutenticacionUtil {

    private int clave;

    public void setClave(int clave){
        this.clave=123;
    }

    public boolean autenticar(int clave){
        if (this.clave==clave){
            return true;
        } else {
            return false;
        }
    }

}
