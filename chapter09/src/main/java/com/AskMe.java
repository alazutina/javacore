import java.util.Random;

interface SharedConstant
{
int NO=0;
int YES = 1;
int MAYBE =2;
int LATER = 3;
int SOON =4;
int NEVER = 5;

}

class Qustion implements SharedConstant{
    Random rand = new Random();
    int ask(){
        int prob = (int) (100*rand.nextDouble());
        if(prob<30)
            return NO;
        else if(prob<60)
            return YES;
        else if(prob<75)
            return LATER;
        else if(prob<98)
            return SOON;
        else
            return NEVER;
    }

}

public class AskMe implements SharedConstant {

    static void answer(int result){
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;

            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }


    public static void main(String[] args){
      Qustion q = new Qustion();

      answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }
}
