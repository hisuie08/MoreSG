package moresg;

import moresg.init.InitItems;
import moresg.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;



@Mod(modid = MoreSG.MODID, name = MoreSG.NAME, version = MoreSG.VERSION)
public class MoreSG
{
    public static final String MODID = "moresg";
    public static final String NAME = "MoreSG";
    public static final String VERSION = "1.0";

    public static Logger logger;

    public static final String CLIENT_PROXY = "moresg.proxy.ClientProxy";
    public static final String SERVER_PROXY = "moresg.proxy.ServerProxy";
    public static final CreativeTabs creativeTabs = new CreativeTabs("moresg:moresg") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(InitItems.NAQUADAH_AXE);
        }
    };


    @Mod.Instance
    public static MoreSG instance;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        InitItems.init();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }

}
