import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class CustomAdapter(c: Context, spacecrafts: ArrayList<Spacecraft>) :
    BaseAdapter() {
    var c: Context
    var amenities: ArrayList<Amenity>
    override fun getCount(): Int {
        return amenities.size
    }

    override fun getItem(i: Int): Any {
        return amenities[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup?): View? {
        var view: View? = view
        if (view == null) {
            view = LayoutInflater.from(c).inflate(R.layout.model, viewGroup, false)
        }
        val s: Amenity = getItem(i) as Amenity
        val img: ImageView = view.findViewById(R.id.spacecraftImg) as ImageView
        val buttonLink = view.findViewById(R.id.nameTxt) as TextView

        //BIND
        nameTxt.setText(s.getName())
        propTxt.setText(s.getPropellant())
        img.setImageResource(s.getImage())
        view.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                Toast.makeText(c, s.getName(), Toast.LENGTH_SHORT).show()
            }
        })
        return view
    }

    init {
        this.c = c
        this.spacecrafts = spacecrafts
    }
}