/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame;

/**
 *
 * @author vitalispiridonov
 */
public class Payline extends Line {
    
    private LineAward lineAward;
   

    public Symbol getLineSymbol() {
        for (int ind = 0; ind < getSymbols().size(); ind++) {
            if (super.getSymbols().get(ind).getType() != SpecialSymbolType.SYMBOL_TYPE_SPECIAL_WILD) {
                return super.getSymbols().get(ind);
            }
        }
        
        return super.getSymbols().get(0);
    }
    
    public int countLineLenght() {
        
        for (int lenght = 0; lenght < getSymbols().size(); lenght++) {
            int type = getSymbols().get(lenght).getType();
            if (type != getLineSymbol().getType() && 
                    type != SpecialSymbolType.SYMBOL_TYPE_SPECIAL_WILD) {
                return lenght;
            }
        }
        
        return getSymbols().size();
    }

    public LineAward getLineAward() {
        return lineAward;
    }

    public void setLineAward(LineAward lineAward) {
        this.lineAward = lineAward;
    }
    
    public boolean isWinning() {
        return lineAward.getAward() > 0;
    }

    public int getWin() {
        return lineAward.getAward();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        
        sb.append(" (");
        sb.append(getLineSymbol()).append("x").append(countLineLenght());
        sb.append(")");
        
        if (isWinning()) {
            sb.append(" Win: ").append(lineAward.getAward());
        }
        
        return sb.toString();
    }

    
}
