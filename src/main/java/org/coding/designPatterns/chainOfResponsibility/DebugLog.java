package org.coding.designPatterns.chainOfResponsibility;

public class DebugLog extends LogProcessor{

    public DebugLog(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void printLog(int logLevel, String message){
        if(logLevel==DEBUG){
            System.out.println("DEBUG: "+ message);
        }
        else {
            super.printLog(logLevel, message);
        }
    }
}
