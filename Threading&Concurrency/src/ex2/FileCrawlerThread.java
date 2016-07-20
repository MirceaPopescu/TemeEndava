package ex2;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mipopescu on 7/20/2016.
 */
public class FileCrawlerThread extends Thread{
    private String[] text;
    private ConcurrentHashMap<String, Integer> data;
    private int start;
    private int stop;

    public FileCrawlerThread(String[] text, ConcurrentHashMap<String, Integer> data, int start, int stop) {
        this.text = text;
        this.data = data;
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run(){
        for(int i = start; i < stop; i++){
            String word = text[i];
            Integer count = data.get(word);
            if(count == null){
                count = new Integer(1);
                data.put(word, count);
            }else{
                count++;
                data.put(word, count);
            }
        }
    }
}
