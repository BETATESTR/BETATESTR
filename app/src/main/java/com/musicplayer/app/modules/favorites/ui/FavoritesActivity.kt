package com.musicplayer.app.modules.favorites.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.base.BaseActivity
import com.musicplayer.app.databinding.ActivityFavoritesBinding
import com.musicplayer.app.modules.favorites.`data`.model.Favorites1RowModel
import com.musicplayer.app.modules.favorites.`data`.viewmodel.FavoritesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class FavoritesActivity : BaseActivity<ActivityFavoritesBinding>(R.layout.activity_favorites)
    {
  private val viewModel: FavoritesVM by viewModels<FavoritesVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Favorites1RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Favorites1RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.favoritesVM = viewModel
  }

  public companion object {
    public const val TAG: String = "FAVORITES_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoritesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
