package net.bytem0use.core_power.packets;

import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;

public class AdvancedAbilitiesS2CPacket implements Packet<CoreClientPlayPacketListener> {
    private static final int FLYING_MASK = 2;
    private static final int ALLOW_FLYING_MASK = 4;
    private final boolean flying;
    private final boolean allowFlying;
    private final float flySpeed;

    public AdvancedAbilitiesS2CPacket(PlayerAbilities abilities) {
        this.flying = abilities.flying;
        this.allowFlying = abilities.allowFlying;
        this.flySpeed = abilities.getFlySpeed();
    }

    public AdvancedAbilitiesS2CPacket(PacketByteBuf buf) {
        byte b = buf.readByte();
        this.flying = (b & 2) != 0;
        this.allowFlying = (b & 4) != 0;
        this.flySpeed = buf.readFloat();
    }

    @Override
    public void write(PacketByteBuf buf) {
        byte b = 0;

        if (this.flying) {
            b = (byte)(b | 2);
        }

        if (this.allowFlying) {
            b = (byte)(b | 4);
        }


        buf.writeByte(b);
        buf.writeFloat(this.flySpeed);
    }

    public void apply(CoreClientPlayPacketListener clientPlayPacketListener) {
        clientPlayPacketListener.onPlayerCoreAbilities(this);
    }

    public boolean isFlying() {
        return this.flying;
    }

    public boolean allowFlying() {
        return this.allowFlying;
    }

    public float getFlySpeed() {
        return this.flySpeed;
    }
}
