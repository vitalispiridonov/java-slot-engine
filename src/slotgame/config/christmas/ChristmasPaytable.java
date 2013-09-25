/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame.config.christmas;

import slotgame.Payline;
import slotgame.config.BasicPaytable;

/**
 *
 * @author vitalispiridonov
 */
public class ChristmasPaytable extends BasicPaytable {

    public ChristmasPaytable() {
        addAwards();
    }
    
    

    @Override
    public void addAwards() {
        addAward(ChristmasSlotConfig.SYMBOL_1, 3, 8);
        addAward(ChristmasSlotConfig.SYMBOL_1, 4, 25);
        addAward(ChristmasSlotConfig.SYMBOL_1, 5, 110);
        
        addAward(ChristmasSlotConfig.SYMBOL_2, 3, 9);
        addAward(ChristmasSlotConfig.SYMBOL_2, 4, 30);
        addAward(ChristmasSlotConfig.SYMBOL_2, 5, 120);
        
        addAward(ChristmasSlotConfig.SYMBOL_3, 3, 10);
        addAward(ChristmasSlotConfig.SYMBOL_3, 4, 40);
        addAward(ChristmasSlotConfig.SYMBOL_3, 5, 140);
        
        addAward(ChristmasSlotConfig.SYMBOL_4, 3, 11);
        addAward(ChristmasSlotConfig.SYMBOL_4, 4, 50);
        addAward(ChristmasSlotConfig.SYMBOL_4, 5, 160);
        
        addAward(ChristmasSlotConfig.SYMBOL_5, 3, 12);
        addAward(ChristmasSlotConfig.SYMBOL_5, 4, 60);
        addAward(ChristmasSlotConfig.SYMBOL_5, 5, 180);
        
        addAward(ChristmasSlotConfig.SYMBOL_6, 2, 7);
        addAward(ChristmasSlotConfig.SYMBOL_6, 3, 40);
        addAward(ChristmasSlotConfig.SYMBOL_6, 4, 350);
        addAward(ChristmasSlotConfig.SYMBOL_6, 5, 2000);
        
        addAward(ChristmasSlotConfig.SYMBOL_7, 2, 8);
        addAward(ChristmasSlotConfig.SYMBOL_7, 3, 45);
        addAward(ChristmasSlotConfig.SYMBOL_7, 4, 400);
        addAward(ChristmasSlotConfig.SYMBOL_7, 5, 2500);
        
        addAward(ChristmasSlotConfig.SYMBOL_8, 2, 9);
        addAward(ChristmasSlotConfig.SYMBOL_8, 3, 50);
        addAward(ChristmasSlotConfig.SYMBOL_9, 4, 500);
        addAward(ChristmasSlotConfig.SYMBOL_9, 5, 3000);
        
        addAward(ChristmasSlotConfig.SYMBOL_8, 2, 10);
        addAward(ChristmasSlotConfig.SYMBOL_8, 3, 60);
        addAward(ChristmasSlotConfig.SYMBOL_9, 4, 600);
        addAward(ChristmasSlotConfig.SYMBOL_9, 5, 4000);
        
    }
    
}
