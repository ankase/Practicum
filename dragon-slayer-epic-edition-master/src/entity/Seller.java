package entity;

import world.npc.Vendor;

public interface Seller {
    String sell(Vendor.Goods goods);
}
