interface StringFunc3{
    String func(String n);
}

class MyStringOps1 {
   String strReverse(String str){
        String result = "";
        int i;
        for(i = str.length()-1;i>=0;i--) result += str.charAt(i);
        return  result;
    }
}

class MethodRefDemo2{
    static String srtingOp(StringFunc3 sf, String s){
        return sf.func(s);
    }
    public static void main(String args[]){
        String inStr = "Лямбда-выражения повышают эффективность java";
        String outStr;
        MyStringOps1 strOps = new MyStringOps1();
        outStr = srtingOp(strOps::strReverse,inStr);

        System.out.println("Исходная строка " +inStr);
        System.out.println("Обращенная строка " +outStr);
    }
}
