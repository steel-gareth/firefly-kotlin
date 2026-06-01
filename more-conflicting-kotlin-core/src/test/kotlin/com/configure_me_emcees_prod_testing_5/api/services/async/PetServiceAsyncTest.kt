// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.MoreConflictingOkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.pets.Category
import com.configure_me_emcees_prod_testing_5.api.models.pets.Pet
import com.configure_me_emcees_prod_testing_5.api.models.pets.PetFindByStatusParams
import com.configure_me_emcees_prod_testing_5.api.models.pets.PetFindByTagsParams
import com.configure_me_emcees_prod_testing_5.api.models.pets.PetUpdateByIdParams
import com.configure_me_emcees_prod_testing_5.api.models.pets.PetUploadImageParams
import com.configure_me_emcees_prod_testing_5.api.models.pets.Tag
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pet =
            petServiceAsync.create(
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
    suspend fun retrieve() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pet = petServiceAsync.retrieve(0L)

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pet =
            petServiceAsync.update(
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
    suspend fun delete() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        petServiceAsync.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun findByStatus() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pets =
            petServiceAsync.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun findByTags() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pets =
            petServiceAsync.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun updateById() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        petServiceAsync.updateById(
            PetUpdateByIdParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun uploadImage() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val response =
            petServiceAsync.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .image("Example data")
                    .build()
            )

        response.validate()
    }
}
