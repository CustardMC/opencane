package xyz.blurryface.opencane.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import xyz.blurryface.opencane.lang.LanguageProvider;

import java.util.ArrayList;
import java.util.List;

public class OpenCaneDataGen implements DataGeneratorEntrypoint {
    private static final List<LanguageProvider> providers = new ArrayList<>();

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        final var pack = fabricDataGenerator.createPack();

        providers.forEach((provider) -> pack.addProvider((FabricDataOutput output) -> new DataGenLangProvider(output, provider)));
    }

    public static void addLanguageProvider(LanguageProvider provider) {
        providers.add(provider);
    }
}
