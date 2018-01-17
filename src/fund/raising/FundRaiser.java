package fund.raising;

import java.text.NumberFormat;
import java.util.Locale;

public class FundRaiser implements Comparable <FundRaiser> {

    private String name;
    private String id;
    private double amountRaised;

    public FundRaiser (String name, String id) {
        this.name = name;
        this.id = id;
        this.amountRaised = 0.0;
    }

    public FundRaiser (String name, String id, double amountRaised) {
        this.name = name;
        this.id = id;
        this.amountRaised = amountRaised;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public double getAmountRaised () {
        return this.amountRaised;
    }

    public void setAmountRaised (int amountRaised) {
        this.amountRaised = amountRaised;
    }

    @Override
    public String toString () {
        return "Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", amountRaised=" +  +
                '}';
    }

    public void printFormatted () {
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);
        final String formatString = "%-4s %-12s %8s";

        System.out.println (String.format (formatString, this.id, this.name, gb.format (this.amountRaised)));
    }

    @Override
    public int compareTo (FundRaiser fr) {
        if (fr.amountRaised > this.amountRaised) {
            return 1;
        }
        else if (fr.amountRaised < this.amountRaised) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
