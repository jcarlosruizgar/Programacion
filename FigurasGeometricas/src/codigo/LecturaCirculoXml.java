package codigo;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class LecturaCirculoXml {

    public static void main(String[] args) {
        int cordX,cordY,radio;
        try {
            File inputFile = new File("./circulos.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("circulo");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element circulo = (Element)nNode;
                    radio = Integer.parseInt(circulo.getAttribute("radio"));
                    cordX = Integer.parseInt(circulo.getElementsByTagName("cordenadaX").item(0).getTextContent());
                    cordY = Integer.parseInt(circulo.getElementsByTagName("cordenadaY").item(0).getTextContent());
                    System.out.println(new Circulo(cordX,cordY,radio));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
