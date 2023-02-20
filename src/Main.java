import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double lengthA=0;
        double lengthB=0;
        //only need two lengths for rectangle since it has two pairs of length
        double area=0;
        double perimeter=0;
        double diagonalLength=0;
        String trash= "";

        Scanner in = new Scanner(System.in);


        System.out.print("Enter the first side length of rectangle: "); //input
        if (in.hasNextDouble()){
            lengthA = in.nextDouble();
            in.nextLine(); //clear buffer

            System.out.print("Enter the other side length of the rectangle: "); //input
            if (in.hasNextDouble()){
                lengthB = in.nextDouble();
                in.nextLine(); //clear buffer

                //calculations
                area = lengthA * lengthB;
                perimeter = (2 * lengthA) + (2* lengthB);
                diagonalLength = (lengthA * lengthA) + (lengthB * lengthB);

                //output
                System.out.println("The area is " + area + " , the perimeter is " + perimeter + " and the diagonal length is  " + diagonalLength);
            }
            else{ // if wrong input the second time the code stops running due to not having valid numbers
                trash = in.nextLine();
                System.out.println("Must enter a valid length. Cannot compute calculations." + trash);
            }

        }
        // if wrong input the first time the code stops running since calculation cannot be done
        else{
            trash = in.nextLine();
            System.out.println("Must enter a valid length. Cannot compute calculations." + trash);
        }


    }
}