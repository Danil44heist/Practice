package homework2;

public class Point {
    private double x;
    private double y;

    Point(double someX, double someY){
        this.x = someX;
        this.y = someY;
    }

    double getX(){
        return this.x;
    }

    double getY(){
        return this.y;
    }

    void setX(double newX){
        this.x = newX;
    }

    void print(){
        System.out.println("X = " + this.x + ", Y = " + this.y);
    }
}
