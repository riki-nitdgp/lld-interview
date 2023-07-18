package org.coding.systemDesign.AtmMachine;

import org.coding.systemDesign.AtmMachine.AtmState.AtmStates;
import org.coding.systemDesign.AtmMachine.AtmState.IdleState;

public class Atm {

    private String atmCode;
    private int atmBalance;
    private AtmStates currentAtmState;

    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    Atm(String atmCode, int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes,
                int noOfOneHundredNotes) {
        this.currentAtmState = new IdleState();
        this.atmCode = atmCode;
        setAtmBalance(atmBalance, noOfTwoThousandNotes, noOfFiveHundredNotes, noOfOneHundredNotes);
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes,
                              int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void setCurrentATMState(AtmStates currentATMState) {
        this.currentAtmState = currentATMState;
    }

    public AtmStates getCurrentATMState() {
        return currentAtmState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }


}
