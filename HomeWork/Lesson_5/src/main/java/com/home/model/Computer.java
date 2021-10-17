package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;     // процессор
    private int ram;            // оперативка
    private int hard;             // Жесткий
    private int resource = 5;
    private int countOn;            // счетчик включений
    private int countOff;         // счетчик выключений
    private boolean isLive = true;

    public Computer(String processor, int ram, int hard, int resource, int countOn, int countOff, boolean isLive) {
        this.processor = processor;
        this.ram = ram;
        this.hard = hard;
        this.resource = resource;
        this.countOn = countOn;
        this.countOff = countOff;
        this.isLive = isLive;
    }

    public void displayInfo() {
        System.out.printf("Proc: %s \topera: %d \thard: %d\n \tВключений: %d \tВыключений: %d \n \tРесурс : %d \t Флаг: %s", processor, ram, hard, countOn, countOff, resource, isLive);
    }

    public void on() {
        boolean resourceLive = isResourceLive();
        if (!resourceLive) {
            System.out.println("Компьютер сгорел!");
        } else {
            return;
        }

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("On. Внимание! Введите 0 или 1 :");
        int temp = scanner.nextInt();
        int randomInt = random.nextInt(1);
        if (temp == randomInt) {
            countOn++;
            off();
        } else {
            isLive = false;
        }
    }


    public void off() {
        boolean resourceLive = isResourceLive();
        if (!resourceLive) {
            System.out.println("Компьютер сгорел!");
        } else {
            return;
        }

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Off. Внимание! Введите 0 или 1 :");
        int temp = scanner.nextInt();
        int randomInt = random.nextInt(1);
        if (temp == randomInt) {
            countOff++;
        } else {
            isLive = false;
            System.out.println("Компьютер сгорел!");

        }
    }

    private boolean isResourceLive() {
        if (!isLive || (countOff + countOn) > resource) {
            isLive = false;
            return false;
        } else {
            return true;
        }
    }


    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", hard=" + hard +
                ", resource=" + resource +
                ", countOn=" + countOn +
                ", countOff=" + countOff +
                '}';
    }
}