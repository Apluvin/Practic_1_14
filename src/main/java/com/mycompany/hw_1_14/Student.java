/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw_1_14;
import java.io.*;
import java.util.*;

/**
 *
 * @author Jginyue B760M
 */
public class Student implements Runnable {
    private String name;
    private Cafeteria cafeteria;

    public Student(String name, Cafeteria cafeteria) {
        this.name = name;
        this.cafeteria = cafeteria;
    }

    @Override
    public void run() {
        try {
            cafeteria.enterCafeteria(this);
            cafeteria.eat(this);
            cafeteria.exitCafeteria(this);
        } catch (InterruptedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public String getName() {
        return name;
    }
}

