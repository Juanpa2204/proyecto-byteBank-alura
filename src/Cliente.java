 public class Cliente implements Autenticable{

    private String nombre;
    private String Dni;
    private String telefono;

    private AutenticacionUtil autenticador;

    public Cliente(){
        this.autenticador = new AutenticacionUtil();
    }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public String getDni() {
         return Dni;
     }

     public void setDni(String dni) {
         Dni = dni;
     }

     public String getTelefono() {
         return telefono;
     }

     public void setTelefono(String telefono) {
         this.telefono = telefono;
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
