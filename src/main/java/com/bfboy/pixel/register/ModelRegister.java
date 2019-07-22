package com.bfboy.pixel.register;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author sdboy
 * @date 2019/5/5 - 16:15
 */
public class ModelRegister
{
    public ModelRegister(){
        MinecraftForge.EVENT_BUS.register((this));
    }

    @SubscribeEvent
    public void registerItemModels(ModelRegistryEvent event){
        registerItemModel(ItemsRegister.PIXEL_XS);
        registerItemModel(ItemsRegister.PIXEL_S);
        registerItemModel(ItemsRegister.PIXEL_M);
        registerItemModel(ItemsRegister.PIXEL_L);
        registerItemModel(ItemsRegister.PIXEL_XL);
        registerItemModel(ItemsRegister.PIXEL_XXL);
        registerItemModel(ItemsRegister.PIXEL_XXXL);
        registerItemModel(ItemsRegister.PIXEL_XXXXL);

        registerItemModel(ItemsRegister.TRANS_PIXEL_XS);
        registerItemModel(ItemsRegister.TRANS_PIXEL_S);
        registerItemModel(ItemsRegister.TRANS_PIXEL_M);
        registerItemModel(ItemsRegister.TRANS_PIXEL_L);
        registerItemModel(ItemsRegister.TRANS_PIXEL_XL);

        registerItemModel(ItemsRegister.PIXEL_ORIGIN);
    }

    private void registerItemModel(Item item) {
        // 注册物品模型,参数解析
        // item 是我们要注册的物品
        // 0表示物品的Metadata，举个简单的例子，木板有多个Metadata表示不同的颜色
        // ModelResourceLocation被用于标注模型的位置，通常为由冒号（:）和井号（#）分隔的三个字符串组成，对于我们这里构造的ModelResourceLocation，
        // 它的一部分通过调用物品的getRegistryName方法得到，第二部分由我们指定，为inventory，是一个固定的字符串，代表作为一个物品的渲染模型。
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
