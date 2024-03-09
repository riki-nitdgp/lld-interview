package org.coding.evenoddthread;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class State {
    private PrinterType nextToPrint;

    State(PrinterType nextToPrint) {
        this.nextToPrint =  nextToPrint;
    }
}
