package beans;

import java.io.Serializable;

public class NameJavaB implements Serializable {

    // 値段
    private final String[] names = {
    	"ベッカムの剃刀",
    	"オッカムの剃刀",
    	"クセノフォンのストーク日記",
    	"ソクラテス直筆の自著（偽物）",
    	"ユニクロのワンピース",
    	"ONE PIECE（本物）",
    	"ダミー７",
    	"ダミー８",
    	"ダミー９"
    };

    // コンストラクタ
    public NameJavaB() {}

    // getter
    public String getName(int n) {
        return names[n];
    }
}