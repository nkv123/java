/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import rs.metropolitan.data_changer.base.ToDouble;
import rs.metropolitan.data_changer.base.ToInteger;
import rs.metropolitan.data_changer.lists.ToList;

/**
 *
 * @author ladmin
 */
public class DataFactory {

    public Object work(String data) {
        String trim = data.trim();
        String seps = ",{}";
        if (StringUtils.contains(trim, seps)) {
            ToList lista = new ToList(trim);
            return lista.changeString();
        } else if (NumberUtils.isDigits(seps)) {
            return new ToInteger(trim);
        } 
        return data;

    }

}
