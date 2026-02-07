package net.bytem0use.core_power.packets;

import net.minecraft.network.listener.PacketListener;

public interface CoreClientPlayPacketListener extends PacketListener {

    void onPlayerCoreAbilities(AdvancedAbilitiesS2CPacket packet);
}
