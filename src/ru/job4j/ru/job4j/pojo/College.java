package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Иван Иванович");
        student.setGroup("one");
        student.setYear(new Date(2018));

        System.out.println(student.getFio());
        System.out.println(student.getGroup());
        System.out.println(student.getYear());

    }
}
