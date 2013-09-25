/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame.config;

import java.util.ArrayList;
import java.util.List;
import slotgame.Reel;

/**
 *
 * @author vitalispiridonov
 */
public abstract class BasicSlotConfig implements SlotConfig {
    
    List<Reel> reels;

    public BasicSlotConfig() {
        reels = new ArrayList();
        for (int i = 0; i < 5; i++) {
            reels.add(buildReal(i));
        }
    }

    @Override
    public List<Reel> slotReals() {
        return reels;
    }

    @Override
    public Reel getReel(int number) {
        return reels.get(number);
    }
    
    protected abstract Reel buildReal(int reelInd);
    
        @Override
    public int countReels() {
        return 5;
    }

    @Override
    public int countLines() {
        return 3;
    }
    
}
