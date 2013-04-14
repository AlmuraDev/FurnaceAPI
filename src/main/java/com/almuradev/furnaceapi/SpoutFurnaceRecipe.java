package com.almuradev.furnaceapi;

import org.getspout.spoutapi.inventory.SpoutItemStack;

public class SpoutFurnaceRecipe {
	private SpoutItemStack ingredient;
	private SpoutItemStack result;

	public SpoutFurnaceRecipe(SpoutItemStack ingredient, SpoutItemStack result) {
		this.ingredient = ingredient;
		this.result = result;
	}

	public SpoutItemStack getIngredient() {
		return ingredient;
	}

	public SpoutItemStack getResult() {
		return result;
	}

}
