class ThrowDemo {
    static  void demoproc(){
        try{
            throw new NullPointerException("демонстрация");
        }
        catch (NullPointerException e){
            System.out.println("Исключение перехвачено в теле метода demoproc().");
            throw e; // еще раз сгенирированно
        }
    }
    public static void main(String args[]){
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("ПОвторный перехват - "+e);
        }
    }

}
