package com.lambton;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;
enum Gender
{
    Male,
    Female,
    Others
}

public class Student {
    int studentID;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Gender gender;
    float totalMarks;

    public void setData(
            int studentID,
            String firstName,
            String lastName,
            LocalDate birthDate,
            Gender gender,
            float totalMarks)
    {
        this.studentID=studentID;
        this.firstName= firstName;
        this.lastName = lastName;
        this.birthDate =birthDate;
        this.gender= gender;
        this.totalMarks = totalMarks;
    }

    public void printData()
    {
        System.out.println("StudentID = " + studentID);
        System.out.println("FirstName = " + firstName);
        System.out.println("LastName = " + lastName);
        System.out.println("BirthDate = " + birthDate);
        System.out.println("Gender = " + gender);
        System.out.println("TotalMarks" + totalMarks);
    }

}
