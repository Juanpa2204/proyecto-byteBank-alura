public class SistemaInterno {

    private String clave="AluraCursosOnLine";

    public boolean autentica(Autenticable gerente){
        boolean puedeIniciarSesion=gerente.iniciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("login exitoso");
            return true;
        }else{
            System.out.println("error en login");
            return false;
        }
    }
}
