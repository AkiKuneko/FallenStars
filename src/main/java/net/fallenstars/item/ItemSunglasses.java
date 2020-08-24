
package net.fallenstars.item;

import net.fallenstars.creativetab.TabFallenStars;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.fallenstars.procedure.ProcedureSunglassesHelmetTickEvent;
import net.fallenstars.ElementsFallenStars;

@ElementsFallenStars.ModElement.Tag
public class ItemSunglasses extends ElementsFallenStars.ModElement {
	@GameRegistry.ObjectHolder("fallenst:sunglasseshelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("fallenst:sunglassesbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("fallenst:sunglasseslegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("fallenst:sunglassesboots")
	public static final Item boots = null;
	public ItemSunglasses(ElementsFallenStars instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SUNGLASSES", "fallenst:sungalsses_", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.cloth.break")), 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureSunglassesHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("sunglasseshelmet").setRegistryName("sunglasseshelmet").setCreativeTab(TabFallenStars.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("fallenst:sunglasseshelmet", "inventory"));
	}
}
