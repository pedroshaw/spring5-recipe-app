package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by: p_sha on: Wed 31 Mar 2021
 */
public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {
        Recipe recipe = new Recipe();
        HashSet recipeData = new HashSet();
        recipeData.add(recipe);

        // Mock a call to the method and return recipe Data
        when(recipeRepository.findAll()).thenReturn(recipeData);

        Set<Recipe> recipeSet = recipeService.getRecipes();

        assertEquals(recipeSet.size(), 1);

        // Verify that the recipeRepository findAll method was called 1 time
        verify(recipeRepository, times(1)).findAll();

    }
}