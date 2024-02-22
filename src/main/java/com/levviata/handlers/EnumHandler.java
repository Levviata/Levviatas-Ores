package com.levviata.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
    public static enum EnumCopper implements IStringSerializable {
        COPPER_ORE(0, "copper_ore"),
        GRANITE_COPPER_ORE(1, "granite_copper_ore"),
        DIORITE_COPPER_ORE(2, "diorite_copper_ore"),
        ANDESITE_COPPER_ORE(3, "andesite_copper_ore");

        private static EnumCopper[] META_LOOKUP = new EnumCopper[values().length];
        private final String name, unlocalizedName;
        private final int meta;

        private EnumCopper(int meta, String name) {
            this(meta, name, name);
        }

        private EnumCopper(int meta, String name, String unlocalizedName) {
            this.name = name;
            this.unlocalizedName = name;
            this.meta = meta;
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
            return this.unlocalizedName;
        }

        public static EnumCopper byMetadata(int meta) {
            return META_LOOKUP[meta];
        }

        static {
            for (EnumCopper enumCopper : values()) {
                META_LOOKUP[enumCopper.getMeta()] = enumCopper;
            }
        }
    }

    public static enum EnumTin implements IStringSerializable {
        /* COPPER_ORE(0, "copper_ore"),
         GRANITE_COPPER_ORE(1, "granite_copper_ore"),
         DIORITE_COPPER_ORE(2, "diorite_copper_ore"),*/
        TIN_ORE(0, "tin_ore"),
        GRANITE_TIN_ORE(1, "granite_tin_ore"),
        DIORITE_TIN_ORE(2, "diorite_tin_ore"),
        ANDESITE_TIN_ORE(3, "andesite_tin_ore");

        private static final EnumTin[] META_LOOKUP = new EnumTin[values().length];
        private final String name, unlocalizedName;
        private final int meta;

        private EnumTin(int meta, String name) {
            this(meta, name, name);
        }

        private EnumTin(int meta, String name, String unlocalizedName) {
            this.name = name;
            this.unlocalizedName = name;
            this.meta = meta;
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
            return this.unlocalizedName;
        }
        public static EnumTin byMetadata(int meta){
            return META_LOOKUP[meta];
        }
        static {
            for(EnumTin enumTin : values()){
                META_LOOKUP[enumTin.getMeta()] = enumTin;
            }
        }
    }
    public static enum EnumPlatinum implements IStringSerializable {
        /* COPPER_ORE(0, "copper_ore"),
         GRANITE_COPPER_ORE(1, "granite_copper_ore"),
         DIORITE_COPPER_ORE(2, "diorite_copper_ore"),*/
        PLATINUM_ORE(0, "platinum_ore"),
        GRANITE_PLATINUM_ORE(1, "granite_platinum_ore"),
        DIORITE_PLATINUM_ORE(2, "diorite_platinum_ore"),
        ANDESITE_PLATINUM_ORE(3, "andesite_platinum_ore");

        private static final EnumPlatinum[] META_LOOKUP = new EnumHandler.EnumPlatinum[values().length];
        private final String name, unlocalizedName;
        private final int meta;

        private EnumPlatinum(int meta, String name) {
            this(meta, name, name);
        }

        private EnumPlatinum(int meta, String name, String unlocalizedName) {
            this.name = name;
            this.unlocalizedName = name;
            this.meta = meta;
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
            return this.unlocalizedName;
        }
        public static EnumPlatinum byMetadata(int meta){
            return META_LOOKUP[meta];
        }
        static {
            for(EnumPlatinum enumPlatinum : values()){
                META_LOOKUP[enumPlatinum.getMeta()] = enumPlatinum;
            }
        }
    }
}
