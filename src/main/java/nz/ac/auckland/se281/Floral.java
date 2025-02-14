package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.FloralType;

public class Floral extends Service {
  private FloralType type;

  public Floral(String bookingReference, String attendees, FloralType type) {
    super(bookingReference, attendees);
    this.type = type;
  }

  public String getTypeName() {
    return type.getName();
  }

  @Override
  public int cost() {
    return type.getCost();
  }
}
