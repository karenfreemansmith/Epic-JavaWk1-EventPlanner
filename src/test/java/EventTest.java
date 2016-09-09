import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  private Event mEvent;

  @Before
  public void initialize() {
    mEvent = new Event("JavaMania - West");
  }

  @Test
  public void getEventName_returnsName_String() {
    assertEquals("JavaMania - West", mEvent.getEventName());
  }
}
