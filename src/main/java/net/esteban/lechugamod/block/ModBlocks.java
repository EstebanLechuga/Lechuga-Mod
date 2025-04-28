package net.esteban.lechugamod.block;

import net.esteban.lechugamod.LechugaMod;
import net.esteban.lechugamod.block.custom.LettuceBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block LETTUCE_BLOCK = registerBlock("lettuce_block", new LettuceBlock(UniformIntProvider.create(10,100),AbstractBlock.Settings.create()
            .breakInstantly().sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LechugaMod.MOD_ID,name), block);
    }


    public static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(LechugaMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }


    public static void register(){
        LechugaMod.LOGGER.info("Inicializando items lechugones...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
                entries ->
                        entries.add(LETTUCE_BLOCK)
        );
    }
}

