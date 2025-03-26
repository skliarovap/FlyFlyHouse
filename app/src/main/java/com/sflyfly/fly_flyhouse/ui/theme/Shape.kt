package com.sflyfly.fly_flyhouse.ui.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

data class JetTourByPlanets (
    val small:CornerBasedShape,
    val medium:CornerBasedShape,
    val large:CornerBasedShape,
    val dialog: CornerBasedShape
)

val Shapes = JetTourByPlanets(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp) ,
    dialog = RoundedCornerShape(24.dp)
)