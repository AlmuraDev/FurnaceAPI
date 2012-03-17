package me.znickq.furnaceapi;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.server.FurnaceRecipes;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class SpoutFurnaceRecipes extends FurnaceRecipes {
	private static Map<String, net.minecraft.server.ItemStack> spoutMap = new HashMap<String, net.minecraft.server.ItemStack>();

	public SpoutFurnaceRecipes() {
		super();
	}

	@Override
	public net.minecraft.server.ItemStack a(net.minecraft.server.ItemStack i) {
		String str = i.id + " " + i.getData();
		if (spoutMap.containsKey(str)) {
			return spoutMap.get(str);
		}
		return super.a(i);
	}

	public static void registerSpoutRecipe(ItemStack ingredient, ItemStack result) {
		registerSpoutRecipe(getNotchStack(ingredient), getNotchStack(result));
	}

	private static void registerSpoutRecipe(net.minecraft.server.ItemStack i, net.minecraft.server.ItemStack result) {
		String str = i.id + " " + i.getData();
		spoutMap.put(str, result);

	}

	private static net.minecraft.server.ItemStack getNotchStack(ItemStack is) {
		return (new CraftItemStack(is)).getHandle();
	}

	public static void registerSpoutRecipe(SpoutFurnaceRecipe fRecipe) {
		registerSpoutRecipe(fRecipe.getIngredient(), fRecipe.getResult());
	}

	static {
		try{
		FurnaceRecipes.a = new SpoutFurnaceRecipes();
		} catch(Throwable t) {
			
		}
	}
}
