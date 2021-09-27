package Facade.Debt;

public class PaymentInfoDto {

    private String name;
    private String cardNumber;
    private Long expirationMonth;
    private Long expirationYear;
    private Long cvvNo;

    public PaymentInfoDto(String name, String cardNumber, Long expirationMonth, Long expirationYear, Long cvvNo) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cvvNo = cvvNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Long expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public Long getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Long expirationYear) {
        this.expirationYear = expirationYear;
    }

    public Long getCvvNo() {
        return cvvNo;
    }

    public void setCvvNo(Long cvvNo) {
        this.cvvNo = cvvNo;
    }
}
