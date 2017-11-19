package com.thomasbenard.bankkata;

import org.junit.Test;
import org.mockito.InOrder;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

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

    @Test
    public void prints_one_transaction() throws Exception {
        List<Transaction> transactions = singletonList(new Transaction("13/11/2017", 200));
        statementPrinter.print(transactions);
        inOrder.verify(console).print("DATE | AMOUNT | BALANCE");
        inOrder.verify(console).print("13/11/2017 | 200 | 200");
        inOrder.verifyNoMoreInteractions();
    }
}