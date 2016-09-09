public class Event {
  private String mEventName;
  private String mEventDate;
  private String mEventVenue;
  private int mEventType;

  public Event(String eventName, String eventDate, String eventVenue, int eventType) {
    mEventName = eventName;
    mEventDate = eventDate;
    mEventVenue = eventVenue;
    mEventType = eventType;
  }

  public String getEventName() {
    return mEventName;
  }

  public String getEventDate() {
    return mEventDate;
  }

  public String getEventVenue() {
    return mEventVenue;
  }

  public String getEventType() {
    return "";
  }
}
