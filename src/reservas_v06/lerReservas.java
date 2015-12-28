package video80;

import java.io.File;
import java.util.Scanner;

public class lerReservas {

    private Scanner x ;

    public void openFile(){
        try{
            x = new Scanner(new File("reservas.txt"));
        }
        catch(Exception e){
            System.out.println("no file");
        }
    }


    public void readFile(){
        while (x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();
            String d = x.next();
            System.out.printf("%s %s %s %s\n", a,b,c,d);
        }
    }
    public void closeFile() {
        x.close();
    }


}
