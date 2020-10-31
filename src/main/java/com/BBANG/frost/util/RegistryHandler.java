package com.BBANG.frost.util;

import com.BBANG.frost.Frost;
import com.BBANG.frost.blocks.AssBlock;
import com.BBANG.frost.blocks.BlockItemBase;
import com.BBANG.frost.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Frost.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Frost.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> Froze = ITEMS.register("froze", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> ASS_BLOCK = BLOCKS.register("ass_block", AssBlock::new);

    // Block Items
    public static final RegistryObject<Item> ASS_BLOCK_ITEM = ITEMS.register("ass_block", () -> new BlockItemBase(ASS_BLOCK.get()));
}
