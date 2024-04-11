package org.example.app.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserCreateView {

    // Отримуємо вхідні дані
    public Map<String, String> getData() {
        System.out.println("\nCREATE FORM");
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input firstName: ");
        map.put("firstName", scanner.nextLine().trim());
        System.out.print("Input email in format example@mail.com: ");
        map.put("email", scanner.nextLine().trim());
        return map;
    }

    // Виведення результату роботи програми
    public void getOutput(String output) {
        System.out.println(output);
    }
}
