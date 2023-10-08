package org.example;

import org.example.Data.ComplexNumber;
import org.example.controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        controller.sendRequest("6.7", "8.2");
        controller.sendRequest("13 + 1i", "7 - 6i");
        controller.sendRequest("6", "3");
        controller.sendRequest("13 + 1i", "7 - 6i");

        boolean flag = true;
        while (flag) {
            controller.sendRequest();
            switch (scanner.nextLine()){
                case ("1"):
                    System.out.println("Enter two numbers: ");
                    controller.sendRequest(scanner.nextLine(), scanner.nextLine());
                    break;
                case ("2"):
                    System.out.println("Change Operation to: add, sub, mul or div");
                    controller.setOp(scanner.nextLine());
                    break;
                case ("3"):
                    controller.showLog();
                    break;
                case ("4"):
                    flag = false;
                    break;
            }
        }
    }
}