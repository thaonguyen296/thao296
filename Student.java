package assignment5;

import java.util.Scanner;

public class Student extends Person {
    public int age;

    public void kiemtraTuoi(){
        if (age >= 18){
            System.out.println("Da du 18 tuoi");
        }else{
            System.out.println("Chua du 18 tuoi");
        }
    }

    public Student(String name, String sex, String date, String address, int age) {
        super(name, sex, date, address);
        this.age = age;
    }

}
