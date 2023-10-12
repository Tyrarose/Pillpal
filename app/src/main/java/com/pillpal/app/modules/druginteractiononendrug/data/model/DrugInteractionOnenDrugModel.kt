package com.pillpal.app.modules.druginteractiononendrug.`data`.model

import com.pillpal.app.R
import com.pillpal.app.appcomponents.di.MyApp
import kotlin.String

data class DrugInteractionOnenDrugModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_p_llpal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_add_drug_to_che)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtwodrugs: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_two_drugs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcetaminophen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_acetaminophen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_warning_if_no)

)
