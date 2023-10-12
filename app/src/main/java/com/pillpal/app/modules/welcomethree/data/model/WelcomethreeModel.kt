package com.pillpal.app.modules.welcomethree.`data`.model

import com.pillpal.app.R
import com.pillpal.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomethreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrackyourdrug: String? =
      MyApp.getInstance().resources.getString(R.string.msg_track_your_drug)

)
