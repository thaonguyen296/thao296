package session2_lab;

import java.util.Scanner;
public class Student {
    public String MaSV;
    public float DiemTB;
    public int age;
    public String grade;

    public void inputInfo(){
        Scanner add= new Scanner(System.in);
        System.out.println("MaSV: ");
        MaSV= add.nextLine();

        System.out.println("DiemTB: ");
        DiemTB=add.nextFloat();

        System.out.println("Age: ");
        age=add.nextInt();

        grade=add.nextLine();
        System.out.println("Grade: ");
        grade=add.nextLine();
    }
    public void showInfo(){
        System.out.println("Thong tin sinh vien");
        System.out.println("MaSV: "+ MaSV);
        System.out.println("DiemTB: "+ DiemTB);
        System.out.println("Age: "+ age);
        System.out.println("Grade: "+grade);
    }
    public void xetHB(){
        if (DiemTB>8.0){
            System.out.println("Dat hoc bong");
        }
        else {
            System.out.println("Khong dat hoc bong");
        }
    }

    public static void main(String[] args) {
        Student hocsinh = new Student();
        hocsinh.inputInfo();
        hocsinh.showInfo();
        hocsinh.xetHB();
    }
}
