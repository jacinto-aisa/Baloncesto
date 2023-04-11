// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class JugadorDeBaloncesto
{
    String nombre;
    private int altura;
    private int puntos;

    public JugadorDeBaloncesto(String nombre, int altura, int puntos) {
        this.nombre = nombre;
        setAltura(altura);
        setPuntos(puntos);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura > 150 && altura < 250)
            this.altura = altura;
        else
            this.altura = 150;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        if (puntos < 0)
            this.puntos = 0;
        else
            this.puntos = puntos;
    }
}

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        JugadorDeBaloncesto Manolo = new JugadorDeBaloncesto("Manolo",160,234);
        JugadorDeBaloncesto Ana = new JugadorDeBaloncesto("Ana",197,458);
        JugadorDeBaloncesto Paco = new JugadorDeBaloncesto("Paco",-78,-500);

        System.out.println("Suma de puntos: "+(Manolo.getPuntos()+Ana.getPuntos()+Paco.getPuntos()));
        System.out.println("Suma de altura: "+(Manolo.getAltura()+Ana.getAltura()+Paco.getAltura()));
    }
}
