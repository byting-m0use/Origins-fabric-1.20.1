package net.bytem0use.core_power.api.abilities.base;

import net.bytem0use.core_power.api.type.PassiveTags;
import net.bytem0use.core_power.api.type.PowersTag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class CorePassive extends PowerAPI{


    public CorePassive(StatusEffectCategory category, int color, PassiveTags tagP, PowersTag tag) {
        super(category, color, tagP, tag);
    }

    @Override
    public void getTag(StatusEffect effect, PowersTag pTag, PowerAPI api) {
        api.hasTag(pTag);
        super.getTag(effect, pTag, api);
    }

    @Override
    public boolean hasTag(PowersTag pTag) {
        super.hasTag(pTag);
        return false;
    }

    public void getPassive(CorePassive passive) {
    }

    public void applyPassive() {
    }
}
