/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan;

import java.util.ArrayList;
import java.util.List;
import rs.metropolitan.data_changer.DataFactory;
import rs.metropolitan.data_changer.lists.ToList;

/**
 *
 * @author ladmin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewMain newM = new NewMain();
    }

    public NewMain() {
        DataFactory df = new DataFactory();
        String data0 = new String("{\"a\",\"b\",\"c\"}");
        String data1 = new String("{1,2,3,4,5}");
        String data2 = new String("1");
        String data3 = new String("1.25");
        //ToList change = new ToList();
        List<String> list = (ArrayList<String>) df.change(data0);
        //work.changeString(data);
        System.out.println(list);
        Integer val0 = (Integer) df.change(data2);
        System.out.println(val0);
        Double val1 = (Double) df.change(data3);
        System.out.println(val1);
    }

}
