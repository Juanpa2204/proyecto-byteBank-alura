public class ControlBonificacion {

    private double suma;

    public double registrar(Funcionario e){
        double boni=e.getBonificacion();
        this.suma=this.suma+boni;
        return this.suma;
    }

    public double getSuma(){
        return this.suma;
    }
}
