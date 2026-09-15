package claseBicicleta;

public class Bicicleta {


        //Atributos de tipo entero
    int velocidadActual;
    int platoActual;
    int piñonActual;

        //Constructor
    public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.piñonActual = piñonActual;
    }
        //Métodos
    public void acelerar() {
        this.velocidadActual *= 2;
    }
    public void frenar(){
        this.velocidadActual /= 2;
    }
    public void cambiarPlato(int plato) {
        this.platoActual = plato;
    }
    public void cambiarPiñon(int piñon) {
        this.piñonActual = piñon;
    }

    //Getters (útiles para poder consultar el estado sin exponer los atributos)
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public int getPlatoActual() {
        return platoActual;
    }
    public int getPiñonActual(){
        return piñonActual;
    }
    //Como queremos que se vea cuando se imprima por pantalla
    @Override
    public String toString() {
        return "Bicicleta (velocidadActual=" + velocidadActual +
                ", platoActual= " + platoActual +
                ", piñón actual= " + piñonActual + ")";
    }

}
