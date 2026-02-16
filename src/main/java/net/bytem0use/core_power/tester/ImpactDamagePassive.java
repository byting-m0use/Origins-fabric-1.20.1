package net.bytem0use.core_power.tester;

import net.bytem0use.core_power.api.abilities.base.CorePassive;
import net.bytem0use.core_power.api.type.PowersTag;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ImpactDamagePassive extends CorePassive {

    public ImpactDamagePassive(StatusEffectCategory category, int color, PowersTag pTag) {
        super(category, color, pTag);
    }
}
