package com.gurukul.assignment5;

import java.util.Scanner;

class CompetitionLog {
    private int playerNumber;
    private String completeSets;
    private String incompleteSets;
    private int piecesBuilt;
    static int days;
    static int totalPieces;

    CompetitionLog(int playerName, String completeSets, String incompleteSets, int piecesBuilt) {
	this.playerNumber = playerName;
	this.completeSets = completeSets;
	this.incompleteSets = incompleteSets;
	this.piecesBuilt = piecesBuilt;
    }

    public int getPlayerNumber() {
	return playerNumber;
    }

    public String getCompleteSets() {
	return completeSets;
    }

    public void setCompleteSets(String completeSets) {
	this.completeSets = completeSets;
    }

    public String getIncompleteSets() {
	return incompleteSets;
    }

    public void setIncompleteSets(String incompleteSets) {
	this.incompleteSets = incompleteSets;
    }

    public int getPiecesBuilt() {
	return piecesBuilt;
    }

    public void setPiecesBuilt(int piecesBuilt) {
	this.piecesBuilt = piecesBuilt;
    }

    public String toString() {
	return "Player " + playerNumber + " completed the following sets: " + completeSets + "\n" + "Player "
		+ playerNumber + " did not completed the following sets: " + incompleteSets + "\n" + "Player "
		+ playerNumber + " built total of " + piecesBuilt + " pieces";

    }

    public String printResult(CompetitionLog t) {
	// TODO Auto-generated method stub
	String s = "Congratulations to player " + this.playerNumber + " for winning the Lego Set Competition!" + "\n"
		+ "Additional information about the competition results is below" + "\n" + "Player " + this.playerNumber
		+ " completed the following sets:" + this.completeSets + "\n" + "Player " + this.playerNumber
		+ " did not complet the following sets:" + this.incompleteSets + "\n" + "Player " + this.playerNumber
		+ " built a total of " + this.piecesBuilt + " pieces." + "\n"
		+ "Additional information about the competition results is below" + "\n" + "Player " + t.playerNumber
		+ " completed the following sets:" + t.completeSets + "\n" + "Player " + t.playerNumber
		+ " did not complete the following sets:" + t.incompleteSets + "\n" + "Player " + t.playerNumber
		+ " built a total of " + t.piecesBuilt + " pieces." + "\n" + "The competiton lasted " + days + " days.";
	return s;

    }

}

public class LegoSetCompetition {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the Lego Set Competition!");
	System.out.println("Enter the name of Lego Set 1");
	String legoSet1 = sc.nextLine();
	System.out.println("Enter the number of pieces in Lego Set 1");
	int legoPieces1 = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the name of Lego Set 2");
	String legoSet2 = sc.nextLine();
	System.out.println("Enter the number of pieces in Lego Set 2");
	int legoPieces2 = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the name of Lego Set 3");
	String legoSet3 = sc.nextLine();
	System.out.println("Enter the number of pieces in Lego Set 3");
	int legoPieces3 = sc.nextInt();

	CompetitionLog.totalPieces = legoPieces1 + legoPieces2 + legoPieces3;

	CompetitionLog x = new CompetitionLog(1, "", legoSet1 + " " + legoSet2 + " " + legoSet3, 0);
	CompetitionLog y = new CompetitionLog(2, "", legoSet1 + legoSet2 + legoSet3, 0);

	while (x.getPiecesBuilt() < CompetitionLog.totalPieces && y.getPiecesBuilt() < CompetitionLog.totalPieces) {
	    System.out.println("Enter the number of pieces player 1 used for building on day " + CompetitionLog.days);
	    int a = sc.nextInt();
	    System.out.println("Enter the number of pieces player 2 used for building on day " + CompetitionLog.days);
	    int b = sc.nextInt();

	    x.setPiecesBuilt(x.getPiecesBuilt() + a);
	    y.setPiecesBuilt(y.getPiecesBuilt() + b);

	    if (x.getPiecesBuilt() >= CompetitionLog.totalPieces && y.getPiecesBuilt() >= CompetitionLog.totalPieces) {
		x.setPiecesBuilt(0);
		y.setPiecesBuilt(0);
		System.out.println("The competition ended in a tie! There will be a tiebreaker round");
	    }
	    if (x.getPiecesBuilt() >= CompetitionLog.totalPieces) {
		System.out.println(x.printResult(y));
	    } else if (y.getPiecesBuilt() >= CompetitionLog.totalPieces) {
		System.out.println(y.printResult(x));
	    }
	    CompetitionLog.days++;
	}
    }

}