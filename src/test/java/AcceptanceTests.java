import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AcceptanceTests {
    @Test
    public void should_give_verses_when_asked_for_poetry() {
        RequestVerses poetryReader = new PoetryReader();
        String verses = poetryReader.giveMeSomePoetry();
        String shikiPoem = "I want to sleep\nSwat the flies\nSoftly, please.\n\n-- Masaoka Shiki (1867 - 1902)";
        assertThat(verses, is(shikiPoem));
    }
}
