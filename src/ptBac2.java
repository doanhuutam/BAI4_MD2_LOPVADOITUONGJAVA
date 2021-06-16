import java.util.Scanner;

public class ptBac2 {
    double a, b, c;

    public ptBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double gettbietso() {
        return (b * b) - (4 * a * c);
    }

    public double getno1() {
        if (this.gettbietso() > 0) {
            return (-this.b + Math.sqrt(this.gettbietso())) / (2 * this.a);
        } else {
            return 0;
        }
    }

    public double getno2() {
        if (this.gettbietso() > 0) {
            return (-this.b - Math.sqrt(this.gettbietso())) / (2 * this.a);
        } else {
            return 0;
        }
    }

    public double getno3() {
        if (this.gettbietso() == 0) {
            return (-this.b) / (this.a * this.a);
        } else {
            return 0;
        }
    }

   static class hihi {
        public static void main(String[] args) {
            Scanner pt = new Scanner(System.in);
            System.out.println("nhapsothu1");
            double a = pt.nextDouble();
            System.out.println("nhapsothu2");
            double b = pt.nextDouble();
            System.out.println("nhapsothu3");
            double c = pt.nextDouble();
            ptBac2 ptb2 = new ptBac2(a, b, c);
            System.out.println("phuong trinh co 2 ngiem" + ptb2.getno1() + " " + ptb2.getno2());
            System.out.println("phuong trinh co mot nghiem" + ptb2.getno3());


        }
    }
}







