import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main {
    /*TODO list for  my features
      1. only one A in 1st: "ABCD" => "BCD"
      2. only one A in 2nd: "BACD" => "BCD"
      3. two A's : "AACD" => "CD" || "AABAA" => "AABAA"
      4. length 0: "" => ""
      5. no A's in 1st two positions: "BBAA" => "BBAA"
      6. length 1 and A: "A" => ""
      7. length 1 and not A: "B" => "B"
     */
    Main pif;

    @BeforeEach
    public void setup() {
        pif = new Main();
    }

    @Test
    void onlyOneAin1stPosition() {
        assertEquals("BCD", PresentinFirst.removeAs("ABCD"));
    }

    @Test
    public void onlyOneAin2ndPosition() {
        assertEquals("BCD", PresentinFirst.removeAs("BACD"));
    }

    @Test
    public void twoAs() {
        assertEquals("CD", PresentinFirst.removeAs("AACD"));
        assertEquals("BAA", PresentinFirst.removeAs("AABAA"));
    }

    @Test
    public void emptyString() {
        assertEquals("",PresentinFirst.removeAs(""));
    }

    @Test
    public void noAsInFistTwoPositions() {
        assertEquals("BBAA", PresentinFirst.removeAs("BBAA"));
    }

    @Test
    public void lenght1AndA() {
        assertEquals("", PresentinFirst.removeAs("A"));
    }

    @Test
    public void lenght1AndNotA() {
        assertEquals("B", PresentinFirst.removeAs("B"));
    }

}