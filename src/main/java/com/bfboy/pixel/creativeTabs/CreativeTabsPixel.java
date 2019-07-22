package com.bfboy.pixel.creativeTabs;

import com.bfboy.pixel.register.ItemsRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * @author sdboy
 * @date 2019/5/5 - 15:35
 */
public class CreativeTabsPixel extends CreativeTabs
{
    public static CreativeTabsPixel pixelPainting = new CreativeTabsPixel();

    public CreativeTabsPixel(){
        super("pixelPainting");
    }

    public ItemStack getTabIconItem(){
        return new ItemStack(Items.PAINTING);
    }
}
