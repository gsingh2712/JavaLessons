import java.io.*;
import java.util.Scanner;

public class FileReading {

    public File readFile(String absfileName) {
        // Get Class Loader Object
        ClassLoader classLoader = this.getClass().getClassLoader();
        File configfile = new File(classLoader.getResource(absfileName).getFile());
        return configfile;
    }

    public void sampleBufferedReader(File file) {
        try {
            BufferedReader buffR = new BufferedReader(new FileReader(file));
            String st;
            System.out.println(" ----- buffered Reader Start ------ ");
            while ( (st = buffR.readLine()) != null) {
                System.out.println(st);
            }
            System.out.println(" ----- buffered Reader End ------ ");
            buffR.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sampleSanneReader(File file)  {

        try {
            Scanner sc = new Scanner(file);
            System.out.println(" ----- Scanner Reader Start ------ ");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            System.out.println(" ----- Scanner Reader End ------ ");
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main (String args[]) {
        FileReading fileReading = new FileReading();
        // you shoud give complete path of the file inside resource folder
        File file = fileReading.readFile("config.txt");
        fileReading.sampleBufferedReader(file);
        fileReading.sampleSanneReader(file);
    }


}
