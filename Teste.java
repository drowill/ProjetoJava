import java.util.*;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Discos> d = new ArrayList<Discos>();
        CDs cd = new CDs();
        
        cd.setNome("All Souls");
        cd.setArtista("Siouxsie");
        d.add(cd);

        Vendedor v = new Vendedor();
        v.login("Pedro", "12345");

    }
}