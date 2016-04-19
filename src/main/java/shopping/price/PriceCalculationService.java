package shopping.price;

import shopping.domain.Product;

public interface PriceCalculationService {

    DiscountPriceRule getDiscountRule(Product product);
}
