package com.b.alkhatib.cinematicketsreservations.modifier

import androidx.compose.foundation.ExperimentalFoundationApi
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
fun PagerState.calculateCurrentOffsetForPage(page: Int): Float {
    return (currentPage - page) + currentPageOffset
}