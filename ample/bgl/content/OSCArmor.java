package net.ample.bgl.content;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Attributes;

import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.ample.bgl.AmpleMod;
import net.amplifiedgames.acousticcraft.AcousticCraft;
import net.amplifiedgames.acousticcraft.Strings;

public class OSCArmor extends ItemArmor {

	private String textureName;
	public float speed;

	public OSCArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(AmpleMod.MODID + ":" + unlocalizedName);
	}

//8198 8262
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return AmpleMod.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(AmpleStuff.carbonLeggings))
			player.setSprinting(true);
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(AmpleStuff.carbonHelm))
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 220, 0));
		if (player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(AmpleStuff.carbonChestplate))
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 0));
		if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(AmpleStuff.carbonBoots))
			player.fallDistance = player.fallDistance*(1/4);
		if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(AmpleStuff.carbonBoots))
			player.stepHeight = 1;
		else
			player.stepHeight = 0.5F;
	}

}