package cafe;
import java.math.BigDecimal;

public class Beverage extends Product { //extends Product == an example of inheritence
    public Beverage(String id, String name, BigDecimal basePrice) {
        super(id, name, basePrice); //dont fully know what a super class is, super class parameters must match with contorctors 

    }

    public BigDecimal price() {
        BigDecimal price =  this.getBasePrice().multiply(BigDecimal.valueOf(this.getQuality()));
        return price;
    }
}

