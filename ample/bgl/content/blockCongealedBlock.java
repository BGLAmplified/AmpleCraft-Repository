package net.ample.bgl.content;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;

public class blockCongealedBlock extends Block
{
         public blockCongealedBlock( Material material) 
     {
             super(material);
                this.setHardness(0.25F); // 33% harder than diamond
                this.setStepSound(Block.soundTypeCloth);
                this.setCreativeTab(CreativeTabs.tabBlock);
        }
        

        //If the block's drop is an item.
        @Override
        public int quantityDropped(Random p_149745_1_)
        {
            return 4;
        }

        public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
        {
            return AmpleStuff.congealedMilk;
        }
}