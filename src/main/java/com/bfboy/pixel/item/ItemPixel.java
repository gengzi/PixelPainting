package com.bfboy.pixel.item;

import com.bfboy.pixel.Main;
import com.bfboy.pixel.creativeTabs.CreativeTabsPixel;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.imageio.ImageIO;
import javax.swing.filechooser.FileSystemView;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static net.minecraft.block.BlockColored.COLOR;
import static net.minecraft.block.BlockSandStone.TYPE;
import static net.minecraft.block.BlockStone.VARIANT;

/**
 * @author sdboy
 * @date 2019/5/5 - 15:38
 */
public class ItemPixel extends Item
{
    public int standardHeight;
    public int TOTAL;
    //public String infomation;
    public ItemPixel(String name, int standardHeight, boolean isTrans){
        this.setRegistryName(name);
        this.setUnlocalizedName(Main.MODID+":"+name);
        this.setCreativeTab(CreativeTabsPixel.pixelPainting);
        this.standardHeight = standardHeight;
        //this.infomation = infomation;
        if(isTrans){
            this.TOTAL = 16;
        }else{
            this.TOTAL = 53;
        }
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format(this.getUnlocalizedName()+".1."+"desc"));
    }

    /*public static
    int [][] blockRGB = {
            {225, 225, 225}, // White Wool
            {216, 127, 51 }, // Orange Wool
            {176, 76 , 216}, // Magenta Wool(品红色)
            {102, 153, 216}, // Light Blue Wool(淡蓝色)
            {229, 229, 51 }, // Yellow Wool
            {127, 204, 25 }, // Lime Wool(黄绿色)
            {242, 127, 165}, // Pink Wool
            {76 , 76 , 76 }, // Gray Wool
            {153, 153, 153}, // Light Gray Wool(Sliver)
            {76 , 127, 153}, // Cyan Wool(青色)
            {127, 63 , 178}, // Purple Wool
            {51 , 76 , 178}, // Blue Wool
            {102, 76 , 51 }, // Brown Wool
            {102, 127, 51 }, // Green Wool
            {153, 51 , 51 }, // Red Wool
            {25 , 25 , 25 }, // Black Wool
            {209, 177, 161}, // White Terracotta(陶瓦)
            {159, 82 , 36 }, // Orange Terracotta
            {149, 87 , 108}, // Magenta Terracotta
            {112, 108, 138}, // Light Blue Terracotta
            {186, 133, 36 }, // Yellow Terracotta
            {103, 117, 53 }, // Lime Terracotta
            {160, 77 , 78 }, // Pink Terracotta
            {57 , 41 , 35 }, // Gray Terracotta
            {135, 107, 98 }, // Light Gray Terracotta
            {87 , 92 , 92 }, // Cyan Terracotta
            {122, 73 , 88 }, // Purple Terracotta
            {76 , 62 , 92 }, // Blue Terracotta
            {76 , 50 , 35 }, // Brown Terracotta
            {76 , 82 , 42 }, // Green Terracotta
            {142, 60 , 46 }, // Red Terracotta
            {37 , 22 , 16 }, // Black Terracotta
    };*/



    public static
    int [][] blockRGB = {
            {233, 236, 236}, // White Wool
            {240, 118, 19 }, // Orange Wool
            {189, 68 , 179}, // Magenta Wool(品红色)
            {58 , 175, 217}, // Light Blue Wool(淡蓝色)
            {248, 197, 39 }, // Yellow Wool
            {112, 185, 25 }, // Lime Wool(黄绿色)
            {237, 141, 172}, // Pink Wool
            {62 , 68 , 71 }, // Gray Wool
            {142, 142, 134}, // Light Gray Wool(Sliver)
            {21 , 137, 145}, // Cyan Wool(青色)
            {121, 42 , 172}, // Purple Wool
            {53 , 57 , 157}, // Blue Wool
            {114, 71 , 40 }, // Brown Wool
            {84 , 109, 27 }, // Green Wool
            {160, 39 , 34 }, // Red Wool
            {20 , 21 , 25 }, // Black Wool

            {209, 178, 161}, // White Terracotta(陶瓦)
            {161, 83 , 37 }, // Orange Terracotta
            {149, 88 , 108}, // Magenta Terracotta
            {113, 108, 137}, // Light Blue Terracotta
            {186, 133, 35 }, // Yellow Terracotta
            {103, 117, 52 }, // Lime Terracotta
            {161, 78 , 78 }, // Pink Terracotta
            {57 , 42 , 35 }, // Gray Terracotta
            {135, 106, 97 }, // Light Gray Terracotta
            {86 , 91 , 91 }, // Cyan Terracotta
            {118, 70 , 86 }, // Purple Terracotta
            {74 , 59 , 91 }, // Blue Terracotta
            {77 , 51 , 35 }, // Brown Terracotta
            {76 , 83 , 42 }, // Green Terracotta
            {143, 61 , 46 }, // Red Terracotta
            {37 , 22 , 16 }, // Black Terracotta

            {207, 213, 214}, // White Concrete
            {224, 97 , 0  }, // Orange Concrete
            {169, 48 , 159}, // Magenta Concrete
            {35 , 137, 198}, // Light Blue Concrete
            {240, 175, 21 }, // Yellow Concrete
            {94 , 168, 24 }, // Lime Concrete
            {213, 101, 142}, // Pink Concrete
            {54 , 57 , 61 }, // Gray Concrete
            {125, 125, 115}, // Light Gray Concrete
            {21 , 119, 136}, // Cyan Concrete
            {100, 31 , 156}, // Purple Concrete
            {44 , 46 , 143}, // Blue Concrete
            {96 , 59 , 31 }, // Brown Concrete
            {73 , 91 , 36 }, // Green Concrete
            {142, 32 , 32 }, // Red Concrete
            {8  , 10 , 15 }, // Black Concrete

            {97 , 219, 213}, // Block of Diamond
            {249, 236, 78 }, // Block of Gold
            {219, 211, 161}, // Smooth Sandstone
            {133, 133, 134}, // Polished Andesite
            {159, 114, 98 }, // Polished Granite
    };

    IBlockState[] blockState = new IBlockState[]{
            Blocks.DIAMOND_BLOCK.getDefaultState(),
            Blocks.GOLD_BLOCK.getDefaultState(),
            Blocks.SANDSTONE.getDefaultState().withProperty(TYPE, BlockSandStone.EnumType.SMOOTH),
            Blocks.STONE.getDefaultState().withProperty(VARIANT, BlockStone.EnumType.ANDESITE_SMOOTH),
            Blocks.STONE.getDefaultState().withProperty(VARIANT, BlockStone.EnumType.GRANITE_SMOOTH),
    };



    public static
    int [][] glass_colors = {
            {255, 255, 255}, // White Glass
            {216, 127, 51 }, // Orange Glass
            {178, 76 , 216}, // Magenta Glass
            {102, 153, 216}, // Light Blue Glass
            {229, 229, 51 }, // Yellow Glass
            {127, 204, 25 }, // Lime Glass
            {242, 127, 165}, // Pink Glass
            {76 , 76 , 76 }, // Gray Glass
            {153, 153, 153}, // Light Gray Glass
            {76 , 127, 153}, // Cyan Glass
            {127, 63 , 178}, // Purple Glass
            {51 , 76 , 178}, // Blue Glass
            {102, 76 , 51 }, // Brown Glass
            {102, 127, 51 }, // Green Glass
            {153, 51 , 51 }, // Red Glass
            {25 , 25 , 25 }, // Black Glass
    };

    /**
     * 计算两个像素之间的1距离
     * @param c1
     * @param c2
     * @return double distance
     */
    public static double colorDistance(int[] c1,int[] c2){
        long rmean = (c1[0] + c2[0]) / 2;
        long r = c1[0] - c2[0], g = c1[1] - c2[1], b = c1[2] - c2[2];
        return Math.sqrt((((512+rmean)*r*r)>>8) + 4*g*g +  (((767-rmean)*b*b)>>8));
    }

    public static int mapColor(int[] c, int total){
        int id = -1;
        double min_dist = 100000000.0;
        for(int i = 0; i < total; i++){
            double dis;
            if(total == 16){
                dis = colorDistance(c,glass_colors[i]);
            }else {
                dis = colorDistance(c, blockRGB[i]);
            }
            if(dis < min_dist){
                min_dist = dis;
                id = i;
            }
        }
        return id;
    }

    public void draw(String srcImagePath, World world, EntityPlayer player)throws IOException {
        BlockPos pos = player.getPosition();
        FileOutputStream out = null;
        try{
            String[] filePath = {".png", ".jpg", ".jpeg", ".bmp", ".gif", ".tiff", ".tif"};
            File file = new File(srcImagePath);
            if(!file.exists()) {
                for (String s : filePath) {
                    file = new File(srcImagePath + s);
                    if (file.exists()) {
                        break;
                    }
                }
            }

            // 构造Image对象
            BufferedImage src = ImageIO.read(file);
            int width = src.getWidth();
            int height = src.getHeight();
            double ratio = height*1.0 / standardHeight;
            // 缩小
            if(standardHeight != 10000) {
                width = Math.round((float) (width * 1.0 / ratio));
                height = Math.round((float) (height * 1.0 / ratio));
            }

            BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            // 绘制 缩小  后的图片
            tag.getGraphics().drawImage(src, 0, 0, width, height, null);
            for(int i = 0; i < width; i++){
                for(int j = 0; j < height; j++){
                    int [] rgb = new int[3];
                    int pixel = tag.getRGB(i, j);
                    rgb[0] = (pixel & 0xff0000) >> 16; //r
                    rgb[1] = (pixel & 0xff00) >> 8; //g
                    rgb[2] = (pixel & 0xff); //b
                    int id = mapColor(rgb, TOTAL);
                    IBlockState state;
                    if(id >=48){
                        state = blockState[id%48];
                    }else if(id >= 32){
                        state = Blocks.CONCRETE.getDefaultState().withProperty(COLOR, EnumDyeColor.byMetadata(id%32));
                    }else if(id >= 16){
                        state = Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(COLOR, EnumDyeColor.byMetadata(id%16));
                    }else{
                        if(TOTAL == 16){
                            state = Blocks.STAINED_GLASS.getDefaultState().withProperty(COLOR, EnumDyeColor.byMetadata(id));
                        }else {
                            state = Blocks.WOOL.getDefaultState().withProperty(COLOR, EnumDyeColor.byMetadata(id));
                        }
                    }
                    BlockPos position;
                    if(standardHeight > 250){
                        position = new BlockPos(width - i - 1 + pos.getX() + 1, pos.getY(), height - j - 1 + pos.getZ());
                    }else {
                        position = new BlockPos(width - i - 1 + pos.getX() + 1, height - j - 1 + pos.getY(), pos.getZ());
                    }
                    world.setBlockState(position, state);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(out != null){
                out.close();
            }
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
        //itemStack.shrink(1);
        if(worldIn.isRemote){
            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStack);
        }
        if(!playerIn.isCreative()){
            itemStack.setCount(itemStack.getCount()-1);
        }
        try{
            String p = FileSystemView.getFileSystemView().getHomeDirectory().getPath();
            String path = p.replace("\\", "/") + "/img.png";
            draw(path,worldIn,playerIn);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStack);
    }

}
