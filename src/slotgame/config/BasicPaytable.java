/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame.config;

import java.util.ArrayList;
import java.util.List;
import slotgame.LineAward;
import slotgame.Payline;
import slotgame.SpecialSymbolType;
import slotgame.Symbol;

/**
 *
 * @author vitalispiridonov
 */
public abstract class BasicPaytable implements Paytable {
    
    private List<LineAward> awards;
    
    @Override
    public LineAward winForLine(Payline payline) {
        
        for (LineAward award: awards) {
            if (award.getSymbol().equals(payline.getLineSymbol()) && 
                    payline.countLineLenght() == award.getLineLenght()) {
                return award;
            }
        }
        
        return new LineAward(SpecialSymbolType.SYMBOL_NONE, 0, 0);
    }

    @Override
    public boolean isWinning(Payline payline) {
        return winForLine(payline).getAward() > 0;
    }
    
    
    
    public void addAward(Symbol symbol, int lineLenght, int award){
        addAward(new LineAward(symbol, lineLenght, award));
    }
    
    public void addAward(LineAward award) {
        if (awards == null) {
            awards = new ArrayList<LineAward>();
        }
        
        awards.add(award);
    }
    
    
    
    public abstract void addAwards();
}
