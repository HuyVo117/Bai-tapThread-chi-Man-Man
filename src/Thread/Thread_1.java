package Thread;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Thread_1 implements Runnable {
    

	public static void main(String[] args) {
        try {
            File xmlFile = new File("src/Thread/Student.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            
            NodeList studentList = doc.getElementsByTagName("sinhvien");
            List<student> students = new ArrayList<>();
             
            for (int i = 0; i < studentList.getLength(); i++) {
                Element studentElement = (Element) studentList.item(i);
                String id = studentElement.getAttribute("id");
                String name = studentElement.getElementsByTagName("name").item(0).getTextContent();
                String address = studentElement.getElementsByTagName("address").item(0).getTextContent();
                String dateOfBirth = studentElement.getElementsByTagName("dateOfBirth").item(0).getTextContent();
                
                student student = new student(id, name, address, dateOfBirth);
                students.add(student);
            }
            
            System.out.println("Danh sách sinh viên từ tệp Student.xml:");
            for (student student : students) {
                System.out.println(student);
            }
            
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
