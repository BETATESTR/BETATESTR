package com.musicplayer.app.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.base.BaseActivity
import com.musicplayer.app.databinding.ActivityHomePageBinding
import com.musicplayer.app.modules.homepage.`data`.model.HomePage1RowModel
import com.musicplayer.app.modules.homepage.`data`.viewmodel.HomePageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomePageActivity : BaseActivity<ActivityHomePageBinding>(R.layout.activity_home_page) {
  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: HomePage1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : HomePage1RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.homePageVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_PAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
