package net.ample.bgl.content;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class itemLogBlocks extends ItemBlock{

	public static final String[] logs = new String[] {"Pine"};
	
	public itemLogBlocks(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= logs.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + logs[i];		
	}

	public int getMetaData(int meta){
		return meta;
	}
}
