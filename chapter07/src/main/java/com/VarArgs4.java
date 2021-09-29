class VarArgs4 {



    static void vaTest(int ... v){
        System.out.print("vaTeset(int...)"+ "Количество аргументов: " +v.length+" Содержимое: ");
        for (int x:v)
            System.out.print(x+" ");
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.print("vaTeset(boolean...)"+"Количество аргументов: " +v.length+" Содержимое: ");
        for (boolean x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    static void vaTest(String msg, int ... v){
        System.out.print("vaTeset(String, int...)"+msg +v.length+" Содержимое: ");
        for (int x:v)
            System.out.print(x+" ");
        System.out.println();
    }


    public static void main(String[] args){
        vaTest(1,2,3);
        vaTest();
        vaTest(true,false,false);
    }


}
