package org.example.service;


import org.example.Data.ComplexNumber;
import org.example.Data.NormalNumber;

import java.util.List;

public interface DateService {
    //Answer create(String s1);
    NormalNumber create(String s1);

    ComplexNumber createComplexNumber(int real, int image);

}
