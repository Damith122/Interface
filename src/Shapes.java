import java.sql.SQLOutput;

public interface Shapes {
    abstract  void getArea();

   default void getSides(){
        System.out.println("Sides of this shape : ");
    }
}
class Rectangle implements Shapes{
    @Override
    public void getArea() {
        int length = 10; int width = 5; int area = length * width;
        System.out.println("Area of Rectangle : "+ area);
    }

    @Override
    public void getSides() {
        System.out.println("I have 2 Sides");
    }
}

class Square implements Shapes{
    @Override
    public void getArea() {
        int length = 20;  int area = length * length;
        System.out.println("Area of Square : "+ area);
    }
}
class Test1{
    public static void main(String[] args) {
        Shapes r = new Rectangle();
        r.getArea();
        r.getSides();
        Shapes s = new Square();
        s.getArea();
    }
}
