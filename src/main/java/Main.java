import domain.PoetryReader;
import infra.ConsoleAdapter;
import infra.PoetryLibraryResourceFileAdapter;

public class Main {
    public static void main(String[] args) {
        PoetryReader poetryReader = new PoetryReader(new PoetryLibraryResourceFileAdapter("rimbaud.txt"));

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(poetryReader);

        consoleAdapter.ask();
    }
}
