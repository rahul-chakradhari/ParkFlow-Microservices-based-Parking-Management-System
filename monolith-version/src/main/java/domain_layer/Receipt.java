<<<<<<< HEAD
package domain_layer;

import jakarta.persistence.Entity;

@Entity
public class Receipt {
    //variables
    private String id;
    private String ticketId;
    private Boolean totalAmount;
    private String exitTime;

   //getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public Boolean getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Boolean totalAmount) {
        this.totalAmount = totalAmount;
    }
    public String getExitTime() {
        return exitTime;
    }
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    //constructors
    public Receipt() {
        super();
    }
    public Receipt(String id, String ticketId, Boolean totalAmount, String exitTime) {
        super();
        this.id = id;
        this.ticketId = ticketId;
        this.totalAmount = totalAmount;
        this.exitTime = exitTime;
    }
}

=======
package domain_layer;

import jakarta.persistence.Entity;

@Entity
public class Receipt {
    //variables
    private String id;
    private String ticketId;
    private Boolean totalAmount;
    private String exitTime;

   //getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public Boolean getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Boolean totalAmount) {
        this.totalAmount = totalAmount;
    }
    public String getExitTime() {
        return exitTime;
    }
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    //constructors
    public Receipt() {
        super();
    }
    public Receipt(String id, String ticketId, Boolean totalAmount, String exitTime) {
        super();
        this.id = id;
        this.ticketId = ticketId;
        this.totalAmount = totalAmount;
        this.exitTime = exitTime;
    }
}

>>>>>>> 9780f22bce0d570e8526a7f6ef38dc2af128417f
