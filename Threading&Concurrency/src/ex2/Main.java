package ex2;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mipopescu on 7/20/2016.
 */
public class Main {
    public static final String inputFileName = "src/ex2/in.txt";
    public static final String outputFileName = "src/ex2/out.txt";
    public static final int N_THREADS = 4;

    public static void main(String[] args) {

        try (Reader reader = new FileReader(inputFileName);
             BufferedReader bufferedReader = new BufferedReader(reader);
             Writer writer = new FileWriter(outputFileName);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            ConcurrentHashMap<String, Integer> dataMap = new ConcurrentHashMap<>();
            String text = null;
            String[] words;


            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    if( text == null){
                        text = line;
                    }else{
                        text = text + " " + line;
                    }
                }
            }

            words = text.split("(\\.|,|;|:|\\\\|/|\\?|~|`|<|>|\\[|]|\\{|}|\\(|\\)|!|@|#|\\$|%|\\^|&|\\-|_|\\+|'|=|\\*|\"|\\|| |\\t|\\n|\\r)+");
            int wordCount = words.length;

            System.out.println("Done reading.");
            long begin = System.currentTimeMillis();
            FileCrawlerThread[] threads = new FileCrawlerThread[N_THREADS];

            for (int i = 0; i < N_THREADS; i++) {
                int start = i * (wordCount / N_THREADS);
                int stop = (i + 1) * (wordCount / N_THREADS);
                if( i == N_THREADS -1 ){
                    stop = wordCount;
                }

                threads[i] = new FileCrawlerThread(words, dataMap, start, stop);
            }

            for (int i = 0; i < N_THREADS; i++) {
                threads[i].run();
            }

            for (int i = 0; i < N_THREADS; i++) {
                threads[i].join();
            }

            long end = System.currentTimeMillis();

            for(String key : dataMap.keySet() ){
                Integer value = dataMap.get(key);
                bufferedWriter.write(key + " appeared " + value + " times (" +
                        value * 100./wordCount + "% of the time)\n");
            }

            System.out.println("Done computing. Time elapsed = " +
                    (end - begin));

        } catch (FileNotFoundException e) {
            System.out.println("missing file " + inputFileName);
        } catch (IOException e) {
            System.out.println("I/O Exception encountered");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
