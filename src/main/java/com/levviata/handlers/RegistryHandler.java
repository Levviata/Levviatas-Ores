package com.levviata.handlers;

import com.levviata.init.BlockInit;
import com.levviata.init.ItemInit;
import com.levviata.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.levviata.config.Config.*;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        for (Item item : ItemInit.ITEMS) {

            if (    item == ItemInit.RAW_TIN && enableTinItem                   ||
                    item == ItemInit.RAW_COPPER && enableCopperItem             ||
                    item == ItemInit.RAW_PLATINUM && enablePlatinumItem         ||

                    item == ItemInit.TIN_INGOT && enableTinItem                 ||
                    item == ItemInit.COPPER_INGOT && enableCopperItem           ||
                    item == ItemInit.PLATINUM_INGOT && enablePlatinumItem       ||
                    item == ItemInit.TIN_AND_COPPER_POWDER && enableTinItem     ||

                    item == ItemInit.BRONZE_INGOT && enableBronzeItem           ||
                    item == ItemInit.TIN_SWORD && enableTinItem                 ||
                    item == ItemInit.TIN_AXE && enableTinItem                   ||
                    item == ItemInit.TIN_HOE && enableTinItem                   ||
                    item == ItemInit.TIN_PICKAXE && enableTinItem               ||
                    item == ItemInit.TIN_SHOVEL && enableTinItem                ||

                    item == ItemInit.COPPER_SWORD && enableCopperItem           ||
                    item == ItemInit.COPPER_AXE && enableCopperItem             ||
                    item == ItemInit.COPPER_HOE && enableCopperItem             ||
                    item == ItemInit.COPPER_PICKAXE && enableCopperItem         ||
                    item == ItemInit.COPPER_SHOVEL && enableCopperItem          ||

                    item == ItemInit.PLATINUM_SWORD && enablePlatinumItem       ||
                    item == ItemInit.PLATINUM_AXE && enablePlatinumItem         ||
                    item == ItemInit.PLATINUM_HOE && enablePlatinumItem         ||
                    item == ItemInit.PLATINUM_PICKAXE && enablePlatinumItem     ||
                    item == ItemInit.PLATINUM_SHOVEL && enablePlatinumItem      ||

                    item == ItemInit.BRONZE_SWORD && enableBronzeItem           ||
                    item == ItemInit.BRONZE_AXE && enableBronzeItem             ||
                    item == ItemInit.BRONZE_HOE && enableBronzeItem             ||
                    item == ItemInit.BRONZE_PICKAXE && enableBronzeItem         ||
                    item == ItemInit.BRONZE_SHOVEL && enableBronzeItem          ||

                    item == ItemInit.TIN_HELMET && enableTinItem                ||
                    item == ItemInit.TIN_CHESTPLATE && enableTinItem            ||
                    item == ItemInit.TIN_LEGGINGS && enableTinItem              ||
                    item == ItemInit.TIN_BOOTS && enableTinItem                 ||

                    item == ItemInit.COPPER_HELMET && enableCopperItem          ||
                    item == ItemInit.COPPER_CHESTPLATE && enableCopperItem      ||
                    item == ItemInit.COPPER_LEGGINGS && enableCopperItem        ||
                    item == ItemInit.COPPER_BOOTS && enableCopperItem           ||

                    item == ItemInit.PLATINUM_HELMET && enablePlatinumItem      ||
                    item == ItemInit.PLATINUM_CHESTPLATE && enablePlatinumItem  ||
                    item == ItemInit.PLATINUM_LEGGINGS && enablePlatinumItem    ||
                    item == ItemInit.PLATINUM_BOOTS && enablePlatinumItem       ||

                    item == ItemInit.BRONZE_HELMET && enableBronzeItem          ||
                    item == ItemInit.BRONZE_CHESTPLATE && enableBronzeItem      ||
                    item == ItemInit.BRONZE_LEGGINGS && enableBronzeItem        ||
                    item == ItemInit.BRONZE_BOOTS && enableBronzeItem
            ) {
                event.getRegistry().register(item);
            }
        }
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        for (Block block : BlockInit.BLOCKS) {
            if (    block == BlockInit.TIN_ORE && enableTinBlock                    ||
                    block == BlockInit.RAW_TIN_BLOCK && enableTinBlock              ||
                    block == BlockInit.COPPER_ORE && enableCopperBlock              ||
                    block == BlockInit.RAW_COPPER_BLOCK && enableCopperBlock        ||
                    block == BlockInit.PLATINUM_ORE && enablePlatinumBlock          ||
                    block == BlockInit.RAW_PLATINUM_BLOCK && enablePlatinumBlock
            ) {
                event.getRegistry().register(block);
            }
        }
        //event.getRegistry().registerAll(blocksFromConfig.toArray(new Block[0]));
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
}
