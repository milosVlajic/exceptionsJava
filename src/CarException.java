import java.util.InputMismatchException;
import java.util.Scanner;

public class CarException {

    public static void main(String[] args){

        try{
            String[] car = {"porsche", "audi", "lamborghini", "bmw"};
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter index");
            int c = keyboard.nextInt();
            System.out.println(car[c]);
        }
        catch(InputMismatchException e){
            System.out.println("Error.Enter number!");
        }
        catch(NullPointerException e) {
            System.out.println("This array is null!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of bounds!");
        }
        catch (Exception e){
            System.out.println("This is exception!");
        }
    }
}
