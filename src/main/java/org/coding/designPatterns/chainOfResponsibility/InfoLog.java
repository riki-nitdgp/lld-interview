package org.coding.designPatterns.chainOfResponsibility;

public class InfoLog extends LogProcessor{

    public InfoLog(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void printLog(int logLevel, String message){
        if(logLevel==INFO){
            System.out.println("INFO: "+ message);
        }
        else {
            super.printLog(logLevel, message);
        }
    }
}
