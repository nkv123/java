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
    public ArrayList<String> changeString(String data) {
        String left = "{";
        String right = "}";
        String doubleQuote = "\"";
        String seps = ",";
        if (StringUtils.startsWith(data, left) && StringUtils.endsWith(data, right)) {
            String cleaned = StringUtils.remove(data, left);
            cleaned = StringUtils.remove(cleaned, right);
            cleaned = StringUtils.remove(cleaned, doubleQuote);
            System.out.println(cleaned);
            StringTokenizer st = new StringTokenizer(cleaned, seps);
            while (st.hasMoreTokens()) {
                ArraylistString.add(st.nextToken());
            }
        }
        return ArraylistString;
    }

    @Override
    public ArrayList<String> changeString() {
        return this.changeString(super.getInput());
    }

}
