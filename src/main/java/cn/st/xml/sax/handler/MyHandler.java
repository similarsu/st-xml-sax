package cn.st.xml.sax.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 * @author coolearth
 * 
 */
public class MyHandler extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        // TODO Auto-generated method stub
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        // TODO Auto-generated method stub
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        // TODO Auto-generated method stub
        System.err.print("Element: " + qName + ", attr: ");
        print(attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        // TODO Auto-generated method stub
        super.endElement(uri, localName, qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        // TODO Auto-generated method stub
        super.characters(ch, start, length);
    }

    private void print(Attributes attrs) {
        if (attrs == null) return;
        System.err.print("[");
        for (int i = 0; i < attrs.getLength(); i++) {
            System.err.print(attrs.getQName(i) + " = " + attrs.getValue(i));
            if (i != attrs.getLength() - 1) {
                System.err.print(", ");
            }
        }
        System.err.println("]");
    }
}
