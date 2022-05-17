package codigo;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Principal {

    public static void main(String[] args) {

        try {
            File inputFile = new File("./departamentos.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Elemento raiz :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("departamento");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nElemento actual :" + nNode.getParentNode().getNodeName());
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element departamento = (Element)nNode;
                    System.out.println("Numero de departamento "+departamento.getAttribute("deptno"));
                    System.out.println("Departamento de "+departamento.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.println("Localizado en "+departamento.getElementsByTagName("loc").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
