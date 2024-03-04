package xyz.blurryface.opencane;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import xyz.blurryface.opencane.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class OpenCaneClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PLANT, RenderLayer.getCutout());

	}
}