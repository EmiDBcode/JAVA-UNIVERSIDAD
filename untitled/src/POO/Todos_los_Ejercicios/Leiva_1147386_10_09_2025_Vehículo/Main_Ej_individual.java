public class Main_Ej_individual {
    public static void main(String[] args) {

        Vehiculo v = new Vehiculo();
        Coche c = new Coche();
        Bicicleta b = new Bicicleta();

        v.desplaza();
        c.desplaza("Automatico");
        b.desplaza();


    }

}
