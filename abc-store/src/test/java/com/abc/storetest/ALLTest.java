package com.abc.storetest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccountTest.class, StoreTest.class, CustomerTest.class, DateUtilTest.class, TransactionTest.class })
public class ALLTest {

}
