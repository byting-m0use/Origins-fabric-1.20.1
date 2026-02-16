package net.bytem0use.core_power.api.abilities.base;

import net.bytem0use.core_power.api.type.PassiveTags;
import net.bytem0use.core_power.api.type.PowersTag;
import net.minecraft.entity.effect.StatusEffectCategory;

public class CorePassive extends PowerAPI{

    public CorePassive(StatusEffectCategory category, int color, PowersTag pTag) {
        super(category, color, pTag);
    }

    public CorePassive(StatusEffectCategory category, int color, PowersTag tagP, PassiveTags pTag) {
        super(category, color, tagP);
    }
}
