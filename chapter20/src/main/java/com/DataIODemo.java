import java.io.*;

class DataIODemo {
    public static void main(String args[]){
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(133);
            dout.writeBoolean(true);
        }catch (FileNotFoundException e){
            System.out.println("Нельзя открыть файл вывода");
            return;
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода "+e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){
            double d  = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Полученные значения - "+d+ " "+i+" "+b);
        }
        catch (FileNotFoundException e){
            System.out.println("Нельзя откурыть файл");
            return;
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода "+e);
        }

    }
}
