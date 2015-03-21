package net.ample.bgl;

import net.ample.bgl.content.AmpleStuff;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void registerRenderStuff(){
		
	}
	
    public void preInit(FMLPreInitializationEvent e) {
    	//Registry of stuff in mod
    	AmpleStuff.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}