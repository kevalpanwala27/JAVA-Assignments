import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ASSIGNMENT_2 {
    public static void main(String[] args) {
        String inputFilePath = "/Users/kevalpanwala/Desktop/input.txt";
        String outputFilePath = "/Users/kevalpanwala/Desktop/output.txt";
        capitalizeFile(inputFilePath, outputFilePath);
    }
    static void capitalizeFile(String inputFilePath, String outputFilePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            PrintWriter pr = new PrintWriter(new FileWriter(outputFilePath));
            String s;
            for(s = br.readLine(); s != null; s = br.readLine())
                pr.println(s.toUpperCase());
            System.out.println("File written successfully");
            br.close();
            pr.flush();
            pr.close();
        } catch(Exception e) { System.out.println("File error: " + e); }
    }
}


