class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("В теле метода throwOne()");
        throw  new IllegalAccessException("demonstration");
    }
    public static void main(String args[]){
        try{
            throwOne();
        } catch (IllegalAccessException e){
            System.out.println("ПЕрехвачено исключение - "+ e);
        }
    }
}
