package Facade.Debt;

import java.math.BigDecimal;
import java.util.Date;

public class Debt {

   private Long id;
   private DebtType debtType;
   private BigDecimal debtCost;
   private Date expirationDate;

    public Debt() { }

    public Debt(Long id, DebtType debtType, BigDecimal debtCost, Date expirationDate) {
        this.id = id;
        this.debtType = debtType;
        this.debtCost = debtCost;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DebtType getDebtType() {
        return debtType;
    }

    public void setDebtType(DebtType debtType) {
        this.debtType = debtType;
    }

    public BigDecimal getDebtCost() {
        return debtCost;
    }

    public void setDebtCost(BigDecimal debtCost) {
        this.debtCost = debtCost;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
