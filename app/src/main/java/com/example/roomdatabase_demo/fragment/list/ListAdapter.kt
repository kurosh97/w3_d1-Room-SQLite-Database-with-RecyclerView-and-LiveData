package com.example.roomdatabase_demo.fragment.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase_demo.R
import com.example.roomdatabase_demo.data.User
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.custom_row, parent, false)
        )
    }
    override fun getItemCount(): Int {
        return userList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.id_txt.text = currentItem.id.toString()
        holder.itemView.firstname_txt.text = currentItem.firstName.toString()
        holder.itemView.lastname_txt.text = currentItem.lastName.toString()
        holder.itemView.age_txt.text = currentItem.age.toString()
    }

    fun setData(user: List<User>) {
        this.userList = user
        notifyDataSetChanged()
    }
}