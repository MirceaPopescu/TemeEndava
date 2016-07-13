package game;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Observer that prints the game's world (the map with all the treasures,
 * heroes, obstacles)
 */
class MapPrinter implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof GameState) {
            updateGameState(o);
        }
    }


    private void updateGameState(Observable o) {
        GameState gs = (GameState) o;
        ArrayList<Hero> heroes = gs.getHeroes();
        int map[][] = gs.getMap().clone();

        for(Hero h : heroes){
            int posx = h.getPosx();
            int posy = h.getPosy();

            map[posy][posx] = -1;
        }

        for(int i = 0; i < gs.MAP_SIZE; i++){
            String toPrint = new String();

            for(int j = 0; j < gs.MAP_SIZE; j++){
                if( map[i][j] == 2){
                    toPrint += "T ";
                    continue;
                }

                if( map[i][j] == -1){
                    toPrint += "H ";
                    continue;
                }

                toPrint += map[i][j] + " ";
            }

            System.out.println(toPrint);
        }

    }
    // TODO obtain the GameState's map, treasures and heroes
    // print the map
    // e.g.
    // 0  1  1  1  0
    // H  T  0  1  0
    // 0  0  T  0  0
    // 0  0  0  T  T
    // 0  T  0  0  0
    // T - treasure, H - hero, 1 - obstacle
}