package com.binogurestudio.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ElytraCraft extends JavaPlugin {
    // Fired when plugin is first enabled
    public void onEnable() {
    	ItemStack itemstack = new ItemStack(Material.ELYTRA);
    	NamespacedKey namespacedKey = new NamespacedKey(this, "elytraPlus");

    	ShapedRecipe recipe = new ShapedRecipe(namespacedKey, itemstack);
    	
    	recipe.shape(new String[] {
			"WVW",
			"L L",
			"S S"
		});
    			
    	recipe.setIngredient('S', Material.STICK);
    	recipe.setIngredient('L', Material.LEATHER);
    	recipe.setIngredient('W', Material.WOOL);
    	recipe.setIngredient('V', Material.FEATHER);
    	
    	Bukkit.addRecipe(recipe);
    }

    // Fired when plugin is disabled
    public void onDisable() {

    }
}
