package infra;

import domain.RequestVerses;
import domain.WriteLines;

public class ConsoleAdapter {
    private RequestVerses poetryReader;
    private WriteLines publicationStrategy;

    public ConsoleAdapter(RequestVerses poetryReader, WriteLines publicationStrategy) {
        this.poetryReader = poetryReader;
        this.publicationStrategy = publicationStrategy;
    }

    public void ask() {
        // Adapt from infrastructure to domain logic

        // Business logic
        String verses = poetryReader.giveMeSomePoetry();

        // Adapt from domain to infrastructure
        publicationStrategy.writeLine(verses);
    }
}
