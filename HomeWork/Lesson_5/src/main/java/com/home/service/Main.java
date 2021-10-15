package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer lenovo = new Computer("lenovo", 256, 128, 5, 0, 0, true); // создание объекта
        lenovo.displayInfo();

        lenovo.on();
        lenovo.off();
        lenovo.displayInfo();
    }
}