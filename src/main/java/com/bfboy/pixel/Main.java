package com.bfboy.pixel;

import com.bfboy.pixel.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "pixel";
    public static final String NAME = "Pixel Painting";
    public static final String VERSION = "1.0";

    @Mod.Instance(MODID)
    public static Main instance;

    @SidedProxy(clientSide = "com.bfboy.pixel.proxy.ClientProxy", serverSide = "com.bfboy.pixel.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public static  void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
