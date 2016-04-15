/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import rs.metropolitan.data_changer.base.ToInteger;
import rs.metropolitan.data_changer.lists.ToList;

/**
 *
 * @author ladmin
 */
public class DataFactory {

    public Object change(String data) {

        String trim = data.trim();
        System.out.println(trim);
        String[] seps = {",", "{", "}"};
        if (StringUtils.containsAny(trim, seps)) {
            ToList lista = new ToList();
            return lista.changeString(trim);
        } else if (false) {

        } else if (NumberUtils.isDigits(trim)) {
            ToInteger toint = new ToInteger();
            return toint.changeString(trim);
        } else if (StringUtils.isAlphanumericSpace(trim)) {
            return data;
        }
        return null;

    }

}
