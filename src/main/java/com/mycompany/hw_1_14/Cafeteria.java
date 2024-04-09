/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw_1_14;

/**
 *
 * @author Jginyue B760M
 */
import java.util.concurrent.Semaphore;

public class Cafeteria {
    private Semaphore tableSemaphore = new Semaphore(2);

    public void enterCafeteria(Student student) throws InterruptedException {
        System.out.println(student.getName() + " ожидает");
        tableSemaphore.acquire();
    }

    public void eat(Student student) throws InterruptedException {
        System.out.println(student.getName() + " ест");
        Thread.sleep(3000);
    }

    public void exitCafeteria(Student student) {
        System.out.println(student.getName() + " вышел");
        tableSemaphore.release();
    }
}

