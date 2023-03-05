public class SistemaInterno {

    private int clave=123;

    public boolean autenticar(Autenticable gerente){
        boolean puedeIniciarSesion=gerente.autenticar(clave);
        if (puedeIniciarSesion){
            System.out.println("login exitoso");
            return true;
        }else{
            System.out.println("error en login");
            return false;
        }
    }
}
