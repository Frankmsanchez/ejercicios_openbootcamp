
public class Main {
    public static void main(String[] args) {
    coche MiCoche = new coche();
    MiCoche.Agregarpuerta();
 System.out.println(MiCoche.puertas);
    }

}
class coche { 
    public int puertas = 4;
public void Agregarpuerta(){
    this.puertas++;
   }
}