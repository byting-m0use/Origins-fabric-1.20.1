package net.bytem0use.origins.tester;

import net.bytem0use.origins.api.PowerAPI;
import net.bytem0use.origins.api.type.PowersTag;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ArachnidEffect extends PowerAPI {
    public ArachnidEffect(StatusEffectCategory category, int color, PowersTag pTag) {
        super(category, color, pTag);
    }
}
