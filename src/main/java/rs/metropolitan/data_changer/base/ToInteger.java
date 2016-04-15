/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer.base;

import org.apache.commons.lang3.StringUtils;
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
    public Integer changeString(String data) {
        try {
            String dot = ".";
            if (StringUtils.isNumeric(data) && StringUtils.countMatches(data, dot) == 0) {
                return new Integer(data);
            }
            return null;
        } catch (NumberFormatException ex) {
            System.err.print(ex.getLocalizedMessage());
            return null;
        } catch (Exception ex) {
            System.err.print(ex.getLocalizedMessage());
            return null;
        }
    }

    @Override
    public Integer changeString() {
        return changeString(super.getInput());
    }

}
