import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("");
    System.out.println("(¯`·._.·(¯`·._.·===============================·._.·´¯)·._.·´¯)");
    System.out.println("(¯`·._.·(¯`·._.· Welcome to Java Event Planner ·._.·´¯)·._.·´¯)");
    System.out.println("(¯`·._.·(¯`·._.·===============================·._.·´¯)·._.·´¯)");
    System.out.println("");

    System.out.println("");
    System.out.println("What type of event do you want to plan: ");
    System.out.println("(1) Conference");
    System.out.println("(2) Trade Show");
    System.out.println("(3) Seminar");
    System.out.println("(4) Happy Hour");
    System.out.println("[please enter number]");
    int eventType = Integer.parseInt(c.readLine());

    String eventName = c.readLine("What will you call your event? ");
    String eventDate = c.readLine("What date will your event begin? ");
    String eventVenue = c.readLine("Where would you like to hold your event? ");
    int eventLength = Integer.parseInt(c.readLine("How many days will your event last? "));
    int eventSize = Integer.parseInt(c.readLine("How many people do you expect to attend your event? "));
    int eventSpeakers = Integer.parseInt(c.readLine("How many speakers will you be hosting? "));
    int eventMeals = Integer.parseInt(c.readLine("How many meals will you be providing for your guests each day? "));
    int eventSnacks = Integer.parseInt(c.readLine("How many snacks (includes non-alcoholic beverages) will you be providing for your guests each day? "));
    int eventDrinks = Integer.parseInt(c.readLine("How many drinks (alcohol) will you be providing for your guests each evening? "));

    Event yourEvent = new Event(eventName, eventDate, eventVenue, eventType, eventLength, eventSize, eventSpeakers, eventMeals, eventSnacks, eventDrinks);

    System.out.println("");
    System.out.println("(¯`·._.·(¯`·._.·===============================·._.·´¯)·._.·´¯)");
    System.out.println("(¯`·._.·(¯`·._.·    Your Java Event Details    ·._.·´¯)·._.·´¯)");
    System.out.println("(¯`·._.·(¯`·._.·===============================·._.·´¯)·._.·´¯)");
    System.out.println("                  "+yourEvent.getEventName());
    System.out.println("                  "+yourEvent.getEventDate());
    System.out.println("                  "+yourEvent.getEventVenue());
    System.out.println("");
    System.out.println("(¯`·._.·(¯`·._.·===============================·._.·´¯)·._.·´¯)");
    System.out.println("(¯`·._.·(¯`·._.·     Your Java Event Costs     ·._.·´¯)·._.·´¯)");
    System.out.println("(¯`·._.·(¯`·._.·===============================·._.·´¯)·._.·´¯)");
    System.out.println("                The estimated cost of your event: ");
    System.out.println("                         $"+yourEvent.getEventTotalCost());
    System.out.println("");
    System.out.println("                Minimum ticket price required to  ");
    System.out.println("                break even on this event: ");
    System.out.println("                         $"+yourEvent.getEventCostEach());
    System.out.println("");
    System.out.println("(¯`·._.·(¯`·._.·===============================·._.·´¯)·._.·´¯)");
    System.out.println("(¯`·._.·(¯`·._.·   Your Saving Suggestions     ·._.·´¯)·._.·´¯)");
    System.out.println("(¯`·._.·(¯`·._.·===============================·._.·´¯)·._.·´¯)");
    System.out.println("");
    System.out.println("                "+yourEvent.getSavingsSuggestions()[0]);
    System.out.println("                "+yourEvent.getSavingsSuggestions()[1]);
    System.out.println("");



  }
}
