package com.bfboy.pixel.register;

import com.bfboy.pixel.item.ItemPixel;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class ItemsRegister
{
    public ItemsRegister(){
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final ItemPixel PIXEL_XS = new ItemPixel("pixel_xs",50, false);
    public static final ItemPixel PIXEL_S = new ItemPixel("pixel_s",100, false);
    public static final ItemPixel PIXEL_M = new ItemPixel("pixel_m",150, false);
    public static final ItemPixel PIXEL_L = new ItemPixel("pixel_l",200, false);
    public static final ItemPixel PIXEL_XL = new ItemPixel("pixel_xl",250, false);
    public static final ItemPixel PIXEL_XXL = new ItemPixel("pixel_xxl",300, false);
    public static final ItemPixel PIXEL_XXXL = new ItemPixel("pixel_xxxl",400, false);
    public static final ItemPixel PIXEL_XXXXL = new ItemPixel("pixel_xxxxl",500, false);

    public static final ItemPixel TRANS_PIXEL_XS = new ItemPixel("trans_pixel_xs",50, true);
    public static final ItemPixel TRANS_PIXEL_S = new ItemPixel("trans_pixel_s",100, true);
    public static final ItemPixel TRANS_PIXEL_M = new ItemPixel("trans_pixel_m",150, true);
    public static final ItemPixel TRANS_PIXEL_L = new ItemPixel("trans_pixel_l",200, true);
    public static final ItemPixel TRANS_PIXEL_XL = new ItemPixel("trans_pixel_xl",250, true);

    public static final ItemPixel PIXEL_ORIGIN = new ItemPixel("pixel_origin",10000, false);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                PIXEL_XS, PIXEL_S, PIXEL_M, PIXEL_L, PIXEL_XL, PIXEL_XXL, PIXEL_XXXL, PIXEL_XXXXL,
                TRANS_PIXEL_XS,TRANS_PIXEL_S,TRANS_PIXEL_M,TRANS_PIXEL_L,TRANS_PIXEL_XL,
                PIXEL_ORIGIN
        );
    }
}