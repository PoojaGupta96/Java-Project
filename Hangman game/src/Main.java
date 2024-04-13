import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        String[] words={"cat","buffalo","horse","donkey"};
        String randomWord= words[(int)(Math.random()*words.length)];
        char[] letters= new char[randomWord.length()];
        for(int i=0;i<letters.length;i++) {
            letters[i] = '.';
        }
        int lives=3;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Starting Game");
        System.out.println("The word has"+ randomWord.length()+ "letters");
        while(lives>0) {
            System.out.print("Lives:");
            for(int i=0; i<lives;i++) {
                System.out.print("0");
            }
            System.out.println();
            System.out.println("Your Input:");
            char letter= scanner.next().charAt(0);
            boolean isGuessCorrect=false;
            for(int i=0;i<randomWord.length();i++){
                if (randomWord.charAt(i) == letter) {
                    letters[i] = letter;
                    isGuessCorrect = true;
                }
        }
            if (!isGuessCorrect){
                lives--;
                System.out.println("Incoorecct Guess");
            }
            System.out.println("Word:");
            for(char c:letters) {
                System.out.print(c);
            }
            System.out.println();
            boolean isGameFinished=true;
            for(char c:letters){
                if(c=='.'){
                    isGameFinished=false;
                    break;
                }
            }
            if(isGameFinished) {
                System.out.println("You Won");
                break;
            }
            }
if(lives==0){
    System.out.println("You lost. The word was:"+randomWord);
        }
        System.out.println("Exit game");
    }
}