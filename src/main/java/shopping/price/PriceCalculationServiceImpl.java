package shopping.price;


import shopping.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class PriceCalculationServiceImpl implements PriceCalculationService {

    private Map<Product, DiscountPriceRule> discountRuleMap =  new HashMap<>();

    private DiscountPriceRule basePriceRule = new BasePriceRule();

    public PriceCalculationServiceImpl() {
      // Rules now can be added independently
        discountRuleMap.put(Product.MELON, new Buy1Get1FreeRule());
    }

    public DiscountPriceRule getDiscountRule(Product product) {

        DiscountPriceRule discountPriceRule =  discountRuleMap.get(product);
        if (discountPriceRule==null) {
            return basePriceRule;
        }
        return discountPriceRule;
    }
}

