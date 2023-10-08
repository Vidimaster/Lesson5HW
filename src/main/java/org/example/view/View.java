package org.example.view;
import org.example.Data.NormalNumber;

import java.util.List;

public class View {
    public void showResult(String n1, String n2, String n3, String op){

        System.out.println(n1 + " " + op + " " + n2 + " = " + n3);
    }

public void showMenu(String op){
    System.out.println("Operation is: " + op + "\n1 - Enter numbers \n 2 - Change Operation \n 3 - Show Log \n 4 - Quit" );
}

    public void showLog(List<String> log) {
        System.out.println(log);
    }
}
