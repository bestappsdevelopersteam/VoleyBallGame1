import java.util.ArrayList;

public class VolleyballTeam {
    public String name;
    public String stadium;
    public String couch;
    public ArrayList < VolleyballPlayer > VolleyballPlayers;
    VolleyballPlayer player1 = new VolleyballPlayer ("Ivan1", 21, 1, 5, 5);
    VolleyballPlayer player2 = new VolleyballPlayer ("Ivan2", 22, 2, 5, 5);
    VolleyballPlayer player3 = new VolleyballPlayer ("Ivan3", 23, 3, 5, 5);
    VolleyballPlayer player4 = new VolleyballPlayer ("Ivan4", 24, 4, 5, 5);
    VolleyballPlayer player5 = new VolleyballPlayer ("Ivan5", 25, 5, 5, 5);

    public VolleyballTeam (String name, String stadium, String couch, ArrayList < VolleyballPlayer > volleyballPlayers, VolleyballPlayer player1, VolleyballPlayer player2, VolleyballPlayer player3, VolleyballPlayer player4, VolleyballPlayer player5) {
        this.name = name;
        this.stadium = stadium;
        this.couch = couch;
        VolleyballPlayers = volleyballPlayers;
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        this.player5 = player5;
    }



    public  VolleyballTeam () {
        this.name = "Jordan";
        this.stadium = "Olympic";
        this.couch = "Jose";
        this.player1 = new VolleyballPlayer ("Joe1", 24, 1, 4, 5);
        this.player2 = new VolleyballPlayer ("Joe2", 24, 2, 4, 5);
        this.player3 = new VolleyballPlayer ("Joe3", 24, 3, 4, 5);
        this.player4 = new VolleyballPlayer ("Joe4", 24, 4, 4, 5);
        this.player5 = new VolleyballPlayer ("Joe5", 24, 5, 4, 5);
    }

    public void calculateStrength () {//изчислява силата на отбор като средно аритметично от
        // уменията на играчите
        for (VolleyballPlayer player : VolleyballPlayers) {
            player.getSkill ();

        }
    }

    public void teamTraining (VolleyballTeam team1) {
        if (player1.getCondition () > 1 && player1.getCondition () < 5) {
            player1.train ();
        }
        if (player2.getCondition () > 1 && player2.getCondition () < 5) {
            player2.train ();
        }
        if (player3.getCondition () > 1 && player3.getCondition () < 5) {
            player3.train ();
        }
        if (player4.getCondition () > 1 && player4.getCondition () < 5) {
            player4.train ();
        }
        if (player5.getCondition () > 1 && player5.getCondition () < 5) {
            player5.train ();
        }
    }

    public void teamRest (VolleyballTeam team1) {
        if (player1.getCondition () < 5) {
            player1.rest ();
        }
        if (player2.getCondition () < 5) {
            player2.rest ();
        }
        if (player3.getCondition () < 5) {
            player3.rest ();
        }
        if (player4.getCondition () < 5) {
            player4.rest ();
        }
        if (player5.getCondition () < 5) {
            player5.rest ();
        }
    }

    @Override
    public String toString () {
        return "VolleyballTeam{" + "name='" + name + '\'' + ", stadium='" + stadium + '\'' + ", couch='" + couch + '\'' + ", VolleyballPlayers=" + VolleyballPlayers + ", player1=" + player1 + ", player2=" + player2 + ", player3=" + player3 + ", player4=" + player4 + ", player5=" + player5 + '}';
    }
}


