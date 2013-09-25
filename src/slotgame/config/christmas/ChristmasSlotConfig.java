/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame.config.christmas;

import java.util.List;
import slotgame.Reel;
import slotgame.SpecialSymbolType;
import slotgame.Symbol;
import slotgame.config.BasicSlotConfig;
import slotgame.config.Paytable;

/**
 *
 * @author vitalispiridonov
 */
public class ChristmasSlotConfig extends BasicSlotConfig {
    
    private Paytable paytable;
    
    public static final Symbol SYMBOL_1 = new Symbol(17D/100D, 1);
    public static final Symbol SYMBOL_2 = new Symbol(16D/100D, 2);
    public static final Symbol SYMBOL_3 = new Symbol(15D/100D, 3);
    public static final Symbol SYMBOL_4 = new Symbol(14D/100D, 4);
    public static final Symbol SYMBOL_5 = new Symbol(12D/100D, 5);
    public static final Symbol SYMBOL_6 = new Symbol(10D/100D, 6);
    public static final Symbol SYMBOL_7 = new Symbol(8D/100D, 7);
    public static final Symbol SYMBOL_8 = new Symbol(6D/100D, 8);
    
    public static final Symbol SYMBOL_9 = new Symbol(1D/200D, 9);
    
    
    public static final Symbol SYMBOL_WILD = new Symbol(1D/200D, SpecialSymbolType.SYMBOL_TYPE_SPECIAL_WILD);
    public static final Symbol SYMBOL_BONUS = new Symbol(1D/200D, SpecialSymbolType.SYMBOL_TYPE_SPECIAL_BONUS);
    public static final Symbol SYMBOL_SCATER = new Symbol(1D/200D, SpecialSymbolType.SYMBOL_TYPE_SPECIAL_SCATTER);

    public ChristmasSlotConfig() {
        paytable = new ChristmasPaytable();
    }

    @Override
    protected Reel buildReal(int reelInd) {
        Reel reel = new Reel();
        
        reel.addSymbol(SYMBOL_1);
        reel.addSymbol(SYMBOL_2);
        reel.addSymbol(SYMBOL_3);
        reel.addSymbol(SYMBOL_4);
        
        reel.addSymbol(SYMBOL_5);
        reel.addSymbol(SYMBOL_6);
        reel.addSymbol(SYMBOL_7);
        reel.addSymbol(SYMBOL_8);
        
        reel.addSymbol(SYMBOL_9);
        
        reel.addSymbol(SYMBOL_BONUS);
        reel.addSymbol(SYMBOL_WILD);
        reel.addSymbol(SYMBOL_SCATER);
        
        return reel;
    }

    @Override
    public Paytable getPaytable() {
        return paytable;
    }

    
}
