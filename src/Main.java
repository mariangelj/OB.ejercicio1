public class Main {
    public static void main(String[] args) {

        int resultadoSuma = Suma(1,2,3);
        System.out.println(resultadoSuma);

        Coche miCoche = new Coche();
        miCoche.SumaPuerta();
        System.out.println(miCoche.puerta);
    }

    public static int Suma(int a, int b, int c) {return a + b + c;}
}

class Coche {

    public int puerta = 0;

    public void SumaPuerta() {this.puerta++;}
}