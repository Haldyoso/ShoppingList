package com.maha.shoppinglist.ui.shoppinglist

import com.maha.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}