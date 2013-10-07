/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import slotgame.config.SlotConfig;
import slotgame.helper.SlotPrinter;

/**
 *
 * @author vitalispiridonov
 */
public class SlotMachine {
    
    private SlotConfig master;
    
    private List<Line> lines;
    private List<Payline> winningLines;
    private int win;
    
    private Random rnd;
    
    private int paylinesCount;
    private int betForLine = 1;

    public SlotMachine(SlotConfig master, int paylinesCount) {
        this.master = master;
        this.paylinesCount = paylinesCount;
        
        lines = new ArrayList<Line>();
        rnd = new Random(System.nanoTime());
    }
    
    public SlotConfig getMasterConfig() {
    	return master;
    }
    
    public void spin() {
        reset();
        
        for (int lineNumber = 0; lineNumber < master.countLines(); lineNumber++) {
            Line line = new Line();
            for (int reelNumber = 0; reelNumber < master.countReels(); reelNumber++) {
                Reel reel = master.getReel(reelNumber);
                
                spinReal(reel, line);
            }
            
            lines.add(line);
        }
        
        findPaylines();
    }
    
    public List<Reel> getReels() {
    	List<Reel> reels= new ArrayList<Reel>();
    	for (int reelNumber = 0; reelNumber < master.countReels(); reelNumber++) {
    		reels.add(master.getReel(reelNumber));
    	}
    	
    	return reels;
    }
    
    private void reset() {
        lines = new ArrayList<Line>();
        
        for (int reelNumber = 0; reelNumber < master.countReels(); reelNumber++) {
            Reel reel = master.getReel(reelNumber);
            reel.reset();
        }
    }
    
    private void spinReal(Reel reel, Line line) {
        int attampCount = 0;
        while (true) {
            if (attampCount >= 100) {
                break;
            }
            
            reel.shuffle();
            for (Symbol symbol: reel.getSymbols()) {
                double r = rnd.nextDouble();
                
                if (!reel.isDropped(symbol) && r < symbol.getChance()) {
                    reel.drop(symbol);
                    
                    line.addSymbol(symbol);
                    
                    return;
                }
                
            }
            
            attampCount++;
        }
    }
    
    public List<Payline> findPaylines() {
        win = 0;
        winningLines = new ArrayList<Payline>();
        
        List<Payline> paylines = new ArrayList<Payline>();
        
        for (int lineIndex = 1; lineIndex <= paylinesCount; lineIndex++) {
            Payline pl = new Payline(lineIndex);
            pl.addSymbols(paylineSymbols(lineIndex));
            
            
            LineAward lineAward = master.getPaytable().winForLine(pl);
            pl.setLineAward(lineAward);
            
            int winForLine = lineAward.getAward();
            if (winForLine > 0) {
                win += winForLine;
                winningLines.add(pl);
                
            }
            
            paylines.add(pl);
        }

        return paylines;
    }
    
    public int totalBet() {
        return betForLine * paylinesCount;
    }
    
    private List<Symbol> paylineSymbols(int lineIndex) {
        
        PlayLine playLine = PlayLine.PAYLINES.get(lineIndex - 1);
        
        List<Symbol> symbols = new ArrayList<Symbol>();
        if (playLine != null) {
            for (SymbolPosition position: playLine.getPoints()) {
                symbols.add(getSymbol(position.getLine(), position.getReel()));
            }
        }

        return symbols;
    }
    
    private Symbol getSymbol(int line, int reel) {
        return lines.get(line).getSymbols().get(reel);
    }

    @Override
    public String toString() {
        SlotPrinter printer = new SlotPrinter(this);
        
        return printer.toString();
    }

    public List<Line> getLines() {
        return lines;
    }

    public int getBetForLine() {
        return betForLine;
    }

    public void setBetForLine(int betForLine) {
        this.betForLine = betForLine;
    }

    public List<Payline> getWinningLines() {
        return winningLines;
    }

    public void setWinningLines(List<Payline> winningLines) {
        this.winningLines = winningLines;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }
    
}
