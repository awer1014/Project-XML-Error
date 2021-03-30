import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main
{
    private static String Filepath = "";
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
    private static LoadXml lx;
    private static XmlFileSearch xfs;
    private static File inputFile;
    private static File[] files;
    
    public static void main (String [] args) {
        try {
            Filepath = in.readLine();
            files = xfs.getXmlFileList(Filepath);
            lx.getNode(files,Filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
