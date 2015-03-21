package net.ample.bgl;

import net.ample.bgl.content.AmpleStuff;
import net.ample.bgl.content.ItemRendererQChest;
import net.ample.bgl.content.TileEntityQChest;
import net.ample.bgl.content.qChestRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void registerRenderStuff(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityQChest.class, new qChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(AmpleStuff.qChest), new ItemRendererQChest());
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

}

