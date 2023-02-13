package teszt;

import modell.Auto;

public class JarmuTeszt {
    
    public static void main(String[] args) {
        new JarmuTeszt();
    }

    public JarmuTeszt() {
//        mintaSablonTeszt();
//        haladAutoBeinditasNelkulTeszt();
//        haladAutoBeinditassalTeszt();
//        autoKereketCserel();
        tankolBeinditassal();
    }

    private void mintaSablonTeszt() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "nem egyenlőek";
    }

    private void haladAutoBeinditasNelkulTeszt() {
        Auto a1 = new Auto();
        boolean kapott = a1.halad();
        boolean vart = false;
        assert kapott == vart : "Beindítás nélkül is haladt";
    }

    private void haladAutoBeinditassalTeszt() {
        Auto a1 = new Auto();
        boolean kapott = a1.halad();
        boolean vart = true;
        assert kapott == vart : "Autó nem halad";
    }

    private void autoKereketCserel() {
        Auto a1 = new Auto();
        boolean kapott = a1.kereketCserel();
        boolean vart = true;
        assert kapott == vart : "Nem cserélt kereket";
    }

    private void tankolBeinditassal() {
        Auto a1 = new Auto();
        boolean kapott = a1.tankol();
        boolean vart = true;
        assert kapott == vart : "Autó tankolt miközben be volt indítva";
    }
    
}
