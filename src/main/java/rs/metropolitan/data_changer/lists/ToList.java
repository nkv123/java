/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import rs.metropolitan.data_changer.AbstactDataSeperator;

/**
 *
 * @author ladmin
 */
public class ToList extends AbstactDataSeperator {

    private ArrayList<String> ArraylistString;

    public ToList() {
        ArraylistString = new ArrayList<String>();
    }

    public ToList(String input) {
        super(input);
        ArraylistString = new ArrayList<String>();
    }

    @Override
    public String getInput() {
        return super.getInput(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInput(String input) {
        super.setInput(input); //To change body of generated methods, choose Tools | Templates.
    }

    public ToList(ArrayList<String> ArraylistString) {
        this.ArraylistString = ArraylistString;
    }

    public ToList(ArrayList<String> ArraylistString, String input) {
        super(input);
        this.ArraylistString = ArraylistString;
    }

    @Override
    public Object changeString(String data) {

        String seps = "{},";
        if (StringUtils.contains(data, seps)) {
            String[] split = StringUtils.split(data, seps);
            System.out.println("rs.metropolitan.data_changer.lists.ToList.changeString()"+split);
            ArraylistString.addAll(Arrays.asList(split));
        }
        return ArraylistString;
    }

    @Override
    public Object changeString() {
        return this.changeString(super.getInput());
    }

}
