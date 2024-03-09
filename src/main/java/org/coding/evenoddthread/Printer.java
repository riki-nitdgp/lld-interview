package org.coding.evenoddthread;


import lombok.SneakyThrows;

public class Printer implements Runnable {
    private final int step;
    private final State state;
    private int currentValue;
    private final PrinterType currentPrinterType;
    private final PrinterType nextPrinterType;
    private final int maxValue;

    public Printer(int step, int currentValue, State state, PrinterType currentPrinterType, PrinterType nextPrinterType,
                   int maxValue) {
        this.step = step;
        this.state = state;
        this.currentValue = currentValue;
        this.currentPrinterType = currentPrinterType;
        this.nextPrinterType = nextPrinterType;
        this.maxValue = maxValue;
    }

    @Override
    @SneakyThrows
    public void run() {
        while (currentValue <= maxValue) {
            synchronized (state) {
                while (this.currentPrinterType != state.getNextToPrint()) {
                    state.wait();
                }
                System.out.println(currentPrinterType.toString() + ": " + currentValue);
                currentValue += step;
                state.setNextToPrint(this.nextPrinterType);
                state.notifyAll();
            }
        }
    }
}
