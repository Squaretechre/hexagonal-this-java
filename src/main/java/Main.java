import domain.HardcodedPoetryLibrary;
import domain.PoetryReader;
import infra.ConsoleAdapter;

public class Main {
    public static void main(String[] args) {
        PoetryReader poetryReader = new PoetryReader(new HardcodedPoetryLibrary());

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(poetryReader);

        consoleAdapter.ask();
    }
}
