import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {

    private List<Customer> customers;

    public Shop() {
        customers = new ArrayList<>();
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void sortByName(List<Customer> list) {
        Comparator<Customer> comparator = Comparator.comparing(Customer::getSurname).thenComparing(Customer::getName);
        list.stream().sorted(comparator).forEach(System.out::println);
    }

    public void filterByCard(long start, long end) {
        customers.stream().filter(x ->  x.getCardNumber() >= start && x.getCardNumber() <= end).forEach(System.out::println);
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
