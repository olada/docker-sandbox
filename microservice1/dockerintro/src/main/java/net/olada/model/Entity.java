package net.olada.model;

import java.math.BigDecimal;

/**
 * Created by David Olah on 05.05.2017.
 */
public class Entity {
    String feld1;
    String feld2;
    BigDecimal decimal1;

    public String getFeld1() {
        return feld1;
    }

    public void setFeld1(String feld1) {
        this.feld1 = feld1;
    }

    public String getFeld2() {
        return feld2;
    }

    public void setFeld2(String feld2) {
        this.feld2 = feld2;
    }

    public BigDecimal getDecimal1() {
        return decimal1;
    }

    public void setDecimal1(BigDecimal decimal1) {
        this.decimal1 = decimal1;
    }
}
