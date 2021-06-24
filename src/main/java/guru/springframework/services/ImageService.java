package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by: p_sha on: Thu 24 Jun 2021
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
