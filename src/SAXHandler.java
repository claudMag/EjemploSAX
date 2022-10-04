import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXHandler extends DefaultHandler {

    private List<Coche> concesionario = null;
    private Coche coche = null;
    private String elementValue;

    @Override
    public void startDocument() throws SAXException {
        concesionario = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("coche")){
            coche = new Coche();
            if (attributes.getLength() > 0){
                String id = attributes.getValue("id");
                coche.setId(Integer.parseInt(id));
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("coche")){
            concesionario.add(coche);
        }

        if (qName.equalsIgnoreCase("marca")){
            coche.setMarca(elementValue);
        }

        if (qName.equalsIgnoreCase("modelo")){
            coche.setModelo(elementValue);
        }

        if (qName.equalsIgnoreCase("cilindrada")){
            coche.setCilindrada(Float.parseFloat(elementValue));
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        elementValue = new String(ch, start, length);
    }

    public List<Coche> getConcesionario() {
        return concesionario;
    }
}
