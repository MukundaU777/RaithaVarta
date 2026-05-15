package com.raithavarta.app.data

import com.raithavarta.app.R
import com.raithavarta.app.model.Tip

object FakeData {

    val tips = listOf(
        Tip(
            R.drawable.paddy,
            "Paddy Protection",
            "Spray neem oil today to prevent pest attack due to rain."
        ),

        Tip(
            R.drawable.coconut,
            "Coconut Care",
            "Add organic fertilizer this week for better growth."
        ),

        Tip(
            R.drawable.tomato,
            "Tomato Farming",
            "Check leaves for fungal spots and avoid overwatering."
        )
    )
}
