package io.github.thepoultryman.doublecrochet.item;

import net.minecraft.item.Item;

public class CrochetHook extends Item {
    private final Float hookSize;

    public CrochetHook(Settings settings, Float hookSize) {
	    super(settings);
	    this.hookSize = hookSize;
    }
}
