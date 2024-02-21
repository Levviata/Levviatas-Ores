package com.levviata.handlers;

import com.levviata.init.BlockInit;
import com.levviata.init.ItemInit;
import com.levviata.recipes.CraftingRecipes;
import com.levviata.util.IHasModel;
import com.levviata.util.compat.oreDictionaryCompat;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.levviata.config.BlockConfig.*;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        for (Item item : ItemInit.ITEMS) {
            if (item == ItemInit.RAW_TIN && enableTin ||
                    item == ItemInit.RAW_COPPER && enableCopper ||
                    item == ItemInit.RAW_PLATINUM && enablePlatinum) {
                event.getRegistry().register(item);
            }
            if (item != ItemInit.RAW_TIN ||
                    item != ItemInit.RAW_COPPER ||
                    item != ItemInit.RAW_PLATINUM) {
                event.getRegistry().register(item);
            }
        }
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        for (Block block : BlockInit.BLOCKS) {
            if (block == BlockInit.TIN_ORE && enableTin ||
                    block == BlockInit.RAW_TIN_BLOCK && enableTin ||
                    block == BlockInit.COPPER_ORE && enableCopper ||
                    block == BlockInit.RAW_COPPER_BLOCK && enableCopper ||
                    block == BlockInit.PLATINUM_ORE && enablePlatinum ||
                    block == BlockInit.RAW_PLATINUM_BLOCK && enablePlatinum) {
                event.getRegistry().register(block);
            }
            if (block != BlockInit.TIN_ORE &&
                    block != BlockInit.RAW_TIN_BLOCK &&
                    block != BlockInit.COPPER_ORE &&
                    block != BlockInit.RAW_COPPER_BLOCK &&
                    block != BlockInit.PLATINUM_ORE &&
                    block != BlockInit.RAW_PLATINUM_BLOCK) {
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
    public static void preInit() {
    }
    public static void init() {
        CraftingRecipes.init();
        oreDictionaryCompat.init();
    }
    public static void postInit() {
    }

}
