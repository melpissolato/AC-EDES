package ac13;


public class Main {
    public static void main(String[] args) {
      
        Cliente c1 = new Cliente("Maria", "123.456.789-00");
        Cliente c2 = new Cliente("João", "987.654.321-00");
        Cliente c3 = new Cliente("Ana", "456.789.123-00");

       
        Ingresso i1 = new Ingresso(101, "Show de Rock");
        Ingresso i2 = new Ingresso(102, "Show de Jazz");
        Ingresso i3 = new Ingresso(103, "Show de Pop");

       
        i1.registrarVenda(c1);
        i2.registrarVenda(c2);
        i3.registrarVenda(c3);

        i1.imprimirResumo();
        i2.imprimirResumo();
        i3.imprimirResumo();
    }
}
