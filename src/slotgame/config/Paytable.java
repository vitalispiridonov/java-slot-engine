/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame.config;

import slotgame.LineAward;
import slotgame.Payline;

/**
 *
 * @author vitalispiridonov
 */
public interface Paytable {
    
    boolean isWinning(Payline payline);
    
    LineAward winForLine(Payline payline);
    
}
