import java.util.Date;

public class stopwatch {
    double stattime,endtime;

    public stopwatch(){

    }
    public stopwatch(double stattime,double endtime){
        this.stattime=stattime;
        this.endtime=endtime;
    }

    public double getStattime() {
        return stattime;
    }

    public double getEndtime() {
        return endtime;
    }


   public void start(){
        this.stattime = new Date().getTime();
   }
   public void stop(){
        this.endtime = new Date().getTime();
   }
   public double getElap (){
        return this.endtime-this.stattime;
   }
}
class Test{
    public static void main(String[] args) {
        stopwatch gio =new stopwatch();
        gio.start();
        System.out.println("");
        gio.stop();
        System.out.println("gio " + gio.getElap());
    }
}
