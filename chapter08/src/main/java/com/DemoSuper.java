class Box1 {
    double width;
    double height;
    double depth;



    Box1(Box1 ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }

    Box1(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }

    Box1(){
        width=-1;
        height=-1;
        depth=-1;


    }
    Box1(double len){
        width=height=depth=len;
    }

    double volume(){
        return width*height*depth;
    }
}
// class BoxWeight extends Box{
//double weight;
//BoxWeight(double w, double h, double d, double m){
//    width= w;
//    height = h;
//    depth=d;
//    weight = m;
//}
//
//}

class BoxWeight1 extends Box1{
    double weight;

    BoxWeight1(BoxWeight1 ob){

        super(ob);
        weight= ob.weight;
    }
    BoxWeight1(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }

    BoxWeight1(){
        super();
        weight=-1;
    }

    BoxWeight1(double len, double m){
        super((len));
        weight=m;
    }

}
class ColorBox1 extends Box{
    int color;

    ColorBox1(double w,double h, double d, int c){
        width = w;
        height = h;
        depth = d;
        color = c;

    }

}


class DemoSuper{
    public static void main(String [] args){

        BoxWeight1 mybox1 = new BoxWeight1(10,20,15,34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2,3,4,0.076);
        BoxWeight1 mybox3 =new BoxWeight1();
        BoxWeight1 mycube = new BoxWeight1(3,2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);


        double vol;


        vol = mybox1.volume();
        System.out.println("Обьем mbox1 равен " + vol);
        System.out.println("Вес mybox1 равен "+mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обьем mbox2 равен " + vol);
        System.out.println("Вес mybox2 равен "+mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Обьем mbox3 равен " + vol);
        System.out.println("Вес mybox3 равен "+mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Обьем myclone равен " + vol);
        System.out.println("Вес myclone равен "+myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Обьем mycube равен " + vol);
        System.out.println("Вес mycube равен "+mycube.weight);
        System.out.println();
    }

}