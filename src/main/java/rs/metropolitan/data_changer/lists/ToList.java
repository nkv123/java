/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import javax.print.DocFlavor;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.lang3.text.StrTokenizer;
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
        String chars = ",{}";
        String seps = ",";
        if (StringUtils.contains(data, chars)) {
            String removeBrackheads = removeBrackheads(data);
            StringTokenizer st = new StringTokenizer(removeBrackheads, seps);
            while (st.hasMoreTokens()) {
                ArraylistString.add(st.nextToken());
            }
        }
        return ArraylistString;
    }

    public String removeBrackheads(String data) {
        String rems = "{";
        String str = StringUtils.remove(data, rems);
        rems = "}";
        return StringUtils.remove(str, rems);
    }

    @Override
    public Object changeString() {
        return this.changeString(super.getInput());
    }

}
