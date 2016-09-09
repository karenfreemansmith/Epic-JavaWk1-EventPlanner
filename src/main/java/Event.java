import java.util.Arrays;

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
  private int mEventDrinks;
  private int mEventTotalCost;

  public Event(String eventName, String eventDate, String eventVenue, int eventType, int eventLength, int eventSize, int eventSpeakers, int eventMeals, int eventSnacks, int eventDrinks) {
    mEventName = eventName;
    mEventDate = eventDate;
    mEventVenue = eventVenue;
    mEventType = eventType;
    mEventLength = eventLength;
    mEventSize = eventSize;
    mEventSpeakers = eventSpeakers;
    mEventMeals = eventMeals;
    mEventSnacks = eventSnacks;
    mEventDrinks = eventDrinks;
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
    } else if(mEventType==2) {
      return 6;
    } else if(mEventType==3) {
      return 18;
    } else if(mEventType==4) {
      return 2;
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
    } else if(mEventType==2) {
      return -250; // because at trade shows the speakers pay us to be there!!
    } else if(mEventType==3) {
      return 1500;
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
    } else if(mEventType==2) {
      return 25;
    } else if(mEventType==3) {
      return 40;
    } else if(mEventType==4) {
      return 12;
    } else {
      return 0;
    }
  }

  public int getEventSnacks() {
    return mEventSnacks;
  }

  public int getEventSnackCost() {
    if(mEventType==1) {
      return 15;
    } else if(mEventType==2) {
      return 10;
    } else if(mEventType==3) {
      return 20;
    } else if(mEventType==4) {
      return 5;
    } else {
      return 0;
    }
  }

  public int getEventDrinks() {
    return mEventDrinks;
  }

  public int getEventDrinkCost() {
    if(mEventType==1) {
      return 20;
    } else if(mEventType==2) {
      return 10;
    } else if(mEventType==3) {
      return 15;
    } else if(mEventType==4) {
      return 5;
    } else {
      return 0;
    }
  }

  public int getEventTotalCost() {
    mEventTotalCost = 0;
    mEventTotalCost += getEventLengthCost();
    mEventTotalCost += getEventSize() * getEventSizeCost() * getEventLength();
    mEventTotalCost += getEventSpeakers() * getEventSpeakerCost() * getEventLength();
    mEventTotalCost += getEventMeals() * getEventMealCost() * getEventSize() * getEventLength();
    mEventTotalCost += getEventSnacks() * getEventSnackCost() * getEventSize() * getEventLength();
    mEventTotalCost += getEventDrinks() * getEventDrinkCost() * getEventSize() * getEventLength();
    return mEventTotalCost;
  }

  public float getEventCostEach() {
    return (float) getEventTotalCost()/(float) getEventSize();
  }

  public String[] getSavingsSuggestions() {
    //String[] suggestions = { "eliminate meal (saves $1,500,000)", "reduce drinks (saves $600,000)" };
    String[] suggestions = { "", "" };
    int speakerSavings = getEventSpeakerCost()*getEventSpeakers();
    int mealSavings = getEventMealCost()*getEventMeals()*getEventSize()*getEventLength();
    int snackSavings = getEventSnackCost()*getEventSnacks()*getEventSize()*getEventLength();
    int drinkSavings = getEventDrinkCost()*getEventDrinks()*getEventSize()*getEventLength();
    int[] savings = { speakerSavings, mealSavings, snackSavings, drinkSavings };
    Arrays.sort(savings);

    if(savings[3]==drinkSavings) {
      if(mEventDrinks>1) {
        suggestions[0]=String.format("reduce drinks (saves $%d)", getEventDrinkCost()*getEventSize()*getEventLength());
      } else {
        suggestions[0]=String.format("eliminate drink (saves $%d)", getEventDrinkCost()*getEventSize()*getEventLength());
      }
    } else if(savings[3]==mealSavings) {
      if(mEventMeals>1) {
        suggestions[0]=String.format("reduce meals (saves $%d)", getEventMealCost()*getEventSize()*getEventLength());
      } else {
        suggestions[0]=String.format("eliminate meal (saves $%d)", getEventMealCost()*getEventSize()*getEventLength());
      }
    } else if(savings[3]==snackSavings) {
      if(mEventSnacks>1) {
        suggestions[0]=String.format("reduce snacks (saves $%d)", getEventSnackCost()*getEventSize()*getEventLength());
      } else {
        suggestions[0]=String.format("eliminate snack (saves $%d)", getEventSnackCost()*getEventSize()*getEventLength());
      }
    } else if(savings[3]==speakerSavings) {
      if(mEventSpeakers>1) {
        suggestions[0]=String.format("reduce speakers (saves $%d)", mEventSpeakers/2*getEventSpeakerCost()*getEventLength());
      } else {
        suggestions[0]=String.format("eliminate speaker (saves $%d)", getEventSpeakerCost()*getEventLength());
      }
    }

    if(savings[2]==drinkSavings) {
      if(mEventDrinks>1) {
        suggestions[1]=String.format("reduce drinks (saves $%d)", getEventDrinkCost()*getEventSize()*getEventLength());
      } else {
        suggestions[1]=String.format("eliminate drink (saves $%d)", getEventDrinkCost()*getEventSize()*getEventLength());
      }
    } else if(savings[2]==mealSavings) {
      if(mEventMeals>1) {
        suggestions[1]=String.format("reduce meals (saves $%d)", getEventMealCost()*getEventSize()*getEventLength());
      } else {
        suggestions[1]=String.format("eliminate meal (saves $%d)", getEventMealCost()*getEventSize()*getEventLength());
      }
    } else if(savings[2]==snackSavings) {
      if(mEventSnacks>1) {
        suggestions[1]=String.format("reduce snacks (saves $%d)", getEventSnackCost()*getEventSize()*getEventLength());
      } else {
        suggestions[1]=String.format("eliminate snack (saves $%d)", getEventSnackCost()*getEventSize()*getEventLength());
      }
    } else if(savings[2]==speakerSavings) {
      if(mEventSpeakers>1) {
        suggestions[1]=String.format("reduce speakers (saves $%d)", mEventSpeakers/2*getEventSpeakerCost()*getEventLength());
      } else {
        suggestions[1]=String.format("eliminate speaker (saves $%d)", getEventSpeakerCost()*getEventLength());
      }
    }

    return suggestions;
  }
}
