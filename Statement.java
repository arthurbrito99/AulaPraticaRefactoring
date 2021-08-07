import java.util.Enumeration;

public abstract class Statement {
  
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getInitialString(aCustomer);
    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
        //show figures for this rental
        result += getFiguresString(each);
    }
    //add footer lines
    result += getOwedString(aCustomer);
    result += getEarnedString(aCustomer);
    return result;
  }

  protected abstract String getFiguresString(Rental aRental);
  protected abstract String getInitialString(Customer aCustomer);
  protected abstract String getOwedString(Customer aCustomer);
  protected abstract String getEarnedString(Customer aCustomer);
}