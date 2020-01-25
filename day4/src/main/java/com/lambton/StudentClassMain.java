package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class StudentClassMain {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        LocalDate s1birthDate = LocalDate.of(1998,02,20);
        s1.setData(1,"Kamalpreet","Kaur",s1birthDate,Gender.Female,75);
         s1.printData();
        Student s2 = new Student();
        LocalDate s2birthDate = LocalDate.of(1996,07,24);
        s2.setData(2,"manpreet","Kaur",s2birthDate,Gender.Female,75);
        s2.printData();

    }
}
