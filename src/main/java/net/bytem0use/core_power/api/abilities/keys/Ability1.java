package net.bytem0use.core_power.api.abilities.keys;

import net.bytem0use.core_power.api.type.AbilityCategory;
import net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.LivingEntity;

import java.util.Objects;

public class Ability1 extends KeyBinding {
    private boolean isKeyPressed;
    private AbilityCategory pCategory;
    private int damage;
    private int range;

    public Ability1(String translationKey, int code, String category) {
        super(translationKey, code, category);
    }

    public Ability1(String translationKey, InputUtil.Type type, int code, String category) {
        super(translationKey, type, code, category);
    }

    public static KeyBinding registerKeyBinding(KeyBinding keyBinding) {
        Objects.requireNonNull(keyBinding, "key binding cannot be null");
        return KeyBindingRegistryImpl.registerKeyBinding(keyBinding);
    }

    public void getAnimation(LivingEntity var1) {
    }

}
