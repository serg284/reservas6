package video80;

//video80 , default
public class Main {

    public static void main(String[] args) {
    System.out.println("hello1");

        //lerSalas
        System.out.println("*** comeca lerSalas ***");
        lerSalas s = new lerSalas();
        s.openFile();
        s.readFile();
        s.closeFile();

        //lerReservas
        System.out.println("*** comeca lerReservas ***");
        lerReservas r = new lerReservas();
        r.openFile();
        r.readFile();
        r.closeFile();

        //criarOutput
        System.out.println("*** comeca criarOutput ***");
        criarOutput g = new criarOutput();
        g.openFile();
        g.addRecords();
        g.closeFile();




    }
}
