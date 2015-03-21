package net.ample.bgl.content;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.ample.bgl.AmpleMod;
import net.ample.bgl.content.biome.AmpleLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public final class AmpleStuff {
	
//Declaration
	//Items
	public static Item congealedMilk;
	public static Item confidenceGoggles;
	public static Item congealedMilkBucket;
	public static Item carbonFiber;
	public static Item carbonPlate;
	public static Item integratedPlate;
	public static Item illuminatePlate;
	public static Item paddedPlate;
	public static Item incombustiblePlate;
	public static Item carbonHelm;
	public static Item carbonChestplate;
	public static Item carbonLeggings;
	public static Item carbonBoots;
	
	//Blocks
	public static Block congealedBlock;
	public static Block blockLog;
	public static Block qChest;
	
	//Armor
	public static ArmorMaterial carbon = EnumHelper.addArmorMaterial("carbon", 40, new int[]{6, 16, 8, 6}, 10);


//Creative Tab
	public static CreativeTabs ampleTab = new CreativeTabs("ampleTab"){
		@Override
		public Item getTabIconItem() {
			return AmpleStuff.carbonPlate;
		}
	};	

//is run in the Pre-Init event
    public static final void init(){
    	
    	//Traits
    	congealedBlock = new blockCongealedBlock(Material.sponge).setBlockTextureName(AmpleMod.MODID + ":congealedBlock").setCreativeTab(ampleTab).setBlockName("congealedBlock");
    	qChest = new qChest(0).setBlockName("Quantum Chest").setCreativeTab(AmpleStuff.ampleTab);
    	
    	congealedMilk = new itemCongealedMilk("congealedMilk", 3, 1f, false, new PotionEffect(Potion.blindness.id, 1, 127), new PotionEffect(Potion.confusion.id, 1, 127), new PotionEffect(Potion.digSlowdown.id, 1, 127), new PotionEffect(Potion.hunger.id, 1, 127), new PotionEffect(Potion.poison.id, 0, 127), new PotionEffect(Potion.moveSlowdown.id, 1, 127), new PotionEffect(Potion.weakness.id, 1, 127), new PotionEffect(Potion.wither.id, 0, 127), new PotionEffect(Potion.regeneration.id, 100, 1), new PotionEffect(Potion.damageBoost.id, 1, 127), new PotionEffect(Potion.digSpeed.id, 1, 127), new PotionEffect(Potion.fireResistance.id, 1, 127), new PotionEffect(Potion.invisibility.id, 1, 127), new PotionEffect(Potion.jump.id, 1, 127), new PotionEffect(Potion.resistance.id, 1, 127), new PotionEffect(Potion.waterBreathing.id, 1, 127)).setAlwaysEdible().setCreativeTab(ampleTab);
    	congealedMilkBucket = new itemCongealedMilkBucket().setTextureName(AmpleMod.MODID + ":congealedBucket").setMaxStackSize(1).setCreativeTab(ampleTab).setUnlocalizedName("congealedBucket");
    	carbonFiber = new Item().setCreativeTab(ampleTab).setUnlocalizedName("carbonFiber").setTextureName(AmpleMod.MODID + ":carbonFiber");
    	carbonPlate = new Item().setCreativeTab(ampleTab).setUnlocalizedName("carbonPlate").setTextureName(AmpleMod.MODID + ":carbonPlate");
    	integratedPlate = new Item().setCreativeTab(ampleTab).setUnlocalizedName("integratedPlate").setTextureName(AmpleMod.MODID + ":integratedPlate");
    	illuminatePlate = new Item().setCreativeTab(ampleTab).setUnlocalizedName("illuminatePlate").setTextureName(AmpleMod.MODID + ":illuminatePlate");
    	paddedPlate = new Item().setCreativeTab(ampleTab).setUnlocalizedName("paddedPlate").setTextureName(AmpleMod.MODID + ":paddedPlate");
    	incombustiblePlate = new Item().setCreativeTab(ampleTab).setUnlocalizedName("incombustiblePlate").setTextureName(AmpleMod.MODID + ":incombustiblePlate");
    	carbonHelm = new OSCArmor("carbonHelm", carbon, "carbon", 0).setCreativeTab(ampleTab);
    	carbonChestplate = new OSCArmor("carbonChestplate", carbon, "carbon", 1).setCreativeTab(ampleTab);
    	carbonLeggings = new OSCArmor("carbonLeggings", carbon, "carbon", 2).setCreativeTab(ampleTab);
    	carbonBoots = new OSCArmor("carbonBoots", carbon, "carbon", 3).setCreativeTab(ampleTab);
    	blockLog = new AmpleLog().setBlockName("Log").setCreativeTab(ampleTab);
    	
    	//Registry
    	GameRegistry.registerItem(carbonFiber, "carbonFiber");
    	GameRegistry.registerItem(carbonPlate, "carbonPlate");
    	GameRegistry.registerItem(integratedPlate, "integratedPlate");
    	GameRegistry.registerItem(illuminatePlate, "illuminatePlate");
    	GameRegistry.registerItem(paddedPlate, "paddedPlate");
    	GameRegistry.registerItem(incombustiblePlate, "incombustiblePlate");
    	GameRegistry.registerItem(carbonHelm, "carbonHelm");
    	GameRegistry.registerItem(carbonChestplate, "carbonChestplate");
    	GameRegistry.registerItem(carbonLeggings, "carbonLeggings");
    	GameRegistry.registerItem(carbonBoots, "carbonBoots");
    	GameRegistry.registerItem(congealedMilkBucket, "congealedMilkBucket");
    	GameRegistry.registerBlock(congealedBlock, "congealedBlock");
    	GameRegistry.registerBlock(blockLog, itemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(qChest, "qChest");
    	GameRegistry.registerItem(congealedMilk, "congealedMilk");
    	GameRegistry.addSmelting(Items.milk_bucket, new ItemStack(AmpleStuff.congealedMilkBucket, 1), 0.35F);
        GameRegistry.addShapelessRecipe(new ItemStack(AmpleStuff.carbonFiber), new Object[] {Items.coal, Items.string, Items.string, Items.string});
        GameRegistry.addRecipe(new ItemStack(AmpleStuff.carbonPlate), new Object[] {"SSS", "SCS", "SSS", 'S', AmpleStuff.carbonFiber, 'C', Blocks.coal_block});
        GameRegistry.addShapelessRecipe(new ItemStack(AmpleStuff.integratedPlate), new Object[] {AmpleStuff.carbonPlate, Items.redstone, Items.redstone, Items.redstone});
        GameRegistry.addShapelessRecipe(new ItemStack(AmpleStuff.illuminatePlate), new Object[] {AmpleStuff.carbonPlate, Items.glowstone_dust, Items.glowstone_dust, new ItemStack(Items.potionitem, 1, 8230)});
        GameRegistry.addShapelessRecipe(new ItemStack(AmpleStuff.illuminatePlate), new Object[] {AmpleStuff.carbonPlate, Items.glowstone_dust, Items.glowstone_dust, new ItemStack(Items.potionitem, 1, 8262)});
        GameRegistry.addShapelessRecipe(new ItemStack(AmpleStuff.paddedPlate), new Object[] {AmpleStuff.carbonPlate, Blocks.carpet, Blocks.carpet, Blocks.carpet});
        GameRegistry.addShapelessRecipe(new ItemStack(AmpleStuff.illuminatePlate), new Object[] {AmpleStuff.carbonPlate, Items.netherbrick, Blocks.netherrack, new ItemStack(Items.potionitem, 1, 8259)});
        GameRegistry.addShapelessRecipe(new ItemStack(AmpleStuff.illuminatePlate), new Object[] {AmpleStuff.carbonPlate, Items.netherbrick, Blocks.netherrack, new ItemStack(Items.potionitem, 1, 8227)});
        GameRegistry.addRecipe(new ItemStack(AmpleStuff.carbonChestplate), new Object[] {"R R", "SDS", "SNS", 'S', AmpleStuff.carbonPlate, 'R', AmpleStuff.integratedPlate, 'N', AmpleStuff.incombustiblePlate, 'D', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(AmpleStuff.carbonHelm), new Object[] {"RIR", "SDS", 'S', AmpleStuff.carbonPlate, 'R', AmpleStuff.integratedPlate, 'I', AmpleStuff.illuminatePlate, 'D', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(AmpleStuff.carbonLeggings), new Object[] {"SSS", "RDR", "S S", 'S', AmpleStuff.carbonPlate, 'R', AmpleStuff.integratedPlate, 'D', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(AmpleStuff.carbonBoots), new Object[] {"W W", "RDR", "P P", 'W', AmpleStuff.paddedPlate, 'R', AmpleStuff.integratedPlate, 'P', Blocks.piston, 'D', Items.diamond});
    }
}
