package by.it.kurmaz.jd02_09;

import java.io.File;

public class Runner {

    private static final String input = "src/by/it/kurmaz/jd02_09/Clients + xsd.xml";
    private static final String output = "src/by/it/kurmaz/jd02_09/ResultC.xml";
    private static final String txtOutput = "src/by/it/kurmaz/jd02_09/ResultC.txt";

    public static void main(String[] args) {
        Converter converter = ConverterFactory.getConverter(Direction.XML_TO_JSON, Clients.class);
        assert converter != null;
        converter.load(new File(input));
        converter.convert();
        System.out.println("Printing JSON");
        System.out.println(converter.getText());
        converter.save(new File(txtOutput));
        String json = converter.getText();
        converter = ConverterFactory.getConverter(Direction.JSON_TO_XML, Clients.class);
        assert converter != null;
        converter.load(json);
        converter.convert();
        converter.save(new File(output));
        System.out.println("Printing XML");
        System.out.println(converter.getText());
    }
}
