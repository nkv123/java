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
    public Double changeString(String data) {
        try {
            String dot = ".";
            String beforeDot = StringUtils.substringBefore(data, dot);
            String afterDot = StringUtils.substringBefore(data, dot);
            if (StringUtils.isNumeric(beforeDot) && StringUtils.isNumeric(afterDot)
                    && StringUtils.countMatches(data, dot) == 1) {
                return new Double(data);
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
    public Double changeString() {
        return changeString(super.getInput());
    }

}
