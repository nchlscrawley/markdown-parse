import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testSnippet1() throws IOException {
        List<String> expected = List.of("`google.com");
        String contents= Files.readString(Path.of("snippet1.md"));
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet2() throws IOException {
        List<String> expected = List.of("a.com, a.com(()), example.com");
        String contents= Files.readString(Path.of("snippet2.md"));
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet3() throws IOException {
        List<String> expected = List.of("https://ucsd-cse15l-w22.github.io/");
        String contents= Files.readString(Path.of("snippet3.md"));
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }
}