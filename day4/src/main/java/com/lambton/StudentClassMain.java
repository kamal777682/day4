package com.lambton;

import java.time.LocalDate;
import java.time.Month;

public class StudentClassMain {
    public static void main(String[] args)
    {

        Student[] listOfStudents = new Student[2];
        Arithmetic arithmetic = new Arithmetic ();

         //First Student Object
        LocalDate s1BirthDate = LocalDate.of(1981, Month.FEBRUARY, 20);
        Student s1 = new Student(1, "kamalpreet", "kaur", s1BirthDate, Gender.FEMALE,
                new float[]{70.0f, 80f, 70, 70, 70});

        listOfStudents[0] = s1;

        //NullPointerException
        // listOfStudents[0].printData();

        //Second Student Object
        LocalDate s2BirthDate = LocalDate.of(1992, Month.MARCH, 25);
        Student s2 = new Student(2, "Priyanka", "Sharma", s2BirthDate, Gender.MALE,
                new float[]{50.0f, 80.0f, 50, 70, 60});

        listOfStudents[1] = s2;

        for (Student s : listOfStudents)
        {
            s.calculateTotalMarks();
            s.calculatePercentage();
            s.calculateResult();
            s.printData();
        }
        System.out.println("Sum of Two Numbers : " + arithmetic.add ( 6,5 )); //Adding two integers
        System.out.println("Sum of Two Numbers : " + arithmetic.add ( 6.5f,7.89f));// Adding two floats
        System.out.println("Sum of a num  and a String : : " + arithmetic.add(6,"hello"));
        System.out.println("Sum of Two strings : " + arithmetic.add ("kamalpreet"," kaur "));
    }
}



