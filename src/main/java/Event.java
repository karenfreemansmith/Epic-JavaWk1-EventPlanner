public class Event {
  private String mEventName;
  private String mEventDate;
  private String mEventVenue;
  private int mEventType;
  private int mEventLength; //(length in days, 0 valid input for partial day event lasting less than 6 hours total)
  private int mEventSize;
  private int mEventSpeakers;
  private int mEventMeals;
  private int mEventSnacks;

  public Event(String eventName, String eventDate, String eventVenue, int eventType, int eventLength, int eventSize, int eventSpeakers, int eventMeals, int eventSnacks) {
    mEventName = eventName;
    mEventDate = eventDate;
    mEventVenue = eventVenue;
    mEventType = eventType;
    mEventLength = eventLength;
    mEventSize = eventSize;
    mEventSpeakers = eventSpeakers;
    mEventMeals = eventMeals;
    mEventSnacks = eventSnacks;
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
    if(mEventType==1) {
      return "Conference";
    } else {
      return "not a recognized event type";
    }
  }

  public int getEventTypeCost() {
    if(mEventType==1) {
      return 1500;
    } else {
      return 0;
    }
  }

  public int getEventLength() {
    return mEventLength;
  }

  public int getEventLengthCost() {
    if(mEventLength==0) {
      return getEventTypeCost()/3*2;
    } else {
      return mEventLength*getEventTypeCost();
    }
  }

  public int getEventSize() {
    return mEventSize;
  }

  public int getEventSizeCost() {
    if(mEventType==1) {
      return 12;
    } else {
      return 0;
    }
  }

  public int getEventSpeakers() {
    return mEventSpeakers;
  }

  public int getEventSpeakerCost() {
    if(mEventType==1) {
      return 500;
    } else {
      return 0;
    }
  }

  public int getEventMeals() {
    return mEventMeals;
  }

  public int getEventMealCost() {
    if(mEventType==1) {
      return 50;
    } else {
      return 0;
    }
  }

  public int getEventSnacks() {
    return mEventMeals;
  }

  public int getEventSnackCost() {
    if(mEventType==1) {
      return 50;
    } else {
      return 0;
    }
  }
}
