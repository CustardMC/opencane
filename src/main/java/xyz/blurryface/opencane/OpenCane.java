package xyz.blurryface.opencane;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.blurryface.opencane.item.ModItems;

public class OpenCane implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("open-cane");

	public static final String MOD_ID = "opencane";

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("I wonder what C-cane is meant to be...");
	}
}