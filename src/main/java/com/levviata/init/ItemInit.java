package com.levviata.init;

import com.levviata.bases.*;
import com.levviata.bases.tools.*;
import com.levviata.utils.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item.ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial(
            "tool_copper",
            1, 180,
            4.5F,
            1.45F,
            15);
    public static final ItemArmor.ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial(
            "armor_copper",
            Reference.MODID + ":copper",
            7,
            new int[]{1, 4, 5, 2},
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F);
    public static final Item.ToolMaterial TOOl_TIN = EnumHelper.addToolMaterial(
            "tool_tin",
            1,
            210,
            4.35F,
            1.35F,
            18);
    public static final ItemArmor.ArmorMaterial ARMOR_TIN = EnumHelper.addArmorMaterial(
            "armor_tin",
            Reference.MODID + ":tin",
            12,
            new int[]{1, 3, 4, 2},
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F);
    public static final Item.ToolMaterial TOOl_PLATINUM = EnumHelper.addToolMaterial(
            "tool_platinum",
            2,
            625,
            7.0F,
            2.5F,
            18);
    public static final ItemArmor.ArmorMaterial ARMOR_PLATINUM = EnumHelper.addArmorMaterial(
            "armor_platinum",
            Reference.MODID + ":platinum",
            23,
            new int[]{3, 6, 7, 2},
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F);
    public static final Item.ToolMaterial TOOl_BRONZE = EnumHelper.addToolMaterial(
            "tool_bronze",
            2,
            300,
            6.5F,
            2.35F,
            10);
    public static final ItemArmor.ArmorMaterial ARMOR_BRONZE = EnumHelper.addArmorMaterial(
            "armor_bronze",
            Reference.MODID + ":bronze",
            17,
            new int[]{2, 6, 6, 3},
            10,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F);

    public static final Item TIN_INGOT = new ItemBase("tin_ingot", "ingotTin", CreativeTabs.MATERIALS);
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot", "ingotCopper", CreativeTabs.MATERIALS);
    public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot", "ingotBronze", CreativeTabs.MATERIALS);
    public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot", "ingotPlatinum", CreativeTabs.MATERIALS);

    public static final Item TIN_AND_COPPER_POWDER = new ItemBase("tin_and_copper_powder", "tinAndCopperPowder", CreativeTabs.MATERIALS);

    public static final Item RAW_TIN = new ItemBase("raw_tin", "oreRawTin", CreativeTabs.MATERIALS);
    public static final Item RAW_COPPER = new ItemBase("raw_copper", "oreRawCopper", CreativeTabs.MATERIALS);
    public static final Item RAW_PLATINUM = new ItemBase("raw_platinum", "oreRawPlatinum", CreativeTabs.MATERIALS);

    public static final Item COPPER_HELMET = new ArmorBase(
            "copper_helmet", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
    public static final Item COPPER_CHESTPLATE = new ArmorBase(
            "copper_chestplate", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
    public static final Item COPPER_LEGGINGS = new ArmorBase(
            "copper_leggings", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
    public static final Item COPPER_BOOTS = new ArmorBase(
            "copper_boots", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);

    public static final Item COPPER_SWORD = new ToolSword("copper_sword", TOOL_COPPER);
    public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", TOOL_COPPER);
    public static final Item COPPER_AXE = new ToolAxe("copper_axe", TOOL_COPPER);
    public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", TOOL_COPPER);
    public static final Item COPPER_HOE = new ToolHoe("copper_hoe", TOOL_COPPER);

    public static final Item TIN_HELMET = new ArmorBase(
            "tin_helmet", ARMOR_TIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item TIN_CHESTPLATE = new ArmorBase(
            "tin_chestplate", ARMOR_TIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item TIN_LEGGINGS = new ArmorBase(
            "tin_leggings", ARMOR_TIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item TIN_BOOTS = new ArmorBase(
            "tin_boots", ARMOR_TIN, 1, EntityEquipmentSlot.FEET);

    public static final Item TIN_SWORD = new ToolSword("tin_sword", TOOl_TIN);
    public static final Item TIN_PICKAXE = new ToolPickaxe("tin_pickaxe", TOOl_TIN);
    public static final Item TIN_AXE = new ToolAxe("tin_axe", TOOl_TIN);
    public static final Item TIN_SHOVEL = new ToolShovel("tin_shovel", TOOl_TIN);
    public static final Item TIN_HOE = new ToolHoe("tin_hoe", TOOl_TIN);

    public static final Item PLATINUM_HELMET = new ArmorBase(
            "platinum_helmet", ARMOR_PLATINUM, 1, EntityEquipmentSlot.HEAD);
    public static final Item PLATINUM_CHESTPLATE = new ArmorBase(
            "platinum_chestplate", ARMOR_PLATINUM, 1, EntityEquipmentSlot.CHEST);
    public static final Item PLATINUM_LEGGINGS = new ArmorBase(
            "platinum_leggings", ARMOR_PLATINUM, 2, EntityEquipmentSlot.LEGS);
    public static final Item PLATINUM_BOOTS = new ArmorBase(
            "platinum_boots", ARMOR_PLATINUM, 1, EntityEquipmentSlot.FEET);

    public static final Item PLATINUM_SWORD = new ToolSword("platinum_sword", TOOl_PLATINUM);
    public static final Item PLATINUM_PICKAXE = new ToolPickaxe("platinum_pickaxe", TOOl_PLATINUM);
    public static final Item PLATINUM_AXE = new ToolAxe("platinum_axe", TOOl_PLATINUM);
    public static final Item PLATINUM_SHOVEL = new ToolShovel("platinum_shovel", TOOl_PLATINUM);
    public static final Item PLATINUM_HOE = new ToolHoe("platinum_hoe", TOOl_PLATINUM);

    public static final Item BRONZE_HELMET = new ArmorBase(
            "bronze_helmet", ARMOR_BRONZE, 1, EntityEquipmentSlot.HEAD);
    public static final Item BRONZE_CHESTPLATE = new ArmorBase(
            "bronze_chestplate", ARMOR_BRONZE, 1, EntityEquipmentSlot.CHEST);
    public static final Item BRONZE_LEGGINGS = new ArmorBase(
            "bronze_leggings", ARMOR_BRONZE, 2, EntityEquipmentSlot.LEGS);
    public static final Item BRONZE_BOOTS = new ArmorBase(
            "bronze_boots", ARMOR_BRONZE, 1, EntityEquipmentSlot.FEET);
    public static final Item BRONZE_SWORD = new ToolSword("bronze_sword", TOOl_BRONZE);
    public static final Item BRONZE_PICKAXE = new ToolSword("bronze_pickaxe", TOOl_BRONZE);
    public static final Item BRONZE_AXE = new ToolSword("bronze_axe", TOOl_BRONZE);
    public static final Item BRONZE_SHOVEL = new ToolSword("bronze_shovel", TOOl_BRONZE);
    public static final Item BRONZE_HOE = new ToolSword("bronze_hoe", TOOl_BRONZE);


}
