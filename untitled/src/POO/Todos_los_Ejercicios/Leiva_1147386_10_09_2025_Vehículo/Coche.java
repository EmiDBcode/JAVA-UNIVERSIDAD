
public class Coche extends Vehiculo{

     public void desplaza(String tipo){
        if (tipo.equals("Automatico")){
            System.out.println("Desplazando en modo automatico\n");
        }
        else {
            System.out.println("Desplazando en modo Normal\n");
        }
    }
}