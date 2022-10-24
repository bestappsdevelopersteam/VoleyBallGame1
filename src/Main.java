import java.security.SecureRandom;

public class Main {

    public static void main (String[] args) {

        SecureRandom rand = new SecureRandom (); //instance of random class
        int upperbound = 25; //generate random values from 0-24
        int randomStrength1 = rand.nextInt (upperbound);
        int randomStrength2 = rand.nextInt (upperbound);

        VolleyballTeam team1 = new VolleyballTeam ();
        VolleyballTeam team2 = new VolleyballTeam ("Plamen", "Ludogorec", "Hose", null, {name () = "Joe1", , 25, 1, 4, 5}, {"Joe1", 25, 1, 4, 5}, {"Joe1", 25, 1, 4, 5}, {"Joe1", 25, 1, 4, 5}, {"Joe1", 25, 1, 4, 5});
        System.out.println (team1);
        System.out.println (team2);
       public void  playMatch(team1, team2) {// check if team1 and team2 are equal
            if (team1.equals (team2)) {
                System.out.println ("team1 and team2 are equal");
            } else {
                System.out.println ("team1 and team2 are not equal");
            }

        }
    }
}

/*
import java.io.PrintStream;
        import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            Random r = new Random();
            PrintStream pr1 = new PrintStream("random_numbers.txt");
            PrintStream pr2 = new PrintStream("random_numbers.csv");
            for (int i = 0; i < 10; i++) {
                arr[i] = r.nextInt(100) + 1;
                pr1.print(arr[i] + "  ");
                pr2.print(arr[i] + "; ");
            }
            pr1.close();
            pr2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}*/
