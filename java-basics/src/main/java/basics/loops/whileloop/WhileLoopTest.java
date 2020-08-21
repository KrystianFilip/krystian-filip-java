package basics.loops.whileloop;

import java.util.Random;

public class WhileLoopTest {
    public static void main(String[] args) {
        // Initiating boolean variable at starting value false and tryCounter at value 0 and creating random generator.
        boolean loggedIn = false;
        int tryCounter = 0;
        Random rg = new Random();
        //Program starts looping under condition that user is still not logged in.
        while(!loggedIn) {
            tryCounter++;
            System.out.println("Waiting for user to log in to server: [attempt #" + tryCounter +"]");
            if (rg.nextInt(100) > 90) {
                loggedIn = true;
            }
        }
        System.out.println("User has logged in.");
    }
}
