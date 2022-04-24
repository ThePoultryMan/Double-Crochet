package io.github.thepoultryman.doublecrochet.registry;

import io.github.thepoultryman.doublecrochet.DoubleCrochet;
import io.github.thepoultryman.doublecrochet.item.CrochetHook;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final CrochetHook CROCHET_HOOK_45 = new CrochetHook(new Item.Settings().group(ItemGroup.TOOLS), 4.5f);
    public static final CrochetHook CROCHET_HOOK_5 = new CrochetHook(new Item.Settings().group(ItemGroup.TOOLS), 5f);

	public static void registerItems() {
        register("crochethook_45", CROCHET_HOOK_45);
        register("crochethook_5", CROCHET_HOOK_5);
	}

    private static void register(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(DoubleCrochet.MOD_ID, name), item);
    }
}
