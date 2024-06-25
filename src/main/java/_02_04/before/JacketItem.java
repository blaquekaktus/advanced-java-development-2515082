package _02_04.before;

import java.util.ArrayList;

public class JacketItem extends ClothingItem {

    @Override
    int getPrice() {
        return 25;
    }

    @Override
    String getName() {
        return "Jacket";
    }
}
