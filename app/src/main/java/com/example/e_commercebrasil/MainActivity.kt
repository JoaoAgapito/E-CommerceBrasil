package com.example.e_commercebrasil

import android.content.Intent
import android.os.Bundle
import android.provider.SyncStateContract
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var rvMain: RecyclerView
    private lateinit var btncart: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_EcommerceBrasil_NoActionBar)
        setContentView(R.layout.activity_main)



        val mainItems = mutableListOf<MainItem>()
        mainItems.add(
            MainItem(
                id = 1,
                drawableId = R.drawable.ic_xbox1,
                textString = R.string.title1,
                price = R.string.price1,
                color = R.color.cordefundo


            )

        )
        mainItems.add(
            MainItem(
                id = 2,
                drawableId = R.drawable.ic_playstation_5,
                textString = R.string.title2,
                price = R.string.price2,
                color = R.color.cordefundo


            )
        )



        val adapter = MainAdapter(mainItems){ id ->

                    when (id) {
                        1 -> {
                                val intent = Intent(this@MainActivity, MainActivityItem1::class.java)
                            startActivity(intent)
                        }
                        2 -> {
                            val intent = Intent(this@MainActivity, MainActivityItem2::class.java)
                            startActivity(intent)
                        }
                        3 -> {
                            val intent = Intent(this@MainActivity, MainActivityItem3::class.java)
                            startActivity(intent)
                        }
                        4 -> {
                            val intent = Intent(this@MainActivity, MainActivityItem4::class.java)
                            startActivity(intent)
                        }
                        5 -> {
                            val intent = Intent(this@MainActivity, MainActivityItem5::class.java)
                            startActivity(intent)
                        }
                        6 -> {
                            val intent = Intent(this@MainActivity, MainActivityItem6::class.java)
                            startActivity(intent)
                        }

                    }
        }
        rvMain = findViewById(R.id.rv_main)
        rvMain.adapter = adapter
        rvMain.layoutManager = LinearLayoutManager(this)


    }



    private inner class MainAdapter(
        private val mainItems: List<MainItem>,
       private val onItemClickerListener: (Int) -> Unit
    ) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

        // 1- Qual é o layout XML da celula especifica (item)
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
            val view = layoutInflater.inflate(R.layout.main_slot_item, parent, false)
            return MainViewHolder(view)

        }

        // 2- Disparado toda vez que houver uma rolagem na tela e for necessario trocar o conteudo da celula
        override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
            val itemCurrent = mainItems[position]
            holder.bind(itemCurrent)

        }

        // 3- informa quantas celulas essa listagem terá
        override fun getItemCount(): Int {
            return mainItems.size
        }

        private inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(item: MainItem) {
                val img: ImageView = itemView.findViewById(R.id.img_item)
                val name: TextView = itemView.findViewById(R.id.item_title)
                val price: TextView = itemView.findViewById(R.id.item_price)
                val container: LinearLayout = itemView.findViewById(R.id.container1)


                img.setImageResource(item.drawableId)
                name.setText(item.textString)
                price.setText(item.price)
                container.setBackgroundColor(item.color)

                container.setOnClickListener {
                    onItemClickerListener.invoke(item.id)

                }

            }

        }

    }


}