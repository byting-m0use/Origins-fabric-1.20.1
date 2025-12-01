package net.bytem0use.origins.tester;

import net.bytem0use.origins.api.PowerV2;
import net.minecraft.entity.effect.StatusEffectCategory;

public class SpiderEffect extends PowerV2 {
    public SpiderEffect(StatusEffectCategory category, int duration, boolean ambient, boolean showParticles, boolean showIcon) {
        super(category, duration, ambient, showParticles, showIcon);
    }
}
