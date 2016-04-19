package shopping.basket;

import shopping.domain.Item;
import shopping.domain.Product;

import java.math.BigDecimal;

public abstract class BaseBasketTest {

    public static final BigDecimal BANANA_PRICE = new BigDecimal("1.60");
    public static final BigDecimal APPLE_PRICE = new BigDecimal("0.55");
    public static final BigDecimal ORANGE_PRICE = new BigDecimal("2.55");
    public static final BigDecimal LEMON_PRICE = new BigDecimal("0.25");
    public static final BigDecimal PEACH_PRICE = new BigDecimal("1.27");

    public static final BigDecimal MELON_PRICE = new BigDecimal("5.27");

    public final Item banana = new Item(Product.BANANA, BANANA_PRICE);
    public final Item apple = new Item(Product.APPLE, APPLE_PRICE);
    public final Item orange = new Item(Product.ORANGE, ORANGE_PRICE);
    public final Item lemon = new Item(Product.LEMON, LEMON_PRICE);
    public final Item peach = new Item(Product.PEACH, PEACH_PRICE);

    public final Item melon = new Item(Product.MELON, MELON_PRICE);

    static final Integer TOTAL_ITEMS = 2;

}
