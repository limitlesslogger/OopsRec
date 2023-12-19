import java.io.*;

class FileHandling{
    public static void write(){
        try{
            File f = new File("Readme.txt");

            if (f.createNewFile())
                System.out.println("File Has Been Created!");
            else
                System.out.println("File Already Exists!");

            FileWriter fw = new FileWriter("Readme.txt");
            fw.write("Hello World\nThis is inside a file!");
            fw.close();
        }
        catch(java.lang.Exception e){
            e.printStackTrace();
        }
    }

    public static void read(){
        try{
            File f = new File("Readme.txt");
            FileReader fr = new FileReader("Readme.txt");

            int data = fr.read();
            while (data != -1) {
                System.err.print((char)data);
                data = fr.read();
            }
            fr.close();
        }
        catch(java.lang.Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        write();
        read();
    }
}
