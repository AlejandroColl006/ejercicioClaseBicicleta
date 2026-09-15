import claseBicicleta.Bicicleta;

public class Main {
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta(10,2,5);
        Bicicleta tuBicicleta = new Bicicleta(15,3,4);

        miBicicleta.acelerar();
        tuBicicleta.frenar();
        miBicicleta.cambiarPlato(6);
        tuBicicleta.cambiarPiñon(7);

        System.out.println(miBicicleta);
        System.out.println(tuBicicleta);
    }


}
