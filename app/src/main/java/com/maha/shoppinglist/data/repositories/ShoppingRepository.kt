package com.maha.shoppinglist.data.repositories

import com.maha.shoppinglist.data.db.ShoppingDatabase
import com.maha.shoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
){
    suspend fun upsert(item:ShoppingItem) = db.getShoppingDao().upsert(item)
    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)
    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}