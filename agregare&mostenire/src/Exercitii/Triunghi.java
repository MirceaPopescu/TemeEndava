package Exercitii;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Triunghi extends Forma{
    float baza;
    float inaltime;

    Triunghi(){
        super();
        this.baza = 1;
        this.inaltime = 1;
    }

    Triunghi(String color){
        super(color);
        this.baza = 1;
        this.inaltime = 1;
    }

    Triunghi(String color, float baza, float inaltime){
        super(color);
        this.baza = baza;
        this.inaltime = inaltime;
    }

    public String toString(){
        return "Triunghi " + super.toString() + " " + getArie();
    }

    @Override
    float getArie() {
        return baza * inaltime / 2;
    }

    public boolean equals(Object obj){
        if( obj instanceof Triunghi ){
            Triunghi triunghiCasted = (Triunghi) obj;
            return (this.baza == triunghiCasted.baza) && (this.inaltime == triunghiCasted.inaltime);
        }

        return false;
    }

    String printDimensiuniTriunghi(){
        return this.baza + " baza " + this.inaltime + " inaltime";
    }
}
