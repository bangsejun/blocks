package com.BBANG.frost.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AssBlock extends Block {

        public AssBlock() {
            super(net.minecraft.block.Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE));
        }
    }
