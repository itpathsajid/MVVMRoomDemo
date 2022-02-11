package com.mvvmdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quote")
data class Quote(
    @PrimaryKey(autoGenerate = true)
    val id : Int,

    var text: String,

    var author: String
)
