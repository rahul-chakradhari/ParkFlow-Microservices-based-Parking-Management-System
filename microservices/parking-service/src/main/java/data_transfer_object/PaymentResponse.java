package data_transfer_object;

public class PaymentResponse {

    //variables
    private Double amount;
    private Boolean isSuccess;

    //constructors
    public PaymentResponse() {}

    public PaymentResponse(Double amount, Boolean isSuccess) {
        this.amount = amount;
        this.isSuccess = isSuccess;
    }

    //getters and setters
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Boolean getIsSuccess() {
        return isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
