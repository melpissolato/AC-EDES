package ac7;


public class Cilindro {
     public double raio;
     public double altura;
     public double volume;
     public double area;
     

   
    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getArea() {
        return 2 * Math.PI * raio * (raio + altura);
    }

    public double getVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}
