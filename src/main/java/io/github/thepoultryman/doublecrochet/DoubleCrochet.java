package io.github.thepoultryman.doublecrochet;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoubleCrochet implements ModInitializer {
	public static final String MOD_ID = "doublecrochet";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("(Double) Crocheting a quilt(MC)");
	}
}
