package infra;

public class ConsolePublicationStrategy implements WriteLines {
    public void writeLine(String text) {
        System.out.println(text);
    }
}
