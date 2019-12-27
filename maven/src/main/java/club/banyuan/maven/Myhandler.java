package club.banyuan.maven;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class Myhandler extends DefaultHandler {
    private List list;
    private Student student;
    private String string;

    @Override
    public void startDocument() throws SAXException {
        list=new ArrayList();
    }

    @Override
    public void endDocument() throws SAXException {



    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println(1+qName);
        System.out.println();
        if(qName!=null) {
            string = qName;
            System.out.println(string);
            if (qName.equals("student")) {
                student = new Student();
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName!=null) {
            if (qName.equals("student")) {

                list.add(student);
            }
        }
        System.out.println(qName+2);
        System.out.println();
        //string=null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str=new String(ch,start,length);
        System.out.println(3);
        System.out.println();
        if (string!=null) {

            if (string.equals("name")) {
                student.setName(str);
            }
            if (string.equals("age")) {
                student.setAge(Integer.valueOf(str));
            }
            if (string.equals("address")) {
                student.setAddress(str);
            }
        }
    }

    public List getList() {
        return list;
    }
}
