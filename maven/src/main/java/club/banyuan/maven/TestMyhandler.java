package club.banyuan.maven;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestMyhandler {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        File file=new File("/Users/edz/Desktop/understand_Java/maven/x.xml");
        SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();

        SAXParser saxParser= saxParserFactory.newSAXParser();
        Myhandler myhandler=new Myhandler();

        saxParser.parse(file,myhandler);
        List list=myhandler.getList();
        for (Object o :list) {
            Student student=(Student)o;
            System.out.println(student.toString());
        }
    }
}
