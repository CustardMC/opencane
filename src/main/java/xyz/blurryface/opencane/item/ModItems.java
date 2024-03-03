package xyz.blurryface.opencane.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.blurryface.opencane.OpenCane;
import net.minecraft.item.PotionItem;

import java.util.ArrayList;
import java.util.List;


public class ModItems {

    private static final List<Item> toAdd = new ArrayList<>();

    public static final Item CCANE = registerItem("ccane",
            new Item(new FabricItemSettings()));
    public static final Item SPEED_PILL = registerItem("speed_pill",
            new Item(new FabricItemSettings()));
    public static final Item LEAVES = registerItem("leaves",
            new Item(new FabricItemSettings()));
    public static final Item WEED_LEAVES = registerItem("weed_leaves",
            new Item(new FabricItemSettings()));
    public static final Item DRIED_LEAVES = registerItem("dried_leaves",
            new Item(new FabricItemSettings()));
    public static final Item SEEDS = registerItem("seeds",
            new Item(new FabricItemSettings()));
    public static final Item COFFEE_SEEDS = registerItem("coffee_seeds",
            new Item(new FabricItemSettings()));
    public static final Item COFFEE_CUP = registerItem("coffee_cup",
            new PotionItem(new FabricItemSettings()));
    public static final Item METHII_CRYSTAL = registerItem("methii_crystal",
            new Item(new FabricItemSettings()));
    public static final Item EMDEE_PILL = registerItem("emdee_pill",
            new Item(new FabricItemSettings()));

    // Alcohol

    public static final Item WINE_BOTTLE = registerItem("wine_bottle",
            new PotionItem(new FabricItemSettings()));
    public static final Item BEER_BOTTLE = registerItem("beer_bottle",
            new PotionItem(new FabricItemSettings()));
    public static final Item BEER_CAN = registerItem("beer_can",
            new PotionItem(new FabricItemSettings()));
    public static final Item VODKA_BOTTLE = registerItem("vodka_bottle",
            new PotionItem(new FabricItemSettings()));
    public static final Item GIN_BOTTLE = registerItem("gin_bottle",
            new PotionItem(new FabricItemSettings()));
    public static final Item RUM_BOTTLE = registerItem("rum_bottle",
            new PotionItem(new FabricItemSettings()));


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
