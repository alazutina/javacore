public class Break {
    public static void main(){
        boolean t = true;

        first:{
            second:{
                third:{
                    System.out.println("Предшествует оператору break.");
                    if(t) break second;
                    System.out.println("Оператор больше не будет выполняться");
                }

            }  System.out.println("Оператор больше не будет выполняться");
        }System.out.println("Этот оператор следует за блоком second");
    }
}
