package com.bfboy.pixel.proxy;

import com.bfboy.pixel.register.ModelRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author sdboy
 * @date 2019/5/5 - 14:57
 */
public class ClientProxy extends CommonProxy
{
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
        new ModelRegister();
    }

    public void init(FMLInitializationEvent event){
        super.init(event);
    }

    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }
}
