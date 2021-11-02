import java.io.PrintStream;

class PrintfDemo {
    public static void main(String args[]){
        System.out.println("Ниже приведены некоторые числовые знамения в разных форматах.\n");
        PrintStream printf = System.out.printf("Разные целоцисленные форматы: ");
        System.out.printf("%d %(d %+d %05d\n", 3,   -3,  3,  3);
        System.out.println();
        System.out.printf("Формат чисел с плавающей точкой по умолчанию - %f \n", 124242424.2323);
        System.out.printf("Формат чисел с плавающей точкой, разделяемых запятыми - %,f \n", 124242424.2323);

        System.out.printf("Формат отрицательных чисел с плавающей точкой по умолчанию - %,f \n", -124242424.2323);
        System.out.printf("Другой формат отрицательных чисел с плавающей точкой по умолчанию - %,(f \n", -124242424.2323);
        System.out.println();
        System.out.printf("выравнивание положительных и отрицательных числовых значений - \n");
        System.out.printf("%,.2f\n% ,.2f\n",222.22, -34443.33);
    }
}
