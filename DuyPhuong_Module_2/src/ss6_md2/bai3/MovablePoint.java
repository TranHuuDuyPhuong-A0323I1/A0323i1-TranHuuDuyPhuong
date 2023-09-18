package ss6_md2.bai3;

public class MovablePoint  extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super (x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXspeed(){
        return xSpeed;
    }

    public float getYspeed(){
        return ySpeed;
    }

    public void setXspeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public void setYspeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed, float x, float y){
        setXY(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[] {getX(), getY(), xSpeed, ySpeed};
    }

    public void move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
