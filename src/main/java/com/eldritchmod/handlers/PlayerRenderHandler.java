package com.eldritchmod.handlers;

import com.eldritchmod.entity.render.LayerPlayerAura;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerRenderHandler {
    
    @SubscribeEvent
    public void onPlayerRender(RenderPlayerEvent.Pre event){
        //TODO work on when to run this
        //event.getRenderer().addLayer(new LayerPlayerAura(event.getRenderer()));
    }
}