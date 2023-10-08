package org.example.Data;

import java.util.*;

import static java.lang.Double.parseDouble;

public class NormalNumber  {


    private String num;

    public NormalNumber(String s1) {
        this.num = s1;
    }

    public NormalNumber add(NormalNumber n2) {
        double result = Double.parseDouble(this.num) + parseDouble(n2.toString());
        NormalNumber n3 = new NormalNumber(String.valueOf(result));
        return n3;
    }

    public NormalNumber substract(NormalNumber n2) {
        double result = Double.parseDouble(this.num) - parseDouble(n2.toString());
        NormalNumber n3 = new NormalNumber(String.valueOf(result));
        return n3;
    }

    public NormalNumber multiply(NormalNumber n2) {
        double result = Double.parseDouble(this.num) * parseDouble(n2.toString());
        NormalNumber n3 = new NormalNumber(String.valueOf(result));
        return n3;
    }

    public NormalNumber divide(NormalNumber n2) {
        double result = Double.parseDouble(this.num) / parseDouble(n2.toString());
        NormalNumber n3 = new NormalNumber(String.valueOf(result));
        return n3;
    }

    @Override
    public String toString() {
        return this.num;
    }


}