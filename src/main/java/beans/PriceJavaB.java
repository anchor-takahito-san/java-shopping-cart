package beans;

import java.io.Serializable;

public class PriceJavaB implements Serializable {

    // 値段
    private final int[] prices = {
        1000000000,
        1,
        0,
        0,
        1800,
        16777215,
        1000,
        3000,
        4500
    };

    // コンストラクタ
    public PriceJavaB() {}

    // getter
    public int getPrice(int n) {
        return prices[n];
    }
}