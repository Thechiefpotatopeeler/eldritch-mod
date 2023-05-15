package com.eldritchmod.handlers;

import com.eldritchmod.entities.*;
import com.eldritchmod.entities.render.*;

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

        RenderingRegistry.registerEntityRenderingHandler(EntityBarnacle.class,new IRenderFactory<EntityBarnacle>(){
                
            @Override
            public Render<? super EntityBarnacle> createRenderFor(RenderManager manager) {
                return new RenderBarnacle(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityDwarf.class,new IRenderFactory<EntityDwarf>(){

            @Override
            public Render<? super EntityDwarf> createRenderFor(RenderManager manager) {
                return new RenderDwarf(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityCrocodemon.class,new IRenderFactory<EntityCrocodemon>(){

            @Override
            public Render<? super EntityCrocodemon> createRenderFor(RenderManager manager) {
                return new RenderCrocodemon(manager);
            }
        });
    }
}   
