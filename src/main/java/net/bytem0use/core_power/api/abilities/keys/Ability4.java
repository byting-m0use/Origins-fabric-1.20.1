package net.bytem0use.core_power.api.abilities.keys;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

public class Ability4 extends KeyBinding {
    public Ability4(String translationKey, int code, String category) {
        super(translationKey, code, category);
    }

    public Ability4(String translationKey, InputUtil.Type type, int code, String category) {
        super(translationKey, type, code, category);
    }
}
