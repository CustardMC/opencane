package xyz.blurryface.opencane;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenCane implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("open-cane");

	@Override
	public void onInitialize() {
		LOGGER.info("I wonder what C-cane is meant to be...");
	}
}