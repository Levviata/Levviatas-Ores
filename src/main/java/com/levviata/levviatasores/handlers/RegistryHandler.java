package com.levviata.levviatasores.handlers;

import com.levviata.levviatasores.init.BlockInit;
import com.levviata.levviatasores.init.ItemInit;
import com.levviata.levviatasores.recipes.CraftingRecipes;
import com.levviata.levviatasores.utils.IHasModel;
import com.levviata.levviatasores.utils.compat.oreDictionaryCompat;
import com.levviata.levviatasores.gen.WorldGenOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.logging.Logger;

import static com.levviata.levviatasores.config.Config.*;

@Mod.EventBusSubscriber
public class RegistryHandler {
    private static Logger logger = Logger.getLogger(RegistryHandler.class.getName());
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        for (Item item : ItemInit.ITEMS) {
            boolean shouldNotRegister =
                item == ItemInit.RAW_TIN && !enableTinItem                   ||
                item == ItemInit.RAW_COPPER && !enableCopperItem             ||
                item == ItemInit.RAW_PLATINUM && !enablePlatinumItem         ||

                item == ItemInit.TIN_INGOT && !enableTinItem                 ||
                item == ItemInit.COPPER_INGOT && !enableCopperItem           ||
                item == ItemInit.PLATINUM_INGOT && !enablePlatinumItem       ||
                item == ItemInit.TIN_AND_COPPER_POWDER && !enableTinItem     ||

                item == ItemInit.BRONZE_INGOT && !enableBronzeItem           ||
                item == ItemInit.TIN_SWORD && !enableTinItem                 ||
                item == ItemInit.TIN_AXE && !enableTinItem                   ||
                item == ItemInit.TIN_HOE && !enableTinItem                   ||
                item == ItemInit.TIN_PICKAXE && !enableTinItem               ||
                item == ItemInit.TIN_SHOVEL && !enableTinItem                ||

                item == ItemInit.COPPER_SWORD && !enableCopperItem           ||
                item == ItemInit.COPPER_AXE && !enableCopperItem             ||
                item == ItemInit.COPPER_HOE && !enableCopperItem             ||
                item == ItemInit.COPPER_PICKAXE && !enableCopperItem         ||
                item == ItemInit.COPPER_SHOVEL && !enableCopperItem          ||

                item == ItemInit.PLATINUM_SWORD && !enablePlatinumItem       ||
                item == ItemInit.PLATINUM_AXE && !enablePlatinumItem         ||
                item == ItemInit.PLATINUM_HOE && !enablePlatinumItem         ||
                item == ItemInit.PLATINUM_PICKAXE && !enablePlatinumItem     ||
                item == ItemInit.PLATINUM_SHOVEL && !enablePlatinumItem      ||

                item == ItemInit.BRONZE_SWORD && !enableBronzeItem           ||
                item == ItemInit.BRONZE_AXE && !enableBronzeItem             ||
                item == ItemInit.BRONZE_HOE && !enableBronzeItem             ||
                item == ItemInit.BRONZE_PICKAXE && !enableBronzeItem         ||
                item == ItemInit.BRONZE_SHOVEL && !enableBronzeItem          ||

                item == ItemInit.TIN_HELMET && !enableTinItem                ||
                item == ItemInit.TIN_CHESTPLATE && !enableTinItem            ||
                item == ItemInit.TIN_LEGGINGS && !enableTinItem              ||
                item == ItemInit.TIN_BOOTS && !enableTinItem                 ||

                item == ItemInit.COPPER_HELMET && !enableCopperItem          ||
                item == ItemInit.COPPER_CHESTPLATE && !enableCopperItem      ||
                item == ItemInit.COPPER_LEGGINGS && !enableCopperItem        ||
                item == ItemInit.COPPER_BOOTS && !enableCopperItem           ||

                item == ItemInit.PLATINUM_HELMET && !enablePlatinumItem      ||
                item == ItemInit.PLATINUM_CHESTPLATE && !enablePlatinumItem  ||
                item == ItemInit.PLATINUM_LEGGINGS && !enablePlatinumItem    ||
                item == ItemInit.PLATINUM_BOOTS && !enablePlatinumItem       ||

                item == ItemInit.BRONZE_HELMET && !enableBronzeItem          ||
                item == ItemInit.BRONZE_CHESTPLATE && !enableBronzeItem      ||
                item == ItemInit.BRONZE_LEGGINGS && !enableBronzeItem        ||
                item == ItemInit.BRONZE_BOOTS && !enableBronzeItem;

            if (shouldNotRegister) {
                continue;
            }
            // Register the item since it does not match any of the conditions to be excluded
            event.getRegistry().register(item);
        }
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        for (Block block : BlockInit.BLOCKS) {
            //No idea how this work but it does so Im happy
            boolean shouldNotRegister = block == BlockInit.TIN_ORE && !enableTinBlock      ||
                    block == BlockInit.TIN_ORE_ANDESITE && !enableTinBlock           ||
                    block == BlockInit.TIN_ORE_DIORITE && !enableTinBlock            ||
                    block == BlockInit.TIN_ORE_GRANITE && !enableTinBlock            ||
                    block == BlockInit.RAW_TIN_BLOCK && !enableTinBlock              ||
                    block == BlockInit.COPPER_ORE && !enableCopperBlock              ||
                    block == BlockInit.COPPER_ORE_ANDESITE && !enableCopperBlock     ||
                    block == BlockInit.COPPER_ORE_DIORITE && !enableCopperBlock      ||
                    block == BlockInit.COPPER_ORE_GRANITE && !enableCopperBlock      ||
                    block == BlockInit.RAW_COPPER_BLOCK && !enableCopperBlock        ||
                    block == BlockInit.PLATINUM_ORE && !enablePlatinumBlock          ||
                    block == BlockInit.PLATINUM_ORE_ANDESITE && !enablePlatinumBlock ||
                    block == BlockInit.PLATINUM_ORE_DIORITE && !enablePlatinumBlock  ||
                    block == BlockInit.PLATINUM_ORE_GRANITE && !enablePlatinumBlock  ||
                    block == BlockInit.RAW_PLATINUM_BLOCK && !enablePlatinumBlock;
            if (shouldNotRegister) {
                continue;
            }
            // Register the block since it does not match any of the conditions to be excluded
            event.getRegistry().register(block);
            logger.info("Registered block: " + block.getRegistryName());
        }
        //event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item : ItemInit.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
            }
        }
        for(Block block : BlockInit.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel)block).registerModels();
            }
        }
    }
    public static void preInit() {
        WorldGenOres.preInit();
    }
    public static void init() {
        CraftingRecipes.init();
        oreDictionaryCompat.init();
    }
    public static void postInit() {
    }
}
