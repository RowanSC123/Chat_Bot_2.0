import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hello. What is your name? ");
        String name = input.nextLine();
        Bot2 obj = new Bot2(name);
        obj.greeting();
        
        System.out.println("What is your favorite animal? ");
        String animal = input.nextLine();
        obj.favoriteAnimal(animal);
        
        System.out.println("Where do you live? ");
        String location = input.nextLine();
        obj.home(location);
        
        System.out.println("What is your favorite number? ");
        int number = input.nextInt();
        obj.favoriteNumber(number);
        
        obj.goodbye();
    }
}

