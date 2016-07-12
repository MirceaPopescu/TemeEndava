import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by mipopescu on 7/12/2016.
 */
public class MyMatrix implements Sumabil {
    static int SIZE = 4;
    float data[][];

    MyMatrix(){
        this.data = new float[SIZE][SIZE];
        Random rand = new Random();
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                data[i][j] = (rand.nextInt() % 10);
            }
        }
    }

    @Override
    public void addValue(Sumabil value) {
        if( value instanceof MyMatrix){
            MyMatrix valueMatrix = (MyMatrix) value;
            for(int i =0; i < SIZE; i++){
                for(int j = 0; j < SIZE; j++){
                    this.data[i][j] += valueMatrix.data[i][j];
                }
            }
        }
    }

    public String toString(){
        String ret = new String();
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                ret += data[i][j] + " ";
            }

            ret += "\n";
        }

        return ret;
    }

}
