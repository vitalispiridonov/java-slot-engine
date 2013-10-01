/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame.game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import slotgame.LineAward;
import slotgame.Payline;
import slotgame.SlotMachine;

/**
 *
 * @author vitalispiridonov
 */
public class Game {
    
    private User user;
    private SlotMachine slot;
    
    private int totalBet;
    private int totalWin;
    
    private Map<LineAward, Integer> awardHistory;

    public Game(User user, SlotMachine slot) {
        this.user = user;
        this.slot = slot;
        
        awardHistory = new HashMap<LineAward, Integer>();
    }
    
    public void spin() {
        if (validateSpin()) {
            user.setChips(user.getChips() - slot.totalBet());
            setTotalBet(getTotalBet() + slot.totalBet());
            
            slot.spin();
            setTotalWin(getTotalWin() + slot.getWin());
            user.setChips(user.getChips() + slot.getWin());
            
            saveAwardHistory(slot.getWinningLines());
        }
    }
    
    public boolean validateSpin() {
        if (user.getChips() < slot.totalBet()) {
            return false;
        }
        
        return true;
    }
    
    private void saveAwardHistory(List<Payline> paylines) {
        for (Payline payline: paylines) {
            LineAward award = payline.getLineAward();
            if ( !awardHistory.keySet().contains(award)) {
                awardHistory.put(award, 1);
            } else {
                int count = awardHistory.get(award);
                
                awardHistory.remove(award);
                awardHistory.put(award, count + 1);
            }
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SlotMachine getSlot() {
        return slot;
    }

    public void setSlot(SlotMachine slot) {
        this.slot = slot;
    }

    public int getTotalBet() {
        return totalBet;
    }

    public void setTotalBet(int totalBet) {
        this.totalBet = totalBet;
    }

    public int getTotalWin() {
        return totalWin;
    }

    public void setTotalWin(int totalWin) {
        this.totalWin = totalWin;
    }

    public Map<LineAward, Integer> getAwardHistory() {
        return awardHistory;
    }

    public void setAwardHistory(Map<LineAward, Integer> awardHistory) {
        this.awardHistory = awardHistory;
    }
 
}
