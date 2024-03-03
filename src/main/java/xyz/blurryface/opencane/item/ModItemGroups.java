package xyz.blurryface.opencane.item;

import net.minecraft.block.Blocks;
import xyz.blurryface.opencane.OpenCane;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import xyz.blurryface.opencane.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CANE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OpenCane.MOD_ID, "oc_cane"),
            FabricItemGroup.builder().displayName(Text.translatable("oc_cane.opencane"))
                    .icon(() -> new ItemStack(ModItems.CCANE)).entries((displayContext, entries) -> {

                    entries.add(ModItems.CCANE);
                    entries.add(ModItems.LEAVES);
                    entries.add(ModItems.DIRED_LEAVES);

                    }).build());
    public static final ItemGroup SEEDS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OpenCane.MOD_ID, "oc_seeds"),
            FabricItemGroup.builder().displayName(Text.translatable("oc_seeds.opencane"))
                    .icon(() -> new ItemStack(ModItems.CCANE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.SEEDS);
                        entries.add(ModItems.COFFEE_SEEDS);
                        entries.add(ModBlocks.WEED_SAPLING);

                    }).build());

    public static final ItemGroup LEAF_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OpenCane.MOD_ID, "oc_leaves"),
            FabricItemGroup.builder().displayName(Text.translatable("oc_leaves.opencane"))
                    .icon(() -> new ItemStack(Items.FERN)).entries((displayContext, entries) -> {

                        // entries.add(ModBlocks.PLANT); <-- is a comment because you shouldn't be able to place crop blocks directly, you do so via seeds.
                        entries.add(ModBlocks.WILD_PLANT);
                        // entries.add(ModBlocks.WEED_PLANT); <-- is a comment because you shouldn't be able to place crop blocks directly, you do so via seeds.
                        entries.add(ModBlocks.WILD_WEED_PLANT);
                        // entries.add(ModBlocks.COFFEE_PLANT); <-- is a comment because you shouldn't be able to place crop blocks directly, you do so via seeds.
                        entries.add(ModBlocks.WILD_COFFEE_PLANT);

                    }).build());

    public static final ItemGroup SHROOMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OpenCane.MOD_ID, "oc_shrooms"),
            FabricItemGroup.builder().displayName(Text.translatable("oc_shrooms.opencane"))
                    .icon(() -> new ItemStack(Items.BROWN_MUSHROOM)).entries((displayContext, entries) -> {

                        entries.add(Blocks.RED_MUSHROOM);
                        entries.add(Blocks.BROWN_MUSHROOM);

                    }).build());

    public static final ItemGroup DRINKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OpenCane.MOD_ID, "oc_drinks"),
            FabricItemGroup.builder().displayName(Text.translatable("oc_drinks.opencane"))
                    .icon(() -> new ItemStack(Items.POTION)).entries((displayContext, entries) -> {

                        entries.add(Items.POTION);

                    }).build());

    public static final ItemGroup EDIBLES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OpenCane.MOD_ID, "oc_edibles"),
            FabricItemGroup.builder().displayName(Text.translatable("oc_edibles.opencane"))
                    .icon(() -> new ItemStack(Items.COOKIE)).entries((displayContext, entries) -> {

                        entries.add(Items.COOKIE);

                    }).build());

    public static final ItemGroup MISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OpenCane.MOD_ID, "oc_misc"),
            FabricItemGroup.builder().displayName(Text.translatable("oc_misc.opencane"))
                    .icon(() -> new ItemStack(Blocks.COMMAND_BLOCK)).entries((displayContext, entries) -> {

                    entries.add(Items.DIRT);

                    }).build());

    public static void registerItemGroups() {}

}