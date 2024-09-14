package net.samanyu.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200, 2), 0.33f).build();
}
