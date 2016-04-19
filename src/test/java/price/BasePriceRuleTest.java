package price;

import org.junit.Test;
import shopping.basket.BaseBasketTest;
import shopping.price.BasePriceRule;
import shopping.price.DiscountPriceRule;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BasePriceRuleTest extends BaseBasketTest {

    private final DiscountPriceRule discountPriceRule = new BasePriceRule();

    @Test
    public void basePriceZeroItemTest() {
        assertEquals(MELON_PRICE.multiply(BigDecimal.ZERO), discountPriceRule.getTotalPrice(0, MELON_PRICE));
    }

    @Test
    public void basePriceSingleItemTest() {
        assertEquals(MELON_PRICE.multiply(BigDecimal.ONE), discountPriceRule.getTotalPrice(1, MELON_PRICE));
    }

    @Test
    public void basePriceMultipleItemsTest() {
        assertEquals(MELON_PRICE.multiply(new BigDecimal(6)), discountPriceRule.getTotalPrice(6, MELON_PRICE));
    }
}


