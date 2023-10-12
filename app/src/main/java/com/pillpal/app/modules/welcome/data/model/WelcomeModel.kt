package com.pillpal.app.modules.welcome.`data`.model

import com.pillpal.app.R
import com.pillpal.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_i_m_pillpal)

)
