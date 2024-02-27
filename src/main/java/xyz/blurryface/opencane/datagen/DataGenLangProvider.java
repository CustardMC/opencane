package xyz.blurryface.opencane.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import xyz.blurryface.opencane.lang.LanguageProvider;

public class DataGenLangProvider extends FabricLanguageProvider {
    private final LanguageProvider provider;

    public DataGenLangProvider(FabricDataOutput dataOutput, LanguageProvider provider) {
        super(dataOutput, provider.lang);

        this.provider = provider;
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        provider.generateTranslations(translationBuilder);
    }
}