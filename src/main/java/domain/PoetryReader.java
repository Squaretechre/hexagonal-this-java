package domain;

// Left side port
public class PoetryReader implements RequestVerses {
    private ObtainPoems poetryLibrary;

    public PoetryReader(ObtainPoems poetryLibrary) {
        this.poetryLibrary = poetryLibrary;
    }

    public String giveMeSomePoetry() {
        return poetryLibrary.getMeAPoem();
    }
}
