package com.example.base.presentation

import android.view.View

interface BaseMviView<VIEW_STATE, VIEW_INTENT> {
    val rootView: View
    val acceptIntent: (VIEW_INTENT) -> Unit
    fun render(viewState: VIEW_STATE)
}
