package ex3;

import java.io.*;
import java.util.Scanner;

/**
 * Created by mipopescu on 7/19/2016.
 */
public class ex3 {
    static final String outputFileName = "src/ex3/output_ex3.txt";
    static final int MAX_DEPTH = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        in.close();

        printToFile(fileName + "\\", 0);
        listContents(fileName, 0);
    }

    public static void listContents(String fileName, int depth) {
        File file = new File(fileName);
        String[] childFiles = file.list();

        for (String child : childFiles) {
            String path = fileName + "\\" + child;
            File tmp = new File(path);
            if (tmp.isDirectory() == true) {
                printToFile(child + "\\", depth + 1);
                if (depth < MAX_DEPTH) {
                    listContents(path, depth + 1);
                }
            } else {
                printToFile(child, depth + 1);
            }
        }
    }

    public static void printToFile(String toPrint, int ntabs) {
        Writer fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(outputFileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for(int i = 0; i < ntabs; i++){
                toPrint = "    " + toPrint;
            }

            bufferedWriter.write(toPrint);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("File missing '" + outputFileName + "'");
        } catch (IOException ex) {
            System.out.println("I/O Exception:" + ex.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                System.out.println("I/O Exception:" + ex.getMessage());
            }
        }
    }
}
