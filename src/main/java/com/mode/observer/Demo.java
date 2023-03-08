package com.mode.observer;

public class Demo {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Buyer tanSir = new PhoneFans("果粉唐僧", shop);
        Buyer barJeet = new HandChopper("剁手族八戒", shop);
        shop.register(tanSir);
        shop.register(barJeet);
        // 商店到货
        shop.setProduct("猪肉炖粉条");
        shop.setProduct("水果手机【爱疯叉】");
    }
}
