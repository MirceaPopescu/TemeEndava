package endava.training.collections;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mipopescu on 7/18/2016.
 */
public class MorePengiunFun {
    public static void main(String[] args) {
        HashMap<String, Penguin> penguins = new HashMap<>();
        ArrayList<Penguin> penguinArray = new ArrayList<>();
        PenguinHatchery ph = new PenguinHatchery();

        for(int i = 0; i <= 100000; i++){
            Penguin p = ph.hatchPenguin();
            penguins.put(p.getName(), p);
            penguinArray.add(p);
        }

        Penguin p = penguinArray.get(3782);
        long start = System.currentTimeMillis();
        penguins.get(p.getName());
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
