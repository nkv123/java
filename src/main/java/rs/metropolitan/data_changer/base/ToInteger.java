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
public class ToInteger extends AbstactDataSeperator {

    public ToInteger() {
    }

    public ToInteger(String input) {
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
        try {
            if (NumberUtils.isParsable(data)) {
                return Integer.parseInt(data);
            }
            return null;
        } catch (NumberFormatException ex) {
            System.err.println("bad string format");
            return ex.getMessage();
        } catch (Exception ex) {
            System.err.println(ex);
            return ex.toString();
        }

    }

    @Override
    public Object changeString() {
       return changeString(super.getInput());
    }

}
