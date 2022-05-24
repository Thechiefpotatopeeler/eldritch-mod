package com.eldritchmod.handlers;

import com.eldritchmod.entities.EntityYellowMoobloom;
import com.eldritchmod.entities.EntityPoobloom;
import com.eldritchmod.entities.EntityRedMoobloom;
import com.eldritchmod.entities.EntitySpiderMatriarch;
import com.eldritchmod.entities.render.RenderMatriarch;
import com.eldritchmod.entities.render.RenderPoobloom;
import com.eldritchmod.entities.render.RenderRedMoobloom;
import com.eldritchmod.entities.render.RenderYellowMoobloom;

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

        
            
        RenderingRegistry.registerEntityRenderingHandler(EntityYellowMoobloom.class,new IRenderFactory<EntityYellowMoobloom>(){

            @Override
            public Render<? super EntityYellowMoobloom> createRenderFor(RenderManager manager) {
                return new RenderYellowMoobloom(manager);
            }
        });
        
        RenderingRegistry.registerEntityRenderingHandler(EntityRedMoobloom.class,new IRenderFactory<EntityRedMoobloom>(){

            @Override
            public Render<? super EntityRedMoobloom> createRenderFor(RenderManager manager) {
                return new RenderRedMoobloom(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPoobloom.class,new IRenderFactory<EntityPoobloom>(){
                
                @Override
                public Render<? super EntityPoobloom> createRenderFor(RenderManager manager) {
                    return new RenderPoobloom(manager);
                }
            });
        }   
}