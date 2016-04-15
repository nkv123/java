/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer.base;

import org.apache.commons.lang3.math.NumberUtils;
import rs.metropolitan.data_changer.AbstactDataSeperator;

/**
 *
 * @author ladmin
 */
public class ToDouble extends AbstactDataSeperator {

    public ToDouble() {
    }

    public ToDouble(String input) {
        super(input);
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
    public Object changeString(String data) {
        if (NumberUtils.isNumber(data)) {
            return Double.parseDouble(data);
        }
        return null;
    }

    @Override
    public Object changeString() {
        return changeString(super.getInput());
    }

}
