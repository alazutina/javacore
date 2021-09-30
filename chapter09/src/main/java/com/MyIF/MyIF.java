package MyIF;

public interface MyIF{
    int getNumber();
    default  String getString(){
        return "Объескт типа String по умолчанию";
    }
}
