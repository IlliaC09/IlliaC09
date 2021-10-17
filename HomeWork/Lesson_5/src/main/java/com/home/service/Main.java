package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer lenovo = new Computer("lenovo", 256, 128, 3, 0, 0, true); // создание объекта
        lenovo.displayInfo();

        lenovo.off();
        lenovo.on();
        lenovo.displayInfo();
    }
}