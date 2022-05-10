package kotlins.skills.remember.api.models.product

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("name")
    val title: String,

    @SerializedName("photo_url")
    val photoUrl: String,

    val price: Double,

    val isOnSale: Boolean
)