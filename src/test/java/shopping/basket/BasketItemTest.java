package shopping.basket;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class BasketItemTest extends BaseBasketTest {

    private final BasketItem basketItem = new BasketItem(banana);

    @Test
    public void getItemTest() {
        assertNotNull(basketItem.getItem());
    }

    @Test
    public void getTotalPriceTest() {
        assertEquals(basketItem.getTotalPrice(), BANANA_PRICE);
    }

    @Test
    public void incrementQuantityTest() {
        basketItem.incrementQuantity();
        assertEquals(basketItem.getTotalPrice(), BANANA_PRICE.multiply(new BigDecimal(TOTAL_ITEMS)));
    }
}
