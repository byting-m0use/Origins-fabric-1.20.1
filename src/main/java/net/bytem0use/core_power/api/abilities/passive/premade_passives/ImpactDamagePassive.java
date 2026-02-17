package net.bytem0use.core_power.api.abilities.passive.premade_passives;

import net.bytem0use.core_power.api.abilities.base.CorePassive;
import net.bytem0use.core_power.api.type.PassiveTags;
import net.bytem0use.core_power.api.type.PowersTag;
import net.bytem0use.core_power.tester.CorePowerModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ImpactDamagePassive extends CorePassive {

    public ImpactDamagePassive(StatusEffectCategory category, int color, PassiveTags tagP, PowersTag tag) {
        super(category, color, tagP, tag);
    }

}
