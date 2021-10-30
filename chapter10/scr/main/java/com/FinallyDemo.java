class FinallyDemo {
    static void procA(){
        try{
            System.out.println("В теле метода procA()");
            throw new RuntimeException("демоснтрация");
        } finally {
            System.out.println("блок finally в методе procA()");

        }
    }

    static void procB(){
        try{
            System.out.println("В теле метода procB()");
            return;// throw new RuntimeException("демоснтрация");
        } finally {
            System.out.println("блок finally в методе procB()");

        }
    }

    static void procC(){
        try{
            System.out.println("В теле метода procC()");

        } finally {
            System.out.println("блок finally в методе procC()");

        }
    }
    public static  void main(String args[]){
        try {
            procA();
        }catch (Exception e){
            System.out.println("Исключение перехвачено");
        }
        procB();
        procC();
    }
}
