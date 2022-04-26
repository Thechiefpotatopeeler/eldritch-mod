package com.eldritchmod.handlers;

import com.eldritchmod.entities.EntitySpiderMatriarch;
import com.eldritchmod.entities.render.RenderMatriarch;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntityRenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntitySpiderMatriarch.class, new IRenderFactory<EntitySpiderMatriarch>(){

            @Override
            public Render<? super EntitySpiderMatriarch> createRenderFor(RenderManager manager) {
                return new RenderMatriarch(manager);
            }
        });
    }
    
}