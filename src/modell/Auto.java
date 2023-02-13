package modell;

import java.util.Random;

public class Auto extends Jarmu{
    private boolean defekt;

    public Auto(){
        defekt = false;
    };

    public void setDefekt(boolean defekt) {
        this.defekt = defekt;
    }
    
    public void kereketCserel(){
        if (defekt == true) {
            setDefekt(false);
        }
    };

    @Override
    public boolean halad() {
        Random rnd = new Random();
        int esely = rnd.nextInt(4);
        if (esely == 1) {
            setDefekt(true);
            return false;
        }else{
            return true;
        }
    }
    
}
