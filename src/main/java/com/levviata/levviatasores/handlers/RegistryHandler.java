package com.levviata.levviatasores.handlers;

import com.levviata.levviatasores.init.BlockInit;
import com.levviata.levviatasores.init.ItemInit;
import com.levviata.levviatasores.recipes.CraftingRecipes;
import com.levviata.levviatasores.utils.IHasModel;
import com.levviata.levviatasores.utils.compat.oreDictionaryCompat;
import com.levviata.levviatasores.gen.WorldGenOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;
import java.util.logging.Logger;

import static com.levviata.levviatasores.config.Config.*;

@Mod.EventBusSubscriber
public class RegistryHandler {
    private static Logger logger = Logger.getLogger(RegistryHandler.class.getName());

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ItemInit.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModels();
            }
        }
        for (Block block : BlockInit.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
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

