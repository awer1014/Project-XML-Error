import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import javax.xml.xpath.*;
public class LoadXml
{
    public static void getNode(File[] files, String path) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc;
            Node SourceCode;
            NodeList SourceCode_List;
            WriteToTxt wtt = new WriteToTxt();
            for (int i = 0; i < files.length ; i++ ) {
                System.out.println("檔案 : "+files[i].getName());
                doc = dBuilder.parse(files[i]);
                doc.getDocumentElement().normalize();
                //System.out.println("Root element : "+ doc.getDocumentElement().getNodeName());
                XPathFactory xpf = XPathFactory.newInstance();
                XPath xpath = xpf.newXPath();
                SourceCode_List = (NodeList) xpath.evaluate("/ErrorList/Errors/Error[@tpye != '校對:校對']", doc, XPathConstants.NODESET);
                String [] tokens = files[i].getName().split(".xml",2);
                wtt.writetxt(SourceCode_List, path, tokens[0]);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
