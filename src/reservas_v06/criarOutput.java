package reservas_v06;

import java.io.*;
import java.lang.*;
import java.util.*;

public class criarOutput {

    private Formatter x;
    public void openFile(){
        try{
            x = new Formatter("output.txt");
        }
        catch(Exception e){
            System.out.println("you have an error");
        }

    }

    public void addRecords(){
        x.format("%s %s %s", "20", "bucky", "roberts");
    }

    public void closeFile(){
        x.close();
    }

}
