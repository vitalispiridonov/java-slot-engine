/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame;

import java.util.Map;
import org.freedesktop.Hal.Manager;
import slotgame.config.christmas.ChristmasSlotConfig;
import slotgame.game.Game;
import slotgame.game.User;

/**
 *
 * @author vitalispiridonov
 */
public class SlotGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User(10000000);
        SlotMachine machine = new SlotMachine(new ChristmasSlotConfig(), 30);

        Game game = new Game(user, machine);
        
        for (int i = 0; i < 100000; i++) {
            game.spin();
        }
        
        for (Map.Entry<LineAward, Integer> entry: game.getAwardHistory().entrySet()) {
            int count = entry.getValue();
            LineAward award = entry.getKey();
            
            System.out.println(award.toString() + " | Win " + count + " times");
        }
        
        System.out.println("\n");
        System.out.println("Total bet: " + game.getTotalBet());
        System.out.println("Total win: " + game.getTotalWin());
        System.out.println("Payout: " + (double) game.getTotalWin() / (double) game.getTotalBet());
        
        
        System.out.println("User balance: " + user.getChips());
    }
}
