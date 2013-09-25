/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame.helper;

import slotgame.Line;
import slotgame.Payline;
import slotgame.SlotMachine;

/**
 *
 * @author vitalispiridonov
 */
public class SlotPrinter {
    
    private SlotMachine slot;
    private StringBuilder sb;

    public SlotPrinter(SlotMachine slot) {
        this.slot = slot;
        
        sb = new StringBuilder();
    }

    @Override
    public String toString() {
        sb.append("Lines:");
        newLine();
        
        int linesCounter = 0;
        for (Line line: slot.getLines()) {
            sb.append(++linesCounter).append(": ");
            sb.append(line.toString());
            newLine();
        }
        
        newLine();
        sb.append("Paylines:");
        newLine();
        
        int totalWin = 0;
        int paylinesCounter = 0;
        for (Payline line: slot.findPaylines()) {
            sb.append(++paylinesCounter).append(": ");
            sb.append(line.toString());
            
            totalWin += line.getWin();
            
            newLine();
        }
        sb.append("Total win: ").append(totalWin);
        
        
        return sb.toString();
    }
    
    private void newLine() {
        newLine(1);
    }
    
    private void newLine(int lines) {
        for (int i = 0; i < lines; i++) {
            sb.append("\n");
        }
    }
    
    
}
