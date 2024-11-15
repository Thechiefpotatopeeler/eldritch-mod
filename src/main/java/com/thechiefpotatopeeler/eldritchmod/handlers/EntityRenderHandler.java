package com.thechiefpotatopeeler.eldritchmod.handlers;

import com.thechiefpotatopeeler.eldritchmod.entity.entity.dwarf.EntityDwarf;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.moobloom.EntityPoobloom;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.moobloom.EntityRedMoobloom;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.moobloom.EntityYellowMoobloom;

import com.thechiefpotatopeeler.eldritchmod.entity.entity.*;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.shroomoid.ShroomoidTrader;
import com.thechiefpotatopeeler.eldritchmod.entity.render.*;
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

        RenderingRegistry.registerEntityRenderingHandler(EntityHatchableEgg.class,new IRenderFactory<EntityHatchableEgg>(){

            @Override
            public Render<? super EntityHatchableEgg> createRenderFor(RenderManager manager) {
                return new RenderHatchableEgg(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityGhust.class,new IRenderFactory<EntityGhust>(){

            @Override
            public Render<? super EntityGhust> createRenderFor(RenderManager manager) {
                return new RenderGhust(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityThundercock.class,new IRenderFactory<EntityThundercock>(){

            @Override
            public Render<? super EntityThundercock> createRenderFor(RenderManager manager) {
                return new RenderThundercock(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityScarecrow.class,new IRenderFactory<EntityScarecrow>(){

            @Override
            public Render<? super EntityScarecrow> createRenderFor(RenderManager manager) {
                return new RenderScareCrow(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(ShroomoidTrader.class,new IRenderFactory<ShroomoidTrader>(){

            @Override
            public Render<? super ShroomoidTrader> createRenderFor(RenderManager manager) {
                return new RenderShroomoid(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityGoatman.class,new IRenderFactory<EntityGoatman>(){

            @Override
            public Render<? super EntityGoatman> createRenderFor(RenderManager manager) {
                return new RenderGoatman(manager);
            }
        });
    }
}   
