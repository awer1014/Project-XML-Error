import java.io.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WriteToTxt
{
    public static void writetxt(NodeList SourceCode_List, String path, String filename) {
        try {
            String file = filename + ".txt";
            File f = new File(path,file);
            f.createNewFile();
            
            BufferedWriter out = new BufferedWriter(new FileWriter(f));
            for (int j = 0; j < SourceCode_List.getLength() ; j++ ) {
                Node SourceCode = SourceCode_List.item(j);
                out.write(" <BOC> ");
                String[] ct = (SourceCode.getTextContent().split("\n"));
                for(int i =0; i < ct.length; i++){
                    out.write(ct[i]);
                    out.write(" <CR> ");
                }
                out.write(" <EOC> ");
            }
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
