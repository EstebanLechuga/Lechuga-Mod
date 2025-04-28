package net.esteban.lechugamod.item;

import net.esteban.lechugamod.LechugaMod;
import net.esteban.lechugamod.item.custom.ModFoodComponents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //---------ITEMS----------//

    public static final Item LETTUCE = registerItem("lettuce",new Item(new Item.Settings().food(ModFoodComponents.LETTUCE_FOOD)));

    //---------HERRAMIENTAS----------//

    public static final Item LETTUCE_SWORD = registerItem("lettuce_sword",
            new SwordItem(ModToolMaterials.LETTUCE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LETTUCE, 30,0f))));

    public static final Item LETTUCE_PICKAXE = registerItem("lettuce_pickaxe",
            new PickaxeItem(ModToolMaterials.LETTUCE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LETTUCE, 10,-1f))));

    public static final Item LETTUCE_SHOVEL = registerItem("lettuce_shovel",
            new ShovelItem(ModToolMaterials.LETTUCE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LETTUCE, 10,-1f))));

    public static final Item LETTUCE_AXE = registerItem("lettuce_axe",
            new AxeItem(ModToolMaterials.LETTUCE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LETTUCE, 10,-1f))));

   // public static final Item LETTUCE_HAMMER = registerItem("lettuce_hammer", new HammerItem(ModToolMaterials.LETTUCE, new Item.Settings()
   //         .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LETTUCE, 8, -3))));


    //---------REGISTRADORES----------//


    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(LechugaMod.MOD_ID,name), item);
    }

    public static void register(){
        LechugaMod.LOGGER.info("Inicializando items lechugones...");
    }
}
