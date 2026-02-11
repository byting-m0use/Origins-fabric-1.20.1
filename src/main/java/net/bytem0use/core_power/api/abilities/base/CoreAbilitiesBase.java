package net.bytem0use.core_power.api.abilities.base;

import net.bytem0use.core_power.api.type.AbilityCategory;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

@Environment(EnvType.CLIENT)
public abstract class CoreAbilitiesBase extends KeyBinding {

    public CoreAbilitiesBase(String translationKey, int code, String category) {
        super(translationKey, code, category);
    }

    public CoreAbilitiesBase(String translationKey, InputUtil.Type type, int code, String category) {
        super(translationKey, type, code, category);
    }

    public CoreAbilitiesBase(String translationKey, int code, String category, AbilityCategory pCategory) {
        super(translationKey, code, category);
    }

    public void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
        });
    }

    public void register() {
        registerKeyInputs();
    }
}
