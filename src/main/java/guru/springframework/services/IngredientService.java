package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by: p_sha on: Thu 29 Apr 2021
 */
public interface IngredientService {

    IngredientCommand findByRecipeAndIngredientId(Long recipeId, Long ingredientId);
}
