import java.io.*;
import java.util.*;

public class PersonalityTest{
//Here I called the dimensions that were in the spec  
   public static final int DIM = 4;
//The main method is where I organized the methods below that will help make the program work to the best of its ability   
   public static void main(String[] args) throws FileNotFoundException{
      intro();
      Scanner console = new Scanner(System.in);
      System.out.print("input file name? ");
      Scanner input = new Scanner(new File(console.nextLine()));
      System.out.print("output file name? ");
      PrintStream output = new PrintStream(new File(console.nextLine()));
      while(input.hasNextLine()){
         String name = input.nextLine();
         String answers = input.nextLine().toUpperCase();
         int[] countsA = new int[DIM];
         int[] countsB = new int[DIM];
         getCounts(answers, countsA, countsB);
         int[] percentB = getPercentB(countsA, countsB);
         String personalityType = getPersonality(percentB);
         output.println(name + ": " + Arrays.toString(percentB) + " = " + personalityType);
      }

   }
//The first method we called is the intro, there was a message from the spec we printed      
   public static void intro(){
      System.out.println("This program processes a file of answers to the");
      System.out.println("Keirsey Temperament Sorter. It converts the");
      System.out.println("various A and B answers for each person into");
      System.out.println("a sequence of B-percentages and then into a");
      System.out.println("four-letter personality type.");
      System.out.println("");
   }
//This method we were looking to organize the counts for A&B this way it will print, depending on there answer, A or B   
   public static void getCounts(String answers, int[] countsA, int[] countsB){
      for(int i = 0; i < answers.length(); i++){
         if(answers.charAt(i) == 'A'){
            countsA[(i % 7 + 1) / 2]++;
         }else if(answers.charAt(i) == 'B'){
            countsB[(i % 7 + 1) / 2]++;
         }
      }
   }
//Now we also wanted to print the percent, I made a for loop that would apply the same arithmetic for the tests   
   public static int[] getPercentB(int[] countsA, int[] countsB){
      int[] percentB = new int[DIM];
      for(int i = 0; i < DIM; i++){
         percentB[i] = (int) Math.round(100.0 * countsB[i] / (countsA[i] + countsB[i]));
      }
      return percentB;
   }
  
   public static String getPersonality(int[] percentB){
      String typeA = "ESTJ";
      String typeB = "INFP";
      String type = "";
      for(int i = 0; i < DIM; i++){
         if(percentB[i] < 50){
            type+= typeA.charAt(i);
         }else if(percentB[i] > 50){
            type+= typeB.charAt(i);
         }else{
            type+= "X";
         }
      } 
      return type;
   }  
}
