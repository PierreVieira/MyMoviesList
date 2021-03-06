package com.example.mymovieslist.data.model.screens.more.clickable.settings

import com.example.mymovieslist.R
import com.example.mymovieslist.data.model.screens.more.clickable.ClickableMoreItem
import com.example.mymovieslist.enums.MenuOptionType
import com.example.mymovieslist.enums.MoreItemType

class MenuIconsItem(
    var currentMenuOptionType: MenuOptionType
) : ClickableMoreItem(
    imageResourceId = R.drawable.ic_baseline_linear_scale,
    titleId = R.string.simplify_menu_icons_title,
    subTitleId = R.string.default_menu_icons_sub_title,
    type = MoreItemType.MENU
)