public class Event {
  private String mEventName;
  private String mEventDate;

  public Event(String eventName, String eventDate) {
    mEventName = eventName;
    mEventDate = eventDate;
  }

  public String getEventName() {
    return mEventName;
  }

  public String getEventDate() {
    return mEventDate;
  }
}
