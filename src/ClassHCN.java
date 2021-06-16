import java.util.Scanner;

public class ClassHCN {
    double chieudai,chieurong;
    public ClassHCN(){

    }
    public ClassHCN(double chieudai,double chieurong){
        this.chieudai=chieudai;
        this.chieurong=chieurong;
    }
    public double getDientichHCN(){
        return this.chieudai*this.chieurong;
    }
    public double getChuviHCN(){
        return (chieudai+chieurong)/2;
    }
    public String display(){
        return "ClassHCN{"+"chieudai"+chieudai+",chieurong"+chieurong+"}";
    }
}

 class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double chieudai =scanner.nextDouble();
        System.out.println("nhap chieu rong");
        double chieurong=scanner.nextDouble();
        ClassHCN c2=new ClassHCN(chieudai,chieurong);
        System.out.println("hinh chu nhat cua ban"+c2.display());
        System.out.println("chu vi hinh chu nhat la"+c2.getChuviHCN());
        System.out.println("dien tinh hinh chux nhat la "+c2.getDientichHCN());
    }
}