package net.bytem0use.core_power.api.abilities.base;

import net.bytem0use.core_power.api.abilities.passive.PassiveRegistry;
import net.bytem0use.core_power.api.type.PassiveList;
import net.bytem0use.core_power.api.type.PassiveTags;
import net.bytem0use.core_power.api.type.PowersTag;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public abstract class PowerAPI extends StatusEffect {
    public final PowersTag tag;

    public PowerAPI(StatusEffectCategory category, int color, PowersTag pTag) {
        super(category, color);
        this.tag = pTag;
    }

    public PowerAPI(StatusEffectCategory category, int color, PassiveTags tagP, PowersTag tag) {
        super(category, color);
        this.tag = tag;
    }

    public static void getTag() {
        StatusEffectCategory beneficial = StatusEffectCategory.BENEFICIAL;
    }

    public static void hasTag(StatusEffect effect, PowersTag pTag, PowerAPI api) {
    }

    public PowerAPI addPassive(PassiveList passive) {
        return this;
    }


}
