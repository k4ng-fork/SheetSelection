package com.minibugdev.sheetselection

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SheetSelectionItem(
    val key: String,
    val value: String,
    @DrawableRes val icon: Int? = null
) : Parcelable