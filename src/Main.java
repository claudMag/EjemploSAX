import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            SAXHandler saxHandler = new SAXHandler();
            saxParser.parse("src/concesionario.xml", saxHandler);

            List<Coche> concesionario = saxHandler.getConcesionario();

            for (Coche c: concesionario) {
                System.out.println("Coche ID: "+c.getId());
                System.out.println("Marca: "+c.getMarca());
                System.out.println("Modelo: "+c.getModelo());
                System.out.println("Cilindrada: "+c.getCilindrada());
                System.out.println("********************+");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}