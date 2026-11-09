package homework2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    int getWidth(){
        return this.width;
    }

    int getHeight(){
        return this.height;
    }

    void setWidth(int newWidth){
        this.width = newWidth;
    }

    void calculateArea(){
        //int s = this.width * this.height;
        //System.out.println("Площадь прямоугольника= " + s);
        System.out.println("Площадь прямоугольника = " + width * height);
    }
}
