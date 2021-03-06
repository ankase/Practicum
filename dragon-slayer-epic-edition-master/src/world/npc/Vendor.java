package world.npc;

import entity.Seller;

public class Vendor implements Seller {

    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }
    
    public enum Goods {
        POTION
    }
}
