package co.za.deposita.tddexample;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2014/01/07
 * Time: 9:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Dollar {
    public int amount;//Chapter 4; Privacy
    public Dollar(int Amount)
    {
        this.amount = Amount;

    }

    public Dollar times(int multiple)
    {
        return new Dollar(amount*multiple);
    }

    public boolean equals(Object object)
    {
        Dollar dollar = (Dollar) object;
        return amount== dollar.amount;
    }
}
