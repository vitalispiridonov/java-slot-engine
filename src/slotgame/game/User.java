/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame.game;

/**
 *
 * @author vitalispiridonov
 */
public class User {
    
    private int chips;

    public User(int chips) {
        this.chips = chips;
    }
    
    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
        
        if (this.chips < 0) {
            this.chips = 0;
        }
    }
    
}
