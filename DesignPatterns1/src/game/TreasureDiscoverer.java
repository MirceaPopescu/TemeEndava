package game;


import java.util.Observable;

/**
 * Observer that prints the lore of a treasure when a hero discovers it. 
 *
 */
class TreasureDiscoverer implements java.util.Observer{
    @Override
    public void update(Observable o, Object arg) {
        GameState gs = (GameState) o;
        int map[][] = gs.getMap();
        for( Hero h : gs.getHeroes() ){
            if( map[h.getPosx()][h.getPosy()] == 2){
                map[h.getPosx()][h.getPosy()] = 0;
                //TODO: parcurg lista de comori, gasesc comoara in coordonatele alea, o sterg din lista, si o dau eroului
            }
        }
    }
    // TODO
		// check if any hero is in an area containing a treasure
		// print some message
		// remove treasure from map and 
		// add to specific hero's inventory		
}