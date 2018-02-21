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
    	ItemStack item = new ItemStack(Material.ELYTRA, 1);

    	NamespacedKey namespacedKey = new NamespacedKey(this, this.getClass().getSimpleName());

    	ShapedRecipe recipe = new ShapedRecipe(namespacedKey, item);
    	
    	recipe.shape(new String[] {
			"PWP",
			"PSP",
			"F F"
		});
    			
    	recipe.setIngredient('W', Material.STICK);
    	recipe.setIngredient('P', Material.PAPER);
    	recipe.setIngredient('S', Material.STRING);
    	recipe.setIngredient('F', Material.FEATHER);
    	
    	Bukkit.addRecipe(recipe);
    }

    // Fired when plugin is disabled
    public void onDisable() {

    }
}
