import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class HtmlParser {
    private StringBuffer html;
    public int HtmlParser(StringBuffer html){
       if(html == null){
           return -1;
       }
       this.html = new StringBuffer(html);
       return 0;
    }
    public StringBuffer getTag(String tagName){
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            //TODO add handler, read documentation...
        }
        catch (SAXException e){
            System.out.println(e);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        StringBuffer output = new StringBuffer();
        return output;
    }
}
