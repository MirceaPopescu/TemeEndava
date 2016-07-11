package Exercitii;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Forma {
    String culoare;

    Forma(){
        this.culoare = "no color";
    }

    Forma(String culoare){
        this.culoare = culoare;
    }
    float getArie(){
        return 0;
    }

    public String toString(){
        return culoare;
    }
}
