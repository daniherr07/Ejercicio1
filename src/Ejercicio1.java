public class Ejercicio1 {
    public static void main(String[] args){
        System.out.println(sumar(1, 2, 3));

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();

        System.out.println(miCoche.puertas);
    }

    public static int sumar(int a, int b, int c){
        return a + b +c; 
    }
}

class Coche {
    public int puertas = 2;

    public void aumentarPuertas() {
        this.puertas++;
    }

}
