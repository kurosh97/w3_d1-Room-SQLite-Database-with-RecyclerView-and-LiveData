package com.example.roomdatabase_demo.fragment.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase_demo.R
import com.example.roomdatabase_demo.data.User
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: ArrayList<User> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.custom_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is UserViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(user: List<User>) {
        items = user as ArrayList<User>

    }


    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val userID: TextView = itemView.id_tv
        private val usersName: TextView = itemView.firstname_tv
        private val usersLastName: TextView = itemView.lastname_tv
        private val usersAge: TextView = itemView.tv_age

        fun bind(user: User) {
            userID.text = user.id.toString()
            usersName.text = user.firstName
            usersLastName.text = user.lastName
            usersAge.text = user.age.toString()
        }

    }


}