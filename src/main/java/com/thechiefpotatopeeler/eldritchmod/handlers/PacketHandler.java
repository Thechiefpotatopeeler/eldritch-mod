package com.thechiefpotatopeeler.eldritchmod.handlers;

import com.thechiefpotatopeeler.eldritchmod.Main;
import com.thechiefpotatopeeler.eldritchmod.data.IMana;
import com.thechiefpotatopeeler.eldritchmod.data.ManaProvider;
import com.thechiefpotatopeeler.eldritchmod.handlers.event.EventManaUpdated;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber
public class PacketHandler {

    public static SimpleNetworkWrapper WRAPPER = NetworkRegistry.INSTANCE.newSimpleChannel("eldritchmod");

    public PacketHandler() {
        WRAPPER.registerMessage(ManaUpdatedMessage.ManaUpdatedMessageHandler.class, ManaUpdatedMessage.class, 0, Side.CLIENT);
    }
    public static class ManaUpdatedMessage implements IMessage {

        int mana;

        public ManaUpdatedMessage() {
        }
        public ManaUpdatedMessage(int mana) {
            this.mana=mana;
        }
        @Override
        public void fromBytes(ByteBuf buf) {
            mana=buf.readInt();
        }

        @Override
        public void toBytes(ByteBuf buf) {
            buf.writeInt(mana);
        }

        public static class ManaUpdatedMessageHandler implements IMessageHandler<ManaUpdatedMessage, IMessage> {

            public ManaUpdatedMessageHandler() {
                super();
            }
            @Override
            public IMessage onMessage(ManaUpdatedMessage message, MessageContext ctx) {
                Main.proxy.updateManaBar(message.mana);
                System.out.println("Mana updated to: " + message.mana);
                return null;
            }
        }
    }

    @SubscribeEvent
    public void manaUpdated(EventManaUpdated event) {
        if(event.player.getEntityWorld().isRemote) return;
        WRAPPER.sendTo(new ManaUpdatedMessage(event.getMpPlayer().getCapability(ManaProvider.MANA_CAP, null).getMana()), event.getMpPlayer());
    }

}
