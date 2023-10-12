package com.pillpal.app.modules.profiletwo.`data`.model

import com.pillpal.app.R
import com.pillpal.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_p_llpal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYung: String? = MyApp.getInstance().resources.getString(R.string.lbl_yung)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilly: String? = MyApp.getInstance().resources.getString(R.string.lbl_filly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAge: String? = MyApp.getInstance().resources.getString(R.string.lbl_age)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_28)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowNotificat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_allow_notificat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowNotificatOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_allow_banner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowNotificatTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sound)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowNotificatThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vibration)

)
