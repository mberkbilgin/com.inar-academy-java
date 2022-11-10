package chapters.chapter10.exercises.exercise10_13;

import chapters.chapter10.exercises.exercise10_11.Circle2D;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0,0,1,1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getArea(){
        return getHeight() * getWidth();
    }
    public double getPerimeter(){
        return 2 * (getHeight() + getWidth());
    }
    public boolean contains(double x, double y) {
       if(x <= (getX() + (getWidth() / 2)) && x >= (getX() - (getWidth() / 2)) && y <= (getY() + (getHeight() / 2)) && y >= (getY() - (getHeight() / 2))){
           return true;
       }else{
           return false;
       }

    }
    public boolean contains(MyRectangle2D r) {
        if((r.getX() + (r.getWidth() /2)) <= (getX() + (getWidth() / 2)) && (r.getX() - (r.getWidth() / 2)) >= (getX() - (getWidth() / 2)) && r.getY() + (r.getHeight() / 2 ) <= (getY() + (getHeight() / 2)) && (r.getY() - (r.getHeight() / 2 )) >= (getY() - (getHeight() / 2))){
         return true;
        }else
            return false;
    }
    public boolean overlaps(MyRectangle2D r){
        if ((getY() + (getHeight() / 2) < r.getY() - (r.getHeight() / 2)) ||
                (getY() - (getHeight() / 2) > r.getY() + (r.getHeight() / 2)) ||
                (getX() + (getWidth() / 2) < r.getX() - (r.getWidth() / 2)) ||
                (getX() - (getWidth() / 2)) > r.getX() + (r.getWidth() / 2)) {
            return false;
        }
        return true;
    }
}
