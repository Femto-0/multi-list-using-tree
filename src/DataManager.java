import java.io.*;

public class DataManager {
    Node node;

    public void readFile(String fileName) throws IOException {
        String [] arr;
        String line;
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while((line=br.readLine())!=null){

            arr = line.split(" \s");
            node= new Node()
        }
    }

    public static void main(String[] args) {

    }
}
