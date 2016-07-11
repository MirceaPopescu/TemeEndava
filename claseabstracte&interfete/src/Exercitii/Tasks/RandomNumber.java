package Exercitii.Tasks;

import java.util.Random;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class RandomNumber implements  Task{
    Random rand;

    public RandomNumber(){
        rand = new Random();
    }

    @Override
    public void execute() {
        System.out.println("numarul extras este " + rand.nextInt() );
    }
}
