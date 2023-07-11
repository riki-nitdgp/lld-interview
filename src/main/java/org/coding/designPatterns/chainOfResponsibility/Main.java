package org.coding.designPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLog(new DebugLog(new ErrorLog(null)));
        logger.printLog(LogProcessor.INFO, "This is Info Log");
        logger.printLog(LogProcessor.DEBUG, "This is Debug Log");
        logger.printLog(LogProcessor.ERROR, "This is Error Log");
    }
}
