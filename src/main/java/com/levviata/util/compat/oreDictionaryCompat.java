package com.levviata.util.compat;

import com.levviata.init.BlockInit;
import com.levviata.init.ItemInit;
import net.minecraftforge.oredict.OreDictionary;

public class oreDictionaryCompat {
    public static void init() {
        OreDictionary.registerOre("ingotTin", ItemInit.TIN_INGOT);
        OreDictionary.registerOre("ingotCopper", ItemInit.COPPER_INGOT);
        OreDictionary.registerOre("ingotPlatinum", ItemInit.PLATINUM_INGOT);

        OreDictionary.registerOre("oreTin", BlockInit.TIN_ORE);
        OreDictionary.registerOre("oreCopper", BlockInit.COPPER_ORE);
        OreDictionary.registerOre("orePlatinum", BlockInit.PLATINUM_ORE);

        OreDictionary.registerOre("blockTin", BlockInit.RAW_TIN_BLOCK);
        OreDictionary.registerOre("blockCopper", BlockInit.RAW_COPPER_BLOCK);
        OreDictionary.registerOre("blockPlatinum", BlockInit.RAW_PLATINUM_BLOCK);

        OreDictionary.registerOre("rawTin", ItemInit.RAW_TIN);
        OreDictionary.registerOre("rawCopper", ItemInit.RAW_COPPER);
        OreDictionary.registerOre("rawPlatinum", ItemInit.RAW_PLATINUM);
    }
}
