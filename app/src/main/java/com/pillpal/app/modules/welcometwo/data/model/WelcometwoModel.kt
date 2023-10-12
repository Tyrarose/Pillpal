package com.pillpal.app.modules.welcometwo.`data`.model

import com.pillpal.app.R
import com.pillpal.app.appcomponents.di.MyApp
import kotlin.String

data class WelcometwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMedicationRemi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_medication_remi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemembertotak: String? =
      MyApp.getInstance().resources.getString(R.string.msg_remember_to_tak)

)
