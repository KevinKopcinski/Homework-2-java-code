
public class Team {

    private int code;
    private List<Player> playerList;

    Team(){
        playerList = new ArrayList<Player>();
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }
}
