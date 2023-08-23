package section13.exercises.fixacao.entities;

import section13.exercises.fixacao.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    static SimpleDateFormat formatDateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    static SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment = new Date();
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(){}

    public Order(Date moment, OrderStatus status, List<OrderItem> items, Client client) {
        this.moment = moment;
        this.status = status;
        this.items = items;
        this.client = client;
    }


    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for(OrderItem o : items){
            sum += o.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + formatDateTime.format(moment) + "\n");
        sb.append("Order status: " + getStatus().name() + "\n");
        sb.append("Client: " + client.getName() + " (" + formatDate.format(client.getBirthDate()) + ") " + " - " + client.getEmail() + "\n");
        sb.append("\nOrdered items: \n");

        for ( OrderItem i : items){
            sb.append(i.getProduct().getName() + ", ");
            sb.append("$" + String.format("%.2f", i.getProduct().getPrice()) + ", ");
            sb.append("Quantity: " + i.getQuantity() + ", ");
            sb.append("Subtotal: $" + String.format("%.2f",i.subTotal()) + "\n");
        }

        sb.append("Total price: $" + String.format("%.2f", total()));

        return sb.toString();
    }
}
