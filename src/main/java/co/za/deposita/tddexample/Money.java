package co.za.deposita.tddexample;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2014/01/07
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class Money {
    protected int amount;

    public boolean equals(Object object)
    {
        Money money = (Money)object;
        return amount== money.amount;

    }

}
