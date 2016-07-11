package Exercitii;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Cerc extends Forma {
    float raza;

    Cerc(){
        super();
        this.raza = 1;
    }

    Cerc(String culoare){
        super(culoare);
        this.raza = 1;
    }

    Cerc(float raza){
        super();
        this.raza = raza;
    }

    Cerc(String culoare, float raza){
        super(culoare);
        this.raza = raza;
    }

    public  String toString(){
        return "Cerc " + super.toString() + " " + getArie();
    }
    @Override
    float getArie() {
        return (float) (Math.PI * raza * raza);
    }

    String printDimensiuniCerc(){
        return this.raza + " raza";
    }
}
