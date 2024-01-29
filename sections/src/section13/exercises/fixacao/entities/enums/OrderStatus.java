package section13.exercises.fixacao.entities.enums;

public enum OrderStatus {
    PENDING_PAYMENT("Pending Payment"),
    PROCESSING("Processing"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered");

    String displayName;

    OrderStatus(String displayName){
        this.displayName = displayName;
    }
}
