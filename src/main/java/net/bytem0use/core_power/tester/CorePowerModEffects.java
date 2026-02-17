package net.bytem0use.core_power.tester;

import net.bytem0use.core_power.CorePower;
import net.bytem0use.core_power.api.abilities.base.CorePassive;
import net.bytem0use.core_power.api.abilities.passive.premade_passives.ImpactDamagePassive;
import net.bytem0use.core_power.api.type.PowersTag;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CorePowerModEffects {

    private static StatusEffect registerPower(String name, StatusEffect power) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(CorePower.MOD_ID, name), power);
    }

    public static final StatusEffect SPEEDSTER = registerPower("speedster",
            new SpeedsterEffect(StatusEffectCategory.BENEFICIAL, 55550, PowersTag.ENHANCER));

    public static void registerEffects() {
        CorePower.LOGGER.info("Registering Mod Effects for " + CorePower.MOD_ID);
    }

}
