public class Box {
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
    }

//    void setDim(double w, double h, double d){
//        width=w;
//        height=h;
//        depth=d;
//
//    }
Box(){
        System.out.println("Конструирование объекта Box");
        width=10;
        height=10;
        depth=10;
}
}
