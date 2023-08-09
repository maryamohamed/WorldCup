package com.maryam.worldcup.ui

import android.view.LayoutInflater
import com.maryam.worldcup.databinding.ActivitySearchBinding

class SearchActivity :BaseActivity<ActivitySearchBinding>(){
    override val LOG: String="SearchActivity"
    override val bindingInflater: (LayoutInflater) -> ActivitySearchBinding=ActivitySearchBinding::inflate
    override fun addCallBacks() {
    }

    override fun setup() {
    }


}
