package com.latihan.kurirdirectoryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(
    private var daftarKurir: List<UserResponse>
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) { 
        val textViewName: TextView = itemView.findViewById(R.id.textViewName) 
        val textViewCompany: TextView = itemView.findViewById(R.id.textViewCompany) 
        val textViewEmail: TextView = itemView.findViewById(R.id.textViewEmail) 
        val textViewPhone: TextView = itemView.findViewById(R.id.textViewPhone) 
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder { 
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_kurir, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val kurir = daftarKurir[position]
        holder.textViewName.text = kurir.name
        holder.textViewCompany.text = "Perusahaan: ${kurir.company.companyName}"
        holder.textViewEmail.text = "Email: ${kurir.email}"
        holder.textViewPhone.text = "Telepon: ${kurir.phone}"
    }

    override fun getItemCount(): Int = daftarKurir.size

    // Metode untuk Memperbarui Data Hasil Pencarian Live
    fun perbaruiDaftar(daftarBaru: List<UserResponse>) {
        this.daftarKurir = daftarBaru
        notifyDataSetChanged()
    }
}
