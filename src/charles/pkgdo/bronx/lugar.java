
package charles.pkgdo.bronx
 
public class ProjetoUFC {
    public static void main(String[] args) {
        Luta fight = new Luta();
        Lutador lutador1 = new Lutador("Poatan", "Brasil", 32, 1.80, 101, 0, 0, 0);
        Lutador lutador2 = new Lutador("Ankalaev", "Russia", 31, 1.78, 99, 0, 0, 0);
 
        lutador1.apresentar();
        lutador2.apresentar();
        fight.marcaLuta(lutador1, lutador2);
        fight.lutar(lutador1, lutador2);
        lutador1.status();
        lutador2.status();
    }
}