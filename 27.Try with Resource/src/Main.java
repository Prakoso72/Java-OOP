import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader input = null;

        //manual try catch for IOStream
        try{
            input = new BufferedReader(new FileReader("teset.txt"));
            while (true){
                String text = input.readLine();
                if(text == null) break;
                System.out.println(text);
            }
        } catch (Exception exception){
            exception.printStackTrace();
        } finally {
            if(input!=null){
                try {
                    input.close();
                } catch (IOException exception){
                    exception.getMessage();
                    exception.printStackTrace();
                }
            }
        }

        //try catch with resout\rce
        try(BufferedReader input2 = new BufferedReader(new FileReader("teset.txt"))){
            while (true){
                String text = input2.readLine();
                if(text == null) break;
                System.out.println(text);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
