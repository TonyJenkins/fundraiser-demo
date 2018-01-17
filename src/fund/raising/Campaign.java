package fund.raising;

import java.text.NumberFormat;
import java.util.Locale;

public class Campaign {

    public static void main (String[] args) {

        FundRaisingTeam theTeam = new FundRaisingTeam ();

        theTeam.addFundRaiser (new FundRaiser ("Fred", "FR01", 55.32));
        theTeam.addFundRaiser (new FundRaiser ("Jim", "JI02", 62.23));
        theTeam.addFundRaiser (new FundRaiser ("Alice", "AL03", 34.34));
        theTeam.addFundRaiser (new FundRaiser ("Jane", "JA14", 72.99));
        theTeam.addFundRaiser (new FundRaiser ("Emily", "EM25", 89.50));

        theTeam.sortTeam ();
        theTeam.printTeam ();

        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        System.out.println ();
        System.out.println ("Total Amount Raised: " + gb.format (theTeam.getTotalRaised ()));

    }
}
