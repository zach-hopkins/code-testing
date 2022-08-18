package javatest;

import java.util.*;

public class Main {

    public static int findBalls(int N) // Calculate the balls in hand after N seconds
    {
        // create ball counter
        int totalBalls = 0;

        // loop thru number of seconds
        for (int i = 0; i < N; i++) {
            if (i == 0) { // if i is 0 just skip to next i number because you don't have any balls in hand
                          // to drop (0 is even and we would drop 2 balls)
                continue; // continue means skip current loop number and go-to next
            }
            if (i % 2 == 0) { // if current second is even
                totalBalls = totalBalls - 1; // decrement totalBalls by 1
            } else {
                totalBalls = totalBalls + 2; // increment totalBalls by 2
            }
        }
        return totalBalls; // return totalBalls
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        // INPUT [uncomment & modify if required]
        int N = sc.nextInt();
        System.out.print(findBalls(N));
        sc.close();
    }
}
