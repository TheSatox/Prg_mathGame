/**
 * Created by eros14 on 2016-09-16.
 */

import java.util.Random;
import java.util.Scanner;

public class sifferlek {

    static int[]nummerA;
    static int[]nummerB;
    static int[]svar;

    public static void main(String[]args){
        createQuestions();
        askQuestions();
        correctAnswer();
    }

    public static void createQuestions(){
        Random r = new Random();
        nummerA = new int[10];
        nummerB = new int[10];
        for (int i = 0 ; i < 10 ; i++){
            nummerA[i] = r.nextInt(100);
            nummerB[i] = r.nextInt(100);
        }

    }

    public static void askQuestions(){
        svar = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0 ; i < 10 ; i++){
            System.out.print(" Vad är " + nummerA[i] + " + " + nummerB[i] + " ? ");
            svar[i] = in.nextInt();
        }
    }

        public static void correctAnswer(){
            int score = 0;
            for(int i = 0 ; i < 10 ; i++){
                if(nummerA[i] + nummerB[i] == svar[i]) {
                    System.out.println(nummerA[i] + " + " + nummerB[i] + " = " + svar[i] + " (Rätt) ");
                    score += 10;
                }

                else{
                    System.out.println(nummerA[i] + " + " + nummerB[i] + " = " + svar[i] + " (Fel, rätt svar är " + (nummerA[i] +
                    nummerB[i])+ ")");
                }
            }
        System.out.println("\nTotal score " + score);
    }


}
