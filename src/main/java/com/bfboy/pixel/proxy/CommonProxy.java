package com.bfboy.pixel.proxy;

import com.bfboy.pixel.register.ItemsRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author bfboy
 * @date 2019/5/5 - 14:55
 */
public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event){
        new ItemsRegister();
    }
    public void init(FMLInitializationEvent event){}
    public void postInit(FMLPostInitializationEvent event){}
}
