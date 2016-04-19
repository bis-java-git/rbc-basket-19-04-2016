package price;

import org.junit.Test;
import shopping.domain.Product;
import shopping.price.BasePriceRule;
import shopping.price.Buy1Get1FreeRule;
import shopping.price.PriceCalculationService;
import shopping.price.PriceCalculationServiceImpl;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class PriceCalculationServiceTest {

    private PriceCalculationService priceCalculationService = new PriceCalculationServiceImpl();

    @Test
    public void getDiscountRuleTest() {
        assertNotNull(priceCalculationService.getDiscountRule(Product.APPLE));
        assertThat(priceCalculationService.getDiscountRule(Product.APPLE), instanceOf(BasePriceRule.class));
        assertThat(priceCalculationService.getDiscountRule(Product.MELON), instanceOf(Buy1Get1FreeRule.class));
    }
}
