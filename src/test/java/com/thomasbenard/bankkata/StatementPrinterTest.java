package com.thomasbenard.bankkata;

import org.junit.Test;
import org.mockito.InOrder;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.mockito.Mockito.*;

public class StatementPrinterTest {

    private static final List<Transaction> NO_TRANSACTIONS = emptyList();
    private Console console = mock(Console.class);
    private StatementPrinter statementPrinter = new StatementPrinter(console);
    private final InOrder inOrder = inOrder(console);

    @Test
    public void always_prints_the_header() throws Exception {
        statementPrinter.print(NO_TRANSACTIONS);
        inOrder.verify(console).print("DATE | AMOUNT | BALANCE");
        inOrder.verifyNoMoreInteractions();
    }
}