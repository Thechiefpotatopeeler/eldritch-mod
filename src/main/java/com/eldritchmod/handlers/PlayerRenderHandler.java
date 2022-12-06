package com.eldritchmod.handlers;

import com.eldritchmod.entities.render.LayerPlayerAura;

import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerRenderHandler {
    
    @SubscribeEvent
    public void onPlayerRender(RenderPlayerEvent.Pre event){
        //event.getRenderer().addLayer(new LayerPlayerAura(event.getRenderer()));
    }
}