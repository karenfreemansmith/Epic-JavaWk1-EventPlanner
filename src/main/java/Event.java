public class Event {
  private String mEventName;
  private String mEventDate;
  private String mEventVenue;

  public Event(String eventName, String eventDate, String eventVenue) {
    mEventName = eventName;
    mEventDate = eventDate;
    mEventVenue = eventVenue;
  }

  public String getEventName() {
    return mEventName;
  }

  public String getEventDate() {
    return mEventDate;
  }

  public String getEventVenue() {
    return "";
  }
}
