package xyz.blurryface.opencane.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.blurryface.opencane.OpenCane;
import xyz.blurryface.opencane.lang.LanguageProvider;

import java.util.ArrayList;
import java.util.List;


public class ModItems {

    private static final List<Item> toAdd = new ArrayList<>();

    public static final Item CCANE = registerItem("ccane",
            new Item(new FabricItemSettings()));
    public static final Item LEAVES = registerItem("leaves",
            new Item(new FabricItemSettings()));
    public static final Item DRIED_LEAVES = registerItem("dried_leaves",
            new Item(new FabricItemSettings()));
    public static final Item SEEDS = registerItem("seeds",
            new Item(new FabricItemSettings()));
    public static final Item COFFEE_SEEDS = registerItem("coffee_seeds",
            new Item(new FabricItemSettings()));

    /*   OLD ITEM ADDING CODE

    // Add C-cane
    public static final Item CCANE = registerSimpleItem("ccane", "C-cane");
    public static final Item LEAVES = registerSimpleItem("leaves", "C-cane Leaves");
    public static final Item DIRED_LEAVES = registerSimpleItem("dried_leaves", "Dried C-cane Leaves");
    public static final Item SEEDS = registerSimpleItem("seeds", "C-cane Seeds");
    public static final Item COFFEE_SEEDS = registerSimpleItem("coffee_seeds", "Coffee Seeds");
    private static Item registerSimpleItem(String path, String englishName) {
        return registerItem(path, englishName, new Item(new FabricItemSettings()));
    }
*/
    private static Item registerItem(String path, Item item) {
        var registered = Registry.register(Registries.ITEM, new Identifier(OpenCane.MOD_ID, path), item);
        toAdd.add(registered);
        return registered;
    }
    public static void registerModItems() {
    }

}
