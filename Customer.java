public class Customer {
public final CustomerId id;
public final PurchasePoint possessionPoint;
public Customer() {
id = new CustomerId();
possessionPoint = new PurchasePoint();
}
public boolean isEnabled() {
return true;
}
}
