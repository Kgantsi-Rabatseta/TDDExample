package co.za.deposita.tddexample;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2014/01/07
 * Time: 9:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Franc extends Money{
         //    Ch4
    public Franc(int Amount)
    {
        this.amount=Amount;
    }

    public Franc times(int multiple)
    {
        return new Franc(amount*multiple);
    }
}
