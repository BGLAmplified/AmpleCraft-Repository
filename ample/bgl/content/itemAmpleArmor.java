package net.ample.bgl.content;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.ample.bgl.AmpleMod;

public class itemAmpleArmor extends ItemArmor {

	private String textureName;

	public itemAmpleArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(AmpleMod.MODID + ":" + unlocalizedName);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return null;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(AmpleStuff.confidenceGoggles))
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
	}

}