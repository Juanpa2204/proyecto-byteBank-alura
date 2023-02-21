 public class Cliente implements Autenticable{

    private String nombre;
    private String Dni;
    private String profesion;


    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

     @Override
     public void setContrasenia(String contrasenia) {
     }

     @Override
     public boolean iniciarSesion(String contrasenia) {
         return false;
     }
 }
