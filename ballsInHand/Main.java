import java.util.;
import java.io.;
import java.lang.Math;

public class Main 
{

    public static int findBalls(int N) //Calculate the balls in hand after N seconds
    {


        //Make an array for integers
        int[] ballsInHand= new int[N];//Make an array for integers
        int totalBalls = 0;

        //loop thru each balls in array
        for (int i = 0; i < ballsInHand.length; i++)
        {
            if (N % 2 == 0)
            {
                totalBalls = i - 1;
            }
            else
            {
                totalBalls = i + 2;
            }
        }


        //write logic here
        return totalBalls;
    }

    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        //INPUT [uncomment & modify if required]
        int N = sc.nextInt();
        System.out.print(findBalls(N));
    }

}
