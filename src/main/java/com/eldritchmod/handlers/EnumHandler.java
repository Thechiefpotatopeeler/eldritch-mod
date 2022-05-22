package com.eldritchmod.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {

    public static enum EnumMoobloomType implements IStringSerializable {

        DANDELION(0, "dandelion"),
        POPPY(1, "poppy"),
        ALLIUM(2, "ALLIUM"),
        BLUE_ORCHID(3, "BLUE_ORCHID");

        private static final EnumMoobloomType[] META_LOOKUP = new EnumMoobloomType[values().length];
        private final int meta;
        private final String name, unlocalizedName;

        private EnumMoobloomType(int meta, String name) {
            this(meta, name, name);
        }

        private EnumMoobloomType(int meta, String name, String unlocalizedName) {
            this.meta = meta;
            this.name = name;
            this.unlocalizedName = unlocalizedName;
        }

        @Override
        public String getName() {
            return this.name;
        }

        public int getMeta() {
            return this.meta;
        }

        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }

        @Override
        public String toString() {
            return this.name;
        }

        public static EnumMoobloomType byMetadata(int meta){
            return META_LOOKUP[meta];
        }

        static {
            for(EnumMoobloomType type : values()){
                META_LOOKUP[type.getMeta()] = type;
            }
        }

    }
    
}