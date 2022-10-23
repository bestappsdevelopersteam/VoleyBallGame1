import java.util.ArrayList;

public class VoleyballTeam {
    public String name;
    public String stadion;
    public String couch;
    public ArrayList < VolleyballPlayer > VolleyballPlayers;



    public void calculateStrength(){
        for (VolleyballPlayer player : VolleyballPlayers) {
            player.getSkill () ;
        }


    }
    
    
}
