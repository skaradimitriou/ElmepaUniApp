package com.stathis.elmepaunivapp.ui.main.department.model

import com.stathis.elmepaunivapp.abstraction.LocalModel

data class Research(val name : String ) : LocalModel {
    override fun equalsContent(obj: LocalModel): Boolean = false
}
