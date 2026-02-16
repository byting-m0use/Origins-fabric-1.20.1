package net.bytem0use.core_power.mixin;

import net.bytem0use.core_power.api.abilities.base.CorePassive;
import net.bytem0use.core_power.api.abilities.base.PowerAPI;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin({StatusEffectInstance.class})
public abstract class StatusEffectInstanceMixin {
    @Shadow
    public abstract StatusEffect getEffectType();
    @Shadow private boolean showParticles;
    @Unique boolean isInfinite;
    @Shadow public static final int INFINITE = -1;
    @Shadow private int duration;
    @Shadow private boolean showIcon;

    /**
     * @author ByteM0use
     * @reason Force no particles for effects extending PowerAPI
     */

    @Overwrite
    public boolean shouldShowParticles() {
        StatusEffectInstance self = (StatusEffectInstance) (Object) this;
        if (PowerAPI.class.isAssignableFrom(self.getEffectType().getClass())) {
            return false;  // Invisible: no particles spawn
        }
        return this.showParticles;
    }

    /**
     * @author ByteM0use
     * @reason Make effect Infinite when extending class PowerAPI
     */

    @Overwrite
    public boolean isInfinite() {
        StatusEffectInstance self = (StatusEffectInstance) (Object) this;
        if (PowerAPI.class.isAssignableFrom(self.getEffectType().getClass())) {
            return true;  // Infinite: no duration
        }
        return this.isInfinite;
    }

    /**
     * @author ByteM0use
     * @reason Make effect hidden when extending CorePassive class
     */
    @Overwrite
    public boolean shouldShowIcon() {
        StatusEffectInstance self = (StatusEffectInstance) (Object) this;
        if (CorePassive.class.isAssignableFrom(self.getEffectType().getClass())) {
            return false;  // Should not show effect for passives
        }
        return this.showIcon;
    }
}
