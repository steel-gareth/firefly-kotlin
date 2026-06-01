// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.MoreConflictingOkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.pets.Category
import com.configure_me_emcees_prod_testing_5.api.models.pets.Pet
import com.configure_me_emcees_prod_testing_5.api.models.pets.PetFindByStatusParams
import com.configure_me_emcees_prod_testing_5.api.models.pets.PetFindByTagsParams
import com.configure_me_emcees_prod_testing_5.api.models.pets.PetUpdateByIdParams
import com.configure_me_emcees_prod_testing_5.api.models.pets.PetUploadImageParams
import com.configure_me_emcees_prod_testing_5.api.models.pets.Tag
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = MoreConflictingOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pet =
            petService.create(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = MoreConflictingOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pet = petService.retrieve(0L)

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = MoreConflictingOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pet =
            petService.update(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = MoreConflictingOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        petService.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByStatus() {
        val client = MoreConflictingOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pets =
            petService.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByTags() {
        val client = MoreConflictingOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pets = petService.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateById() {
        val client = MoreConflictingOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        petService.updateById(
            PetUpdateByIdParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadImage() {
        val client = MoreConflictingOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val response =
            petService.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .image("Example data")
                    .build()
            )

        response.validate()
    }
}
