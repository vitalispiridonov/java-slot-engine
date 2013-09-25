/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame.config;

import java.util.List;
import slotgame.Reel;

/**
 *
 * @author vitalispiridonov
 */
public interface SlotConfig {
    
    Paytable getPaytable();
    
    List<Reel> slotReals();
    Reel getReel(int number);
    
    int countReels();
    int countLines();
    
}
