import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  private Event mEvent;

  @Before
  private void initialize() {
    mEvent = new Event("JavaMania - West");
  }

  public void getEventName_returnsName_String() {
    assertEquals("JavaMania - West", mEvent.getEventName());
  }
}
