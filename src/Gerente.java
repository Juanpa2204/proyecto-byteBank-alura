public class Gerente extends Funcionario implements Autenticable{

    private AutenticacionUtil autenticador;
    public Gerente(){
        this.autenticador=new AutenticacionUtil();
    }

    @Override
    public double getBonificacion() {
        return 2000;
    }

    @Override
    public void setClave(int clave) {
        this.autenticador.setClave(clave);
    }

    @Override
    public boolean autenticar(int clave) {
        return this.autenticador.autenticar(clave);
    }
}
