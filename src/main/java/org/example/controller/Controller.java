package org.example.controller;

import org.example.Data.ComplexNumber;
import org.example.Data.NormalNumber;
import org.example.service.DateService;
import org.example.service.UserService;
import org.example.view.View;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    DateService dateService;
    View view;
    List<String> log;
    String op;

    static List<String> ops = new ArrayList<>(List.of("add", "sub", "mul", "div"));
    public Controller() {
        this.dateService = new UserService();
        this.view = new View();
        this.log = new ArrayList<>();
        this.op = "add";
    }

    public void setOp(String op) {
        if (ops.contains(op) == false) {
            this.op = "add";
        } else {
            this.op = op;
        }
    }

    public void sendRequest(String s1, String s2) {
        String op = "";
        if (s1.contains("i")) {
            s1 = s1.replace("i", "");
            s1 = s1.replace(" + ", " ");
            s1 = s1.replace(" - ", " -");
            s2 = s2.replace("i", "");
            s2 = s2.replace(" + ", " ");
            s2 = s2.replace(" - ", " -");
            String[] res = s1.split(" ");
            ComplexNumber complexNumber = dateService.createComplexNumber(Integer.valueOf(res[0]), Integer.valueOf(res[1]));
            res = s2.split(" ");
            ComplexNumber complexNumber2 = dateService.createComplexNumber(Integer.valueOf(res[0]), Integer.valueOf(res[1]));
            ComplexNumber complexNumber3 = dateService.createComplexNumber(1, 1);

            switch (this.op) {
                case ("add"):
                    complexNumber3 = complexNumber.add(complexNumber2);
                    op = "+";
                    break;
                case ("sub"):
                    complexNumber3 = complexNumber.substract(complexNumber2);
                    op = "-";
                    break;
                case ("mul"):
                    complexNumber3 = complexNumber.multiply(complexNumber2);
                    op = "*";
                    break;
                case ("div"):
                    complexNumber3 = complexNumber.divide(complexNumber2);
                    op = ":";
                    break;
            }
            log.add("(" + complexNumber.toString() + ")" + " " + op + " " + "(" + complexNumber2.toString() + ")" + " = " + complexNumber3.toString() + "\n");
            view.showResult("(" + complexNumber.toString() + ")", "(" + complexNumber2.toString() + ")", complexNumber3.toString(), op);
        } else {
            NormalNumber normalNumber = dateService.create(s1);
            NormalNumber normalNumber2 = dateService.create(s2);
            NormalNumber normalNumber3 = dateService.create("0");
            switch (this.op) {
                case ("add"):
                    normalNumber3 = normalNumber.add(normalNumber2);
                    op = "+";
                    break;
                case ("sub"):
                    normalNumber3 = normalNumber.substract(normalNumber2);
                    op = "-";
                    break;
                case ("mul"):
                    normalNumber3 = normalNumber.multiply(normalNumber2);
                    op = "*";
                    break;
                case ("div"):
                    normalNumber3 = normalNumber.divide(normalNumber2);
                    op = ":";
                    break;
            }
            log.add(normalNumber.toString() + " " + op + " " + normalNumber2.toString() + " = " + normalNumber3.toString() + "\n");
            view.showResult(normalNumber.toString(), normalNumber2.toString(), normalNumber3.toString(), op);
        }

    }

    public void sendRequest() {
        view.showMenu(this.op);
    }

    public void showLog() {
        view.showLog(log);
    }
}
