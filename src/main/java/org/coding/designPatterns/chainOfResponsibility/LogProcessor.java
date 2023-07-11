package org.coding.designPatterns.chainOfResponsibility;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;


    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void printLog(int logLevel, String message) {
        if(nextLogProcessor!=null) {
            nextLogProcessor.printLog(logLevel, message);
        }
    }

}
