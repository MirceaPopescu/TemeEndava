package ex2;

import java.io.*;

/**
 * Created by mipopescu on 7/19/2016.
 */

public class ex2 {
    static final String inputFileName = "src/ex2/input_ex2.txt";
    static final String outputFileName = "src/ex2/output_ex2.txt";

    public static void main(String[] args) {
        System.out.println("Gonna read from " + inputFileName + " and write the words in reversed order into " + outputFileName);
        Writer fileWriter;
        BufferedWriter bufferedWriter = null;


        /* Open the file once and then close it, just so it gets cleared */
        try {
            fileWriter = new FileWriter(outputFileName, false);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch(IOException ex){
            System.out.println("I/O Exception:" + ex.getMessage());
        }  finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                System.out.println("I/O Exception:" + ex.getMessage());
            }
        }


        int lineCount = countLines(inputFileName);
        for(int i = lineCount - 1; i >= 0; i--){
            String line = getLine(inputFileName, i);
            String []tokens = line.split(" ");

            try {
                fileWriter = new FileWriter(outputFileName, true);
                bufferedWriter = new BufferedWriter(fileWriter);

                for(int j = tokens.length-1; j> 0; j--){
                    bufferedWriter.write(tokens[j] + " ");
                }
                bufferedWriter.write(tokens[0]);

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

    static int countLines(String fileName){
        int count = 0;

        Reader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.readLine() != null) {
                count++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File missing '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("I/O Exception:" + ex.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                System.out.println("I/O Exception:" + ex.getMessage());
            }
        }

        return count;
    }

    static String getLine(String fileName, int index){
        Reader fileReader = null;
        BufferedReader bufferedReader = null;
        int count = 0;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            while (count != index) {
                bufferedReader.readLine();
                count++;
            }

            return bufferedReader.readLine();
        } catch (FileNotFoundException ex) {
            System.out.println("File missing '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("I/O Exception:" + ex.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                System.out.println("I/O Exception:" + ex.getMessage());
            }
        }

        return null;
    }
}
