import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {

    public static void main (String[] args){
//        codeChallenge1();
//        codeChallege2();
        codeChallenge3();
    }
    public static void codeChallenge1() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of students: ");
        int numStudents = scanner.nextInt();
        double [] grades = new double[numStudents];
        int maxScore = 100;
        double mean = 0;

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Scores: ");
             grades[i] = scanner.nextDouble();

            }
            for(int i = 0; i<grades.length; i++){
                System.out.println("Student"+ (i+1) +" Score: "+" "+  grades[i]+ "%");
                double studentscore = grades[i];
                double studentPercentage = (studentscore/maxScore)*100;
//                System.out.println(studentPercentage);

            }
        for(int i = 0; i<grades.length; i++){
            mean+= grades[i];
        }
        System.out.println(mean/grades.length);
    }
    public static void codeChallege2(){
        Scanner scanner = new Scanner(System.in);
        boolean[] answers  = {true, false, true, true, false};
        String [] questions = {"1+1 is 2:", "2+2 is 3:", "3+3 is 6:", "4+4 is 8:", "5+5 is 100:"};
        int score = 0;
        for(int i = 0; i<answers.length; i++){
            System.out.print(questions[i]);
            boolean userAnswer = scanner.nextBoolean();
            if (userAnswer == answers[i]) {
                score++;
            }
        }
        System.out.format("You scores: %d out of 5 ", score);
        }
        public static void codeChallenge3(){
            System.out.println("\n### Guess My Number Game ###\n");

            System.out.println("--- Rules ---");
            System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
            System.out.println("Enter \"higher\" if my guess is too low.");
            System.out.println("Enter \"lower\" if my guess is too high.");
            System.out.println("Enter \"correct\" if I get it right.");

            Scanner scanner = new Scanner(System.in);
            String input;

            int min = 1;
            int max = 100;

            while (true) {
                int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
                System.out.println("\nI guess " + randomNumber + ".");
                System.out.print("Your response: ");
                input = scanner.next();

                if (input.equals("higher")) {
                    min = randomNumber + 1;
                } else if (input.equals("lower")) {
                    max = randomNumber - 1;
                } else if (input.equals("correct")) {
                    System.out.println("\n" + randomNumber + ", eh? I knew I'd get it eventually.");
                    break;
                }

                // This if statement checks to see if it's still possible to win
                // Example: The program guesses 28, you enter "higher", then the program guesses 29, you enter "lower"
                if (min == max + 1) {
                    System.out.println("\nThat's not possible. Let's try again.");
                    min = 1;
                    max = 100;
                }
            }






        }

    }


