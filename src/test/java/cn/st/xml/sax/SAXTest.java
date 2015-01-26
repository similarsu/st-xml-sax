package cn.st.xml.sax;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.junit.Test;
import org.xml.sax.SAXException;

import cn.st.xml.sax.handler.MyHandler;

public class SAXTest {
	@Test
	public void read(){
		try {  
            SAXParserFactory factory = SAXParserFactory.newInstance();  
            SAXParser parser = factory.newSAXParser();  
            InputStream in = this.getClass().getClassLoader().getResourceAsStream("university.xml");  
            parser.parse(in, new MyHandler());  
        } catch (ParserConfigurationException e) {  
            e.printStackTrace();  
        } catch (SAXException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
	}
	@Test
	public void write(){
		System.err.println("纯SAX对于写操作无能为力");
	}
	
}
