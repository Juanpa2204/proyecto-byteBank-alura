 public class Cliente implements Autenticable{

    private String nombre;
    private String Dni;
    private String telefono;
    private String clave;

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

     public String getClave() {
         return clave;
     }

     public void setClave(String clave) {
         this.clave = clave;
     }

     @Override
     public boolean iniciarSesion(String clave) {
         return this.clave == clave;
     }
 }
