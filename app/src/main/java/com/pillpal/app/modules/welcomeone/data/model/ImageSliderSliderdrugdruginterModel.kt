package com.pillpal.app.modules.welcomeone.`data`.model

import com.pillpal.app.R
import com.pillpal.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderdrugdruginterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrugdruginter: String? =
      MyApp.getInstance().resources.getString(R.string.msg_drug_drug_inter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckreaction: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_reaction)

)
