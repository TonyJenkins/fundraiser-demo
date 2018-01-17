package fund.raising;

import java.util.ArrayList;
import java.util.Collections;

public class FundRaisingTeam {

    private static final String TEAM_NAME = "Poppleton Dogs Home";

    private ArrayList <FundRaiser> fundRaisers;

    public FundRaisingTeam () {
        fundRaisers = new ArrayList<> ();
    }

    public void addFundRaiser (FundRaiser fr) {
        this.fundRaisers.add (fr);
    }

    public void sortTeam () {
        Collections.sort (this.fundRaisers);
    }

    public double getTotalRaised () {

        double totalRaised = 0.0;

        for (FundRaiser fr : fundRaisers) {
            totalRaised += fr.getAmountRaised ();
        }

        return totalRaised;
    }

    private void printTeamHeader () {
        System.out.println (TEAM_NAME);
        for (int i = 0; i < TEAM_NAME.length (); i ++) {
            System.out.print ("=");
        }

        System.out.println ();
    }

    public void printTeam () {

        if (this.fundRaisers.isEmpty ()) {
            System.out.println ("No fund raisers in this team.");
        }
        else {
            printTeamHeader ();

            System.out.println ();

            for (FundRaiser fr : fundRaisers) {
                fr.printFormatted ();
            }
        }
    }
}
