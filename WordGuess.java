/**
 * Created by malir on 7/27/2016.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordGuess {
    public static void main(String[] args) {

    }
    public ArrayList<String> getWords(int length){
        ArrayList<String> Words = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\palsulea\\IdeaProjects\\Test\\src\\sowpods.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] splitted = line.split("\\n");
                for(String w:splitted)
                    if(w.length()==3)
                        Words.add(w);
            }
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Words;
    }

}
