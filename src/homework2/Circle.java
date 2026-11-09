package homework2;

public class Circle {
    double radius;

    Circle(double someRadius){
        this.radius = someRadius;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    void calculateArea(){
        System.out.println("Площадь круга = " + Math.PI*this.radius*this.radius);
    }

    void calculateCircumference(){
        System.out.println("Длина окружности = " + 2*Math.PI*this.radius);
    }
}
