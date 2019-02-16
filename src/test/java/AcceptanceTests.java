import domain.ObtainPoems;
import domain.PoetryReader;
import domain.RequestVerses;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// RequestVerses - left side port, first test
// ObtainPoems - right side port, second test
// domain.PoetryReader - the hexagon
public class AcceptanceTests {
    @Test
    public void should_give_verses_when_asked_for_poetry() {
        RequestVerses poetryReader = new PoetryReader(new HardcodedPoetryLibrary());
        String verses = poetryReader.giveMeSomePoetry();
        String shikiPoem = "I want to sleep\nSwat the flies\nSoftly, please.\n\n-- Masaoka Shiki (1867 - 1902)";
        assertThat(verses, is(shikiPoem));
    }

    @Test
    public void should_give_verses_when_asked_for_poetry_with_the_support_of_a_poetry_library() {
        ObtainPoems poetryLibrary = mock(ObtainPoems.class);
        String alistairPoem = "If you could read a leaf or tree\nyou'd have no need of books.\n-- Alistair Cockburn (1987)";
        when(poetryLibrary.getMeAPoem()).thenReturn(alistairPoem);

        PoetryReader poetryReader = new PoetryReader(poetryLibrary);
        String verses = poetryReader.giveMeSomePoetry();
        assertThat(verses, is(alistairPoem));
    }
}

