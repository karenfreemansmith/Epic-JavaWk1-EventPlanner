import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  private Event mEvent;

  @Before
  public void initialize() {
    mEvent = new Event("JavaMania - West", "October 17, 2017", "Oregon Convention Center", 1, 3, 10000, 60, 1, 2, 2);
  }

  @Test
  public void getEventName_returnsName_String() {
    assertEquals("JavaMania - West", mEvent.getEventName());
  }

  @Test
  public void getEventDate_returnsDate_String() {
    assertEquals("October 17, 2017", mEvent.getEventDate());
  }

  @Test
  public void getEventVenue_returnsVenue_String() {
    assertEquals("Oregon Convention Center", mEvent.getEventVenue());
  }

  @Test
  public void getEventType_returnsType_String() {
    assertEquals("Conference", mEvent.getEventType());
  }

  @Test
  public void getEventTypeCost_returnsBaseEventCost_int() {
    assertEquals(1500, mEvent.getEventTypeCost());
  }

  @Test
  public void getEventLength_returnsEventLength_int() {
    assertEquals(3, mEvent.getEventLength());
  }

  @Test
  public void getEventLengthCost_returnsEventLengthBaseCost_int() {
    assertEquals(4500, mEvent.getEventLengthCost());
  }

  @Test
  public void getEventSize_returnsEventSize_int() {
    assertEquals(10000, mEvent.getEventSize());
  }

  @Test
  public void getEventSizeCost_returnsEventSizeCostPerPersonPerDay_int() {
    assertEquals(12, mEvent.getEventSizeCost());
  }

  @Test
  public void getEventSpeakers_returnsNumberOfEventSpeakers_int() {
    assertEquals(60, mEvent.getEventSpeakers());
  }

  @Test
  public void getEventSpeakerCost_returnsEventSpeakerCostPerPersonPerDay_int() {
    assertEquals(500, mEvent.getEventSpeakerCost());
  }

  @Test
  public void getEventMeals_returnsNumberOfMealsPerDay_int() {
    assertEquals(1, mEvent.getEventMeals());
  }

  @Test
  public void getEventMealCost_returnsEventCostPerPersonPerMeal_int() {
    assertEquals(50, mEvent.getEventMealCost());
  }

  @Test
  public void getEventSnacks_returnsNumberOfSnacksPerDay_int() {
    assertEquals(2, mEvent.getEventSnacks());
  }

  @Test
  public void getEventSnackCost_returnsEventCostPerPersonPerSnack_int() {
    assertEquals(15, mEvent.getEventSnackCost());
  }

  @Test
  public void getEventDrinks_returnsNumberOfDrinksPerDay_int() {
    assertEquals(2, mEvent.getEventDrinks());
  }

  @Test
  public void getEventDrinkCost_returnsEventCostPerPersonPerDrink_int() {
    assertEquals(20, mEvent.getEventDrinkCost());
  }

  @Test
  public void getEventTotalCost_returnsTotalCostOfEvent_int() {
    assertEquals(4054500, mEvent.getEventTotalCost());
  }
}
