/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hw_1_14;

/**
 *
 * @author Jginyue B760M
 */
public class HW_1_14 {

    public static void main(String[] args) {
        System.out.println("Балковский Александр, РИБО-02-22, вариант 2");
        Cafeteria cafeteria = new Cafeteria();

        Student[] students = new Student[7];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Студент № " + (i + 1), cafeteria);
            new Thread(students[i]).start();
        }
    }
}
