package org.coding.designPatterns.chainOfResponsibility;

public class ErrorLog extends LogProcessor {
    public ErrorLog(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void printLog(int logLevel, String message){
        if(logLevel==ERROR){
            System.out.println("ERROR: "+ message);
        }
        else {
            super.printLog(logLevel, message);
        }
    }
}
