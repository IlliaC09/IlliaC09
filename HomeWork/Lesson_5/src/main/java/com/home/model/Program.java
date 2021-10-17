package com.home.model;

public class Program {
    public static void main(String[] args) {
        Computer lenovo = new Computer("toshiba", 256, 128, 5, 0, 0, true); // создание объекта
        lenovo.displayInfo();


        lenovo.on();
        lenovo.off();
        lenovo.displayInfo();
    }
}