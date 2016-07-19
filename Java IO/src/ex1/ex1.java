package ex1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by mipopescu on 7/19/2016.
 */
public class ex1 {
    private static final String fileName = "src/ex1/input_ex1.txt";

    public static void main(String[] args) throws IOException {

        /* Printed the working directory. haha */
//        System.out.println("Working Directory = " +
//                System.getProperty("user.dir"));

        /* Using a Scanner because reading N chars for an N digit number is awkward */
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the character whose occurences I should count");
        /* Only need the first character of the input String(line) */
        char theChar = in.nextLine().charAt(0);
        System.out.println("Enter the offset in the file from where I will start counting");

        int offset = Integer.parseInt(in.nextLine());
        long count = 0;
        System.out.println("The file I will be looking into is " + fileName);

        in.close();

        try (RandomAccessFile reader = new RandomAccessFile(fileName, "rw")) {
            reader.seek(offset);
            int data;
            while ((data = reader.read()) != -1) {
                char dataChar = (char) data;
                if (dataChar == theChar) {
                    count++;
                }
            }

            System.out.println("Done crawling through your file. The character " + theChar + " occured " + count + (count==1?" time":" times"));
        } catch (FileNotFoundException ex) {
            System.out.println("File missing '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("I/O Exception:" + ex.getMessage());
        }

    }
}
