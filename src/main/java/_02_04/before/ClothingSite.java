package _02_04.before;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAllItems(List<ClothingItem>clothing){
        for (ClothingItem item : clothing){
            checkoutItem(item);
        }
    }

     public static void main(String[] args) {
        ShirtItem shirtItem = new ShirtItem();
        checkoutItem(shirtItem);

        JacketItem jacketItem = new JacketItem();
        checkoutItem(jacketItem);

        List<ClothingItem>clothes = new ArrayList<>();
        clothes.add(shirtItem);
        clothes.add(jacketItem);

        checkoutAllItems(clothes);

    }



}
