package ss4_md2;

public class bai3_ss4 {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public  bai3_ss4() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "speed: " + speed + "; color: " + color + "; radius: " + radius + "; fan is on";
        } else {
            return "color: " + color + "; radius: " + radius + "; fan is off";
        }
    }
    public static void main(String[] args) {
        bai3_ss4 fan1 = new bai3_ss4()  ;
        fan1.setSpeed(bai3_ss4 .FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        bai3_ss4 fan2 = new  bai3_ss4();
        fan2.setSpeed( bai3_ss4.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
