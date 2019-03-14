package session3_lab;
import java.util.Scanner;
public class Phanso {
    private int tuso;
    private int mauso;

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public Phanso(){
        this.Nhap();
    }

    public Phanso(int tuso, int mauso){
        this.setTuso(tuso);
        this.setMauso(mauso);
    }

    public void Nhap(){
        Scanner info = new Scanner(System.in);
        System.out.println("Nhap tu so roi nhap mau so:");
        this.tuso = info.nextInt();
        this.mauso = info.nextInt();
    }

    public void Inphanso(){
        System.out.println("Phan so: "+this.tuso+"/"+this.mauso);
    }

    //Tim uoc chung lon nhat 2 so a, b
    public int UCLN(int a, int b){
        if (a==0){
            return b;
        } else {
            return this.UCLN(b%a, a);
        }
    }

    public void Rutgon(){
        int ucln = this.UCLN(this.tuso, this.mauso);
        this.tuso = this.tuso / ucln;
        this.mauso = this.mauso / ucln;
        System.out.print("Rut gon: ");
        this.Inphanso();
    }

    public void Nghichdao(){
        int temp = this.tuso;
        this.tuso = this.mauso;
        this.mauso = temp;
        System.out.print("Nghich dao: ");
        this.Inphanso();
    }

    public static void main(String[] args){
        Phanso nhapps = new Phanso();
//        Phanso ps = new Phanso(6,9);
        nhapps.Inphanso();
        nhapps.Rutgon();
        nhapps.Nghichdao();
    }
}
