package infra;

import domain.RequestVerses;

public class ConsoleAdapter {
    private RequestVerses poetryReader;
    private WriteLines publicationStrategy;

    public ConsoleAdapter(RequestVerses poetryReader, WriteLines publicationStrategy) {
        this.poetryReader = poetryReader;
        this.publicationStrategy = publicationStrategy;
    }

    public void ask() {
        // 1. Adapt from infrastructure to domain logic

        // 2. Business logic
        String verses = poetryReader.giveMeSomePoetry();

        // 3. Adapt from domain to infrastructure
        publicationStrategy.writeLine(verses);
    }
}
