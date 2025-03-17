import java.util.Scanner;

public class Guess_the_number_game {
    public static void main(String[] args) {
        int i,j=1;
        Scanner inp = new Scanner(System.in);
        guess g1 = new guess();
        while (j<=3){
            g1.points=0;
            System.out.println("\n ROUND.."+j+"\n");
            System.out.println("give your lower_limit");
            int lower_limit= inp.nextInt();
            System.out.println("give your uppper limit");
            int upper_limit= inp.nextInt();
            for( i=1;i<=5;i++) {
                System.out.println("Attempt - "+i);
                g1.guess_number(lower_limit, upper_limit);
            }
            System.out.println("YOUR SCORE OF ROUND "+ j + "="+ g1.points);
            j++;
        }

    }
}
