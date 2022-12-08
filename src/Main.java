import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println("boi what the hell boi");

        //filecreation

       try {
        File filetest = new File ("filetest.txt");
        if (filetest.createNewFile()){
        System.out.println("File created: " + filetest.getName());
        } else {
        System.out.println("File already exists");
        }
        } catch(IOException e) {
        System.out.println("error occurred");
        e.printStackTrace();
        }


//filewriting

        try{
           FileWriter write = new FileWriter("filetest.txt");
           write.write("attempt numero uno/dawdadwadaw");
           write.close();
           System.out.println("written.");
        } catch(IOException e){
        System.out.println("error lol");
        e.printStackTrace();}


        //string concatenation

        //String bababooey = "Bababooey";
        //String bruh = "bruh";
        //String both_tings = bababooey +"/"+ bruh;
        //System.out.println(both_tings);


        //filereading
        FileReader read = new FileReader("filetest.txt");
        int line;
        String cutoff = "/";
        String bruh = "";
        while ((line = read.read()) != -1) && (boolean cut = true){
        System.out.println((char)line);
        if (cutoff.equals((char)line)) {
        boolean cut = true;
        break;
        }
        bruh = bruh + (char)line;
        System.out.println(bruh);}

        System.out.println("successfully read.");



    }
}