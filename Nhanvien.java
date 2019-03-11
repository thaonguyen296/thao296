package session2_lab;

import java.util.Scanner;

public class Nhanvien {
    public String name;
    public int age;
    public String address;
    public Double salary;
    public int time_work;

    public void inputInfo() {
        Scanner add = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien :");
        name = add.nextLine();

        System.out.println("Nhap tuoi :");
        age = add.nextInt();

        add.nextLine();
        System.out.println("Nhap dia chi nhan vien :");

        address = add.nextLine();
        System.out.println("Nhap luong nhan vien :");
        salary = add.nextDouble();

        System.out.println("Nhap so gio lam viec cua nhan vien :");
        time_work = add.nextInt();
    }

    public void printlnInfo() {
        System.out.println("Thông tin nhân viên: ");
        System.out.println("Tên : " + name);
        System.out.println("Tuổi:" + age);
        System.out.println("Địa chỉ:" + address);
        System.out.println("Lương: " + salary);
        System.out.println("Giờ làm việc: " + time_work);
    }

    public double tinhThuong() {
        double thuong = 0;
        if (time_work >= 200) {
            thuong = salary * 0.2;
            System.out.println("Thuởng: " + thuong);
        } else if (time_work >= 100 && time_work < 200) {
            thuong = salary * 0.1;
            System.out.println("Thuởng: " + thuong);
        } else {
            System.out.println("Không có thưởng");
        }
        return thuong;

    }

    public static void main(String[] args) {
        Nhanvien nhanvien1 = new Nhanvien();
        nhanvien1.inputInfo();
        nhanvien1.printlnInfo();
        nhanvien1.tinhThuong();
    }
}

