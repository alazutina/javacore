interface StringFunc2{
    String func(String n);
}

class MyStringOps {
    static  String strReverse(String str){
        String result = "";
        int i;
        for(i = str.length()-1;i>=0;i--) result += str.charAt(i);
        return  result;
    }
}

class MethodRefDemo{
    static String srtingOp(StringFunc2 sf, String s){
        return sf.func(s);
    }
    public static void main(String args[]){
        String inStr = "Лямбда-выражения повышают эффективность java";
        String outStr;
        outStr = srtingOp(MyStringOps::strReverse,inStr);

        System.out.println("Исходная строка " +inStr);
        System.out.println("Обращенная строка " +outStr);
    }
}
