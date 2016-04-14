/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.metropolitan.data_changer;

import java.util.Objects;

/**
 *
 * @author ladmin
 */
public abstract class AbstactDataSeperator {
    /**
     * read string
     */
private String input;
/**
 * empty constructor
 */
    public AbstactDataSeperator() {
    }
/**
 * constructor with parameters
 * @param input 
 */
    public AbstactDataSeperator(String input) {
        this.input = input;
    }
/**
 * hash code
 * @return 
 */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.input);
        return hash;
    }
/**
 * equals
 * @param obj
 * @return 
 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstactDataSeperator other = (AbstactDataSeperator) obj;
        if (!Objects.equals(this.input, other.input)) {
            return false;
        }
        return true;
    }

    /**
     * changes string to a object
     * @param data
     * @return
     */
    public abstract Object changeString(String data); 
    /**
     * changes string to a object
     * @param data
     * @return
     */
    public abstract Object changeString();

    /**
     * @return the input
     */
    public String getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    
}
