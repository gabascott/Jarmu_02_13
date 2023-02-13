
package modell;

public abstract class Jarmu {

    private boolean beinditva, uzemanyag, megerkezett;

    public Jarmu() {
        setBeinditva(false);
        setUzemanyag(true);
        setMegerkezett(false);
    }

    public void setBeinditva(boolean beinditva) {
        this.beinditva = beinditva;
    }

    public void setUzemanyag(boolean uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    public void setMegerkezett(boolean megerkezett) {
        this.megerkezett = megerkezett;
    }
    
    public void beindit(){
        setBeinditva(true);
    };
    
    public void leallit(){
        setBeinditva(false);
    };
    
    public boolean tankol(){
        if (beinditva == false) {
            return true;
        }else{
            return false;
        }
    };
    
    public boolean halad(){
        if (uzemanyag == true) {
            setUzemanyag(false);
            setMegerkezett(true);
            return true;
        }else{
            return false;
        }
    };;
}
