abstract class Figure1{
    double dim1;
    double dim2;

    Figure1(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle1 extends Figure1{
    Rectangle1(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("В области четырехугольника");
        return  dim1*dim2;
    }
}



class Triangle1 extends Figure1{
    Triangle1(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("В области треугольника");
        return  dim1*dim2/2;
    }
}


public class AbstractAreas {
    public static void main(String [] args){
        //Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;

        figref = r;
        System.out.println("Площадь равна "+figref.area());

        figref = t;
        System.out.println("Площадь равна "+figref.area());

    }
}
