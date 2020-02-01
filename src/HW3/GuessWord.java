package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class GuessWord {
    public static void main (String[] args) throws IOException {
        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //System.out.println(Arrays.toString(words));
        System.out.println("Угадай английское слово, это может быть: фрукт, овощ или т.п.");
        String guess = words[random.nextInt(words.length)];
        String userWord;

        while (true){
            userWord = reader.readLine().toLowerCase();
            if(userWord.equals(guess)) {
                System.out.println("Вы выиграли");
                break;
            } else {
                int minLength = Math.min(guess.length(), userWord.length());
                String guessedLetters = "";
                for (int i = 0; i < minLength; i++){
                    if (guess.charAt(i) == userWord.charAt(i)) {
                        guessedLetters = guessedLetters + guess.charAt(i);
                    } else {
                        guessedLetters = guessedLetters + '#';
                    }
                }
                for (int i = minLength; i < 15; i++){
                    guessedLetters = guessedLetters + '#';
                }
                System.out.println(guessedLetters);
            }
        }
    }
}
