import java.util.List;
import java.util.Scanner;

public class Blackjack {
    private Player [] players;
    private int amtOfPlayers;
    private Scanner ij = new Scanner(System.in);
    Dealer_Class dealer;

    public void getPlayers(){
        System.out.println("How many players would you like to have? (1-4)");
        amtOfPlayers = ij.nextInt();
        Player [] playerList = new Player[amtOfPlayers];
        for(int i = 0; i < amtOfPlayers-1; i++){
            Player player = new Player();
            players[i] = player;
        }
    }

    /* public void getBets() {
        for (int i = 0; i < amtOfPlayers; i++) {
            if (players[i].getBank() > 0) {
                System.out.print("How much do you want to bet " + players[i].getName() + (" (1-" + players[i].getBank()) + ")? ");
                bet = ij.nextInt();
                players[i].setBet(g);
                if(player[i].bet <= player[i].bank){
                    player[i].bank = player[i].bank - player[i].bet;
                } else {
                    System.out.println("You do not have that much money to bet");
                }
            }
        }
    }

     */
    public void firstDeal(){
        for(int i = 0; i < amtOfPlayers; i++){
            players[i].addToHand(dealer.DealaCard());
            players[i].addToHand(dealer.DealaCard());
        }
    }

}
