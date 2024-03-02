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

public class ModItemGroups {
    public static final ItemGroup PLANTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OpenCane.MOD_ID, "oc_plants"),
            FabricItemGroup.builder().displayName(Text.translatable("oc_plants.opencane"))
                    .icon(() -> new ItemStack(Items.DIRT)).entries((displayContext, entries) -> {

                    entries.add(Blocks.OAK_LEAVES);

                    }).build());

    public static void registerItemGroups() {}

}