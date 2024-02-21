import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Word {

    private static ArrayList<String> WordList = new ArrayList<String>();

    public Word() {
        try {
            setWords();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void setWords() throws FileNotFoundException {
        Scanner s = new Scanner(new File("sgb-words.txt"));

        while (s.hasNextLine()) {
            WordList.add(s.nextLine());
        }
        s.close();
    }

    public String getRandomWord() {
        return WordList.get((int) (Math.random() * WordList.size()));
    }

}