package net.bytem0use.core_power.tester;

import net.bytem0use.core_power.api.abilities.base.PowerAPI;
import net.bytem0use.core_power.api.type.PowersTag;
import net.minecraft.entity.effect.StatusEffectCategory;

public class SpeedsterEffect extends PowerAPI {

    public SpeedsterEffect(StatusEffectCategory category, int color, PowersTag pTag) {
        super(category, color, pTag);
    }
}
