package AuladePoo;

class Forma{
    void desenhar(){
        System.out.println("desenhando uma forma generica.");
    }
}

class Circulo extends Forma{
    @Override
    void desenhar(){
        System.out.println("Desenhando um circulo");
    }
}


public class Heranca {
    public static void main(String[] args) {

        Forma forma = new Forma();
        forma.desenhar();

        Circulo circulo = new Circulo();
        circulo.desenhar();

        Forma formaCirculo = new Circulo();
        formaCirculo.desenhar();
    }
}
