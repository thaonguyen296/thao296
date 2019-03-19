package assignment5;
import java.util.Scanner;
public class Person {
    public String name;
    public String sex;
    public String date;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Person(){

    }
    public Person(String name, String sex, String date, String address) {
        name = name;
        sex = sex;
        date = date;
        address = address;
    }
    public void inputInfo(){
        Scanner add = new Scanner(System.in);
        System.out.println("Ten la: ");
        name=add.nextLine();

        System.out.println("Gioi tinh la: ");
        sex=add.nextLine();

        System.out.println("Ngay sinh la: ");
        date=add.nextLine();

        System.out.println("Dia chi la: ");
        address=add.nextLine();
    }
    public void showInfo(){
        System.out.println("Thong tin: ");
        System.out.println("Ten la: " + name);
        System.out.println("Gioi tinh la: " + sex);
        System.out.println("Ngay sinh la: " + date);
        System.out.println("Dia chi la: " + address);
    }
}
