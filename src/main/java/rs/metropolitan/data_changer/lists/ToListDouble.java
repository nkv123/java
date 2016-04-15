/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer.lists;

import java.util.ArrayList;
import rs.metropolitan.data_changer.AbstactDataSeperator;

/**
 *
 * @author ladmin
 */
public class ToListDouble extends AbstactDataSeperator {

    public ToListDouble() {
    }

    @Override
    public String getInput() {
        return super.getInput(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInput(String input) {
        super.setInput(input); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Double> changeString(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Double> changeString() {
        return changeString(getInput());
    }

}
