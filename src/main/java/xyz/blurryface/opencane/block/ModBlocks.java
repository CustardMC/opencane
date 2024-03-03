package xyz.blurryface.opencane.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import xyz.blurryface.opencane.OpenCane;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
public class ModBlocks {
        
        public static final Block PLANT = registerBlock("plant",
                new Block(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        public static final Block WILD_PLANT = registerBlock("wild_plant",
                new Block(FabricBlockSettings.copyOf(Blocks.LARGE_FERN)));
        public static final Block WEED_PLANT = registerBlock("weed_plant",
                new Block(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        public static final Block WILD_WEED_PLANT = registerBlock("wild_weed_plant",
            new Block(FabricBlockSettings.copyOf(Blocks.LARGE_FERN)));
        public static final Block COFFEE_PLANT = registerBlock("coffee_plant",
            new Block(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        public static final Block WILD_COFFEE_PLANT = registerBlock("wild_coffee_plant",
            new Block(FabricBlockSettings.copyOf(Blocks.LARGE_FERN)));
        public static final Block WEED_SAPLING = registerBlock("weed_sapling",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
        private static Block registerBlock(String name, Block block) {

            registerBlockItem(name, block);
            return Registry.register(Registries.BLOCK, new Identifier(OpenCane.MOD_ID, name), block);

        }
        private static Item registerBlockItem(String name, Block block) {

            return Registry.register(Registries.ITEM, new Identifier(OpenCane.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings()));

        }

        public static void registerModBlocks() {}
    }
