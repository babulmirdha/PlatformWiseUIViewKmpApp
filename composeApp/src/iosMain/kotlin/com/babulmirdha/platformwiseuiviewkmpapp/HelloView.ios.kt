package com.babulmirdha.platformwiseuiviewkmpapp
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.UIKitViewController

@Composable
actual fun HelloView(modifier: Modifier) {
    val factory = LocalNativeViewFactory.current

    UIKitViewController(
        modifier = modifier
            .width(200.dp)
            .height(100.dp), // adjust dimensions as needed
        factory = {
            factory.createHelloSwiftView()
        }
    )
}
