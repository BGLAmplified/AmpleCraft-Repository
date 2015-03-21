package net.ample.bgl;

import net.ample.bgl.content.TileEntityQuantum;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = AmpleMod.MODID, name = AmpleMod.MODNAME, version = AmpleMod.VERSION)
public class AmpleMod {

//Reference Strings
        public static final String MODID = "ample";
        public static final String MODNAME = "AmpleCraft";
        public static final String VERSION = "0.1.0";
        
//Proxy Reference
        @SidedProxy(clientSide="net.ample.bgl.ClientProxy", serverSide="net.ample.bgl.ServerProxy")
        public static CommonProxy proxy;
        public static ServerProxy sproxy;
        
//Mod Reference
        @Mod.Instance(MODID)
        public static AmpleMod instance = new AmpleMod();
        
        
//Reads config, creates blocks, items, etc, and registers with the GameRegistry.
        @EventHandler
        public void preInit(FMLPreInitializationEvent e) {
        	this.proxy.preInit(e);
        }
        
//For structuring data and initializing recipes
        @EventHandler
        public void init(FMLInitializationEvent e) {
        	this.proxy.registerRenderStuff();
        	this.proxy.init(e);
        	TileEntityQuantum.registry();
        	System.out.println("Hello? ... Is it me your looking for?");
        }
        
//Handle interaction with other mods, complete your setup based on this.
        @EventHandler
        public void postInit(FMLPostInitializationEvent e) {
        	this.proxy.postInit(e);
        }
}