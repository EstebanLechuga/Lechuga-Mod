package net.esteban.lechugamod.datagen;

import net.esteban.lechugamod.block.ModBlocks;
import net.esteban.lechugamod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {super(output);}


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LETTUCE_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.LETTUCE, Models.GENERATED);

        itemModelGenerator.register(ModItems.LETTUCE_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.LETTUCE_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.LETTUCE_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.LETTUCE_SHOVEL,Models.HANDHELD);
    }
}
