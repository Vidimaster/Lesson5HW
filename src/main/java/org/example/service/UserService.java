package org.example.service;

import org.example.Data.ComplexNumber;
import org.example.Data.NormalNumber;


import java.util.ArrayList;
import java.util.List;

public class UserService implements DateService{


    public NormalNumber create(String s1) {
        NormalNumber normalNumber =  new NormalNumber(s1);
        return normalNumber;
    }

    public ComplexNumber createComplexNumber(int real, int image) {
        ComplexNumber complexNumber = new ComplexNumber(real, image);
        return complexNumber;
    }


}
