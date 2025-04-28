package net.esteban.lechugamod.item.custom;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {



    public static final FoodComponent LETTUCE_FOOD = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(10f)
            .alwaysEdible()
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 500,3),100)
            .build();
}
