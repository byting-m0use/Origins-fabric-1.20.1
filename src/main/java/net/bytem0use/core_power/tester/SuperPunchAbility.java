package net.bytem0use.core_power.tester;

import net.bytem0use.core_power.api.abilities.base.CoreAbilitiesBase;
import net.bytem0use.core_power.api.type.AbilityCategory;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class SuperPunchAbility extends CoreAbilitiesBase {

    public SuperPunchAbility(String translationKey, int code, String category, AbilityCategory pCategory) {
        super(translationKey, code, category, pCategory);
    }

    @Override
    public void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
        });
        super.registerKeyInputs();
    }

    @Override
    public void register() {
        super.register();
    }
}
