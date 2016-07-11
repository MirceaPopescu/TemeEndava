package Exercitii;

import java.util.ArrayList;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Main {
    public static void main(String[] args) {

        /* Testing Forme */
        ArrayList<Forma> vectorForme = new ArrayList<Forma>();
        vectorForme.add(new Triunghi("verde"));
        vectorForme.add(new Cerc("negru", 25));
        vectorForme.add(new Triunghi("alb", 15, 20));
        vectorForme.add(new Triunghi());
        vectorForme.add(new Cerc(100));

        for( Forma f : vectorForme){
         //   System.out.println(f);
            if( f instanceof Triunghi){
                System.out.println(((Triunghi) f).printDimensiuniTriunghi() );
            }

            if( f instanceof Cerc){
                System.out.println( ((Cerc) f).printDimensiuniCerc() );
            }
        }


        System.out.println("=========================================");
        /* Testing cozi decomentezi linia pentru care vrei sa verifici */
        //CoadaMostenire cm = new CoadaMostenire();
        CoadaAgregare cm = new CoadaAgregare();

        cm.push(5);
        cm.push(7);
        System.out.println( cm.pop() );
        System.out.println( cm.pop() );
    }
}
