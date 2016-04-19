package shopping.basket;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

public class ShoppingBasketTest extends BaseBasketTest {

    private final ShoppingBasket shoppingBasket = new ShoppingBasket();

    @Test
    public void addItemTest() {
        shoppingBasket.addItem(banana);
        assertEquals(shoppingBasket.calculateTotalPrice(), BANANA_PRICE);

        shoppingBasket.addItem(banana);
        assertEquals(BANANA_PRICE.multiply(new BigDecimal(TOTAL_ITEMS)), shoppingBasket.calculateTotalPrice());
    }

    @Test
    public void emptyBasketTest() {
        assertEquals(BigDecimal.ZERO, shoppingBasket.calculateTotalPrice());
    }
}
