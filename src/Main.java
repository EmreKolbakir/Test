import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("C:\\Users\\ek034548\\IdeaProjects\\FirstProject\\src\\input.txt");
        PrintWriter outputFile = new PrintWriter("C:\\Users\\ek034548\\IdeaProjects\\FirstProject\\src\\output.txt");

        try (Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFile)){
                while (scanner.hasNextLine()){
                    int number = Integer.parseInt(scanner.nextLine());
                    writer.println(isPrime(number));
                }

        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
        }
    }
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for(int i =2; i<=Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

}