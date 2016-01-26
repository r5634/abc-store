package com.abc.storetest;

import com.abc.ShoppingCart;

public class ShoppingCartTest {

ShoppingCart cart;

@Before
public void setUp(){
    cart = new ShoppingCart();
}

@Test
public void addOneItemToCart() {
    cart.add("Bread");
    assertThat(cart.getTotalItems(), is(1));
    assertThat(cart.doesContain("Bread"), is(true));
}

@Test
public void addTwoItemsToCart(){
    cart.add("Bread");
    cart.add("Milk");
    assertThat(cart.getTotalItems(), is(2));
    assertTrue(cart.doesContain("Bread"));
    assertTrue(cart.doesContain("Milk"));
}

@Test
public void addThreeItemsToCart(){
    cart.add("Bread");
    cart.add("Milk");
    cart.add("Banana");
    assertThat(cart.getTotalItems(), is(3));
    assertTrue(cart.doesContain("Bread"));
    assertTrue(cart.doesContain("Milk"));
    assertTrue(cart.doesContain("Banana"));
}

@Test
public void addAnItemTwice(){
    cart.add("Bread");
    cart.add("Bread");
    assertThat(cart.getTotalItems(), is(2));
}

@Test
public void checkOutOneItem(){
    cart.add("Bread");
    assertThat(cart.checkout(), is(1.0));
}

@Test
public void checkoutTwoSeparateItems(){
    cart.add("Bread");
    cart.add("Milk");
    assertThat(cart.checkout(), is(1.60));
}

@Test
public void checkoutThreeSeparateItems(){
    cart.add("Bread");
    cart.add("Milk");
    cart.add("Banana");
    assertThat(cart.checkout(), is(2.0));
}

@Test
public void checkoutTwoSameItems(){
    cart.add("Bread");
    cart.add("Bread");
    assertThat(cart.checkout(), is(2.0));
}

@Test
public void checkoutThreeItems(){
    cart.add("Bread");
    cart.add("Bread");
    cart.add("Milk");
    assertThat(cart.checkout(), is(2.6));
}

@Test
public void checkoutManyItems(){
    cart.add("Bread");
    cart.add("Bread");
    cart.add("Milk");
    cart.add("Milk");
    cart.add("Banana");
    assertThat(cart.checkout(), is(3.60));
}

@Test 
public void checkOutAnInvalidItem(){
    cart.add("InvalidItem");
    assertThat(cart.checkout(),is(0.0));
}}
