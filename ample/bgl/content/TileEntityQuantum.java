package net.ample.bgl.content;

import cpw.mods.fml.common.registry.GameRegistry;
import net.ample.bgl.AmpleMod;

public class TileEntityQuantum {
	public static void registry(){
		registerTileEntities();
	}
	private static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityQChest.class, AmpleMod.MODID);
	}
}
